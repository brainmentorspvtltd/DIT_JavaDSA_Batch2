package com.brainmentors.chatapp.views;

import java.awt.Font;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame {
	int counter;
	public UserView() {
		counter = 0;
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Chat Application");
//		setLocation(400,100);
		setLocationRelativeTo(null);
		
		JLabel title = new JLabel("Welcome to Chat App...");
		title.setFont(new Font("Arial", Font.BOLD,32));
		title.setBounds(100,10,500,40);
		
		JLabel login = new JLabel("Login...");
		login.setFont(new Font("Arial", Font.BOLD,30));
		login.setBounds(100,80,150,35);
		
		JLabel counterLabel = new JLabel("");
		counterLabel.setFont(new Font("Arial", Font.BOLD,30));
		counterLabel.setBounds(300,200,150,35);
		
		JButton button = new JButton("Increment");
		button.setBounds(100,300,100,30);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				counter++;
				counterLabel.setText("Count : " + counter);
			}
		});
		
		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(title);
		container.add(login);
		container.add(button);	
		container.add(counterLabel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserView userview = new UserView();
		UserView uv = userview;
	}

}
