package com.brainmentors.chatapp.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Dashboard(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle(message);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(164, 6, 640, 448);
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/assets/dashboard_img.png")));
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(6, 0, 132, 22);
		contentPane.add(menuBar);
		
//		JMenuBar menuBar = new JMenuBar();
//		setJMenuBar(menuBar);

		JMenu mnMove = new JMenu("Chat options");
		menuBar.add(mnMove);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Start Chat");
		mnMove.add(mntmNewMenuItem);
		
		
	}
}
