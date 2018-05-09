package ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Interface01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface01 frame = new Interface01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface01() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistrarTicket = new JButton("Registrar ticket");
		btnRegistrarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Interface02 registro1=new Interface02();
				registro1.setVisible(true);
				dispose();
			}
		});
		btnRegistrarTicket.setBounds(129, 81, 192, 23);
		contentPane.add(btnRegistrarTicket);
		
		JButton btnConsultarTicket = new JButton("Consultar ticket");
		btnConsultarTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConsultarTicket.setBounds(129, 115, 192, 23);
		contentPane.add(btnConsultarTicket);
		
		JButton btnModificarEstadoDe = new JButton("Modificar estado de ticket");
		btnModificarEstadoDe.setBounds(129, 149, 192, 23);
		contentPane.add(btnModificarEstadoDe);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblLaLlamita = new JLabel("La llamita - Home");
		lblLaLlamita.setFont(new Font("Algerian", Font.PLAIN, 25));
		lblLaLlamita.setBounds(104, 11, 240, 30);
		contentPane.add(lblLaLlamita);
		
	}
	
}
