package com.brainmentors.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import com.brainmentors.chatapp.dao.UserDAO;
import com.brainmentors.chatapp.dto.UserDTO;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserViewScreen extends JFrame {

	private JTextField user_id;
	private JPasswordField passwordField;

	public UserViewScreen()
	{
		setBackground(Color.RED);
		setTitle("Chat Application");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Chat Application");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 32));
		lblNewLabel.setBounds(230, 26, 563, 42);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter UserID");
		lblNewLabel_1.setFont(new Font("Adobe Heiti Std R", Font.BOLD, 25));
		lblNewLabel_1.setBounds(53, 163, 213, 50);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Adobe Heiti Std R", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(53, 284, 213, 50);
		getContentPane().add(lblNewLabel_1_1);
		
		user_id = new JTextField();
		user_id.setFont(new Font("Tahoma", Font.PLAIN, 24));
		user_id.setBounds(361, 157, 347, 50);
		getContentPane().add(user_id);
		user_id.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(361, 278, 347, 50);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
		btnNewButton.setBounds(114, 428, 285, 67);
		getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnRegister.setForeground(Color.RED);
		btnRegister.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(498, 428, 285, 67);
		getContentPane().add(btnRegister);
		setBounds(100, 100, 971, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	UserDAO userDAO = new UserDAO();
	private void register() {
		String userid = user_id.getText();
//		String password = passwordField.getText();
		char []password = passwordField.getPassword();
		UserDTO userDTO = new UserDTO(userid, password);
		try {
			int res = userDAO.register(userDTO);
			if(res > 0) {
				JOptionPane.showMessageDialog(this, "Registered Successfully...");
//				System.out.println("Registered Successfully...");
			}
			else {
				JOptionPane.showMessageDialog(this, "Registration Failed...");
//				System.out.println("Cannot Register...");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println("UserID : " + userid + " User Password : " + password.toString());
	}
	
	public void login() {
		String userid = user_id.getText();
		char []password = passwordField.getPassword();
		UserDTO userDTO = new UserDTO(userid, password);
		try {
			String message = "";
			if(userDAO.isLogin(userDTO)) {
				message = "Welcome : " + userid;
//				JOptionPane.showMessageDialog(this, message);
				System.out.println(message);
				setVisible(false);
				dispose();
				Dashboard dashboard = new Dashboard(message);
				dashboard.setVisible(true);
			}
			else {
				message = "Invalid UserId or Password...";
				System.out.println(message);
				JOptionPane.showMessageDialog(this, message);	
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UserViewScreen window = new UserViewScreen();
	}
}
