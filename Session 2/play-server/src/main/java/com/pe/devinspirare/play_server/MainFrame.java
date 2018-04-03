package com.pe.devinspirare.play_server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 573);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJuegoDeGuerrasa = new JLabel("JUEGO DE GUERRAS");
		lblJuegoDeGuerrasa.setOpaque(true);
		lblJuegoDeGuerrasa.setBackground(Color.ORANGE);
		lblJuegoDeGuerrasa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJuegoDeGuerrasa.setForeground(Color.RED);
		lblJuegoDeGuerrasa.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuegoDeGuerrasa.setBounds(0, 0, 776, 34);
		contentPane.add(lblJuegoDeGuerrasa);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SUITE\\Desktop\\tato\\play-server\\src\\main\\resources\\descarga.jfif"));
		lblNewLabel.setBounds(278, 30, 239, 214);
		contentPane.add(lblNewLabel);
		
		JButton btnAgregarSoldado = new JButton("Agregar Soldado");
		btnAgregarSoldado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAgregarSoldado.setBounds(28, 98, 136, 23);
		contentPane.add(btnAgregarSoldado);
	}
}
