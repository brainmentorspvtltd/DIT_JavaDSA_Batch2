package com.brainmentors.chatapp.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

//Thread = Worker
//Worker need work/job
//For job we need to implement Runnable Interface

//public class ServerWorker implements Runnable {


public class ServerWorker extends Thread {
	
	private Socket clientSocket;
	private InputStream in;
	private OutputStream out;
	private Server server;
	
	public ServerWorker(Socket clienSocket, Server server) throws IOException {
		this.clientSocket = clienSocket;
		in = clientSocket.getInputStream();
		out = clientSocket.getOutputStream();
		this.server = server;
		
	}
	
	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		while(true) {
			try {
				line = br.readLine();
				if(line.equalsIgnoreCase("quit")) {
					break;
				}
//				out.write(line.getBytes());
				for(ServerWorker serverWorker : server.workers) {
					serverWorker.out.write(line.getBytes());
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				break;
			}
			
			finally {
				try {
					if(br != null) {
						br.close();
					}
					
					if(in != null) {
						in.close();
					}
					
					if(out != null) {
						out.close();
					}
					
					if(clientSocket != null) {
						clientSocket.close();
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}






/*
public class ServerWorker extends Thread {
	
	@Override
	public void run() {
//		job to be done
		for(int i = 0; i <= 5; i++) {
			System.out.println("Thread Running : " + i + " " + Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ServerWorker worker = new ServerWorker();
		worker.start();
//		Thread worker = new Thread(job);
//		worker.start();		// internally it will call run()
		
		for(int j = 0; j <= 5; j++) {
			System.out.println("Main Thread : " + j + " " + Thread.currentThread());
		}
	}

}
*/


