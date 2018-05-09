package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cancelar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cancelar frame = new Cancelar();
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
	public Cancelar() {
		setTitle("Cancelar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblestaSeguroQue = new JLabel("\u00BFEsta seguro que desea cancelar?");
		lblestaSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
		lblestaSeguroQue.setBounds(90, 11, 195, 14);
		contentPane.add(lblestaSeguroQue);
		
		JButton btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface01 home=new Interface01();
				home.setVisible(true);
				dispose();
			}
		});
		btnSi.setBounds(90, 64, 89, 23);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface02 registro1= new Interface02();
				registro1.setVisible(true);
				dispose();
			}
		});
		btnNo.setBounds(196, 64, 89, 23);
		contentPane.add(btnNo);
	}

}
