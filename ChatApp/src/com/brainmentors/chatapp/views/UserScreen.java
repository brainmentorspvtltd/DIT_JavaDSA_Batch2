package com.brainmentors.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserScreen extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	public UserScreen() {
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(361, 157, 347, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(361, 278, 347, 50);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
		btnNewButton.setBounds(114, 428, 285, 67);
		getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
		btnRegister.setBackground(Color.RED);
		btnRegister.setBounds(498, 428, 285, 67);
		getContentPane().add(btnRegister);
		setBounds(100, 100, 971, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		UserScreen window = new UserScreen();
	}
	
}
