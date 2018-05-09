package ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface02 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLegajo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface02 frame = new Interface02();
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
	public Interface02() {
		setTitle("Registrar ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeTicket = new JLabel("Numero de ticket:");
		lblNumeroDeTicket.setBounds(52, 50, 113, 14);
		contentPane.add(lblNumeroDeTicket);
		
		JLabel lblNumeroDeLegajo = new JLabel("Numero de Legajo:");
		lblNumeroDeLegajo.setBounds(52, 86, 113, 14);
		contentPane.add(lblNumeroDeLegajo);
		
		JLabel lblClasificacionDeTicket = new JLabel("Clasificacion de ticket:");
		lblClasificacionDeTicket.setBounds(52, 123, 113, 14);
		contentPane.add(lblClasificacionDeTicket);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cancelar cancelar1=new Cancelar();
				cancelar1.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(356, 389, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(480, 389, 89, 23);
		contentPane.add(btnNewButton);
		
		txtLegajo = new JTextField();
		txtLegajo.setBounds(204, 83, 365, 20);
		contentPane.add(txtLegajo);
		txtLegajo.setColumns(10);
		
		JLabel lblDescripcionDelProblema = new JLabel("Descripcion del problema:");
		lblDescripcionDelProblema.setBounds(52, 157, 147, 17);
		contentPane.add(lblDescripcionDelProblema);
		
		JComboBox comboBoxClasificacion = new JComboBox();
		comboBoxClasificacion.setModel(new DefaultComboBoxModel(new String[] {"Cambios de Configuraci\u00F3n de SO de PC", "Problemas en el funcionamiento del SO y utilitarios.", "Solicitud de instalaci\u00F3n de aplicaciones.", "Mal funcionamiento de Hardware", "Problemas en la autenticaci\u00F3n en los distintos sistemas.", "Problemas de acceso a la red local o remota.", "Solicitud de usuarios de red.", "Solicitud de usuarios para Sistemas que utiliza la empresa", "Modificaci\u00F3n en los perfiles de usuarios.", "Solicitud de Cambio de Contrase\u00F1as.", "Problemas en los Sistemas de la empresa.", "Problemas con el correo electr\u00F3nico.", "Solicitud de cuentas de correo electr\u00F3nico.", "Solicitud de nuevos puestos de trabajo.", "Soporte en el uso de alguna aplicaci\u00F3n o sistema", "Otros"}));
		comboBoxClasificacion.setBounds(204, 120, 365, 20);
		contentPane.add(comboBoxClasificacion);
		
		JTextArea txtrDescripcion = new JTextArea();
		txtrDescripcion.setToolTipText("");
		txtrDescripcion.setLineWrap(true);
		txtrDescripcion.setBounds(204, 153, 365, 163);
		contentPane.add(txtrDescripcion);
		
		JLabel lblFechaDeApertura = new JLabel("Fecha de apertura:");
		lblFechaDeApertura.setBounds(52, 338, 113, 14);
		contentPane.add(lblFechaDeApertura);
		
		JLabel lblFechaDeCierre = new JLabel("Hora de apertura:");
		lblFechaDeCierre.setBounds(52, 363, 106, 14);
		contentPane.add(lblFechaDeCierre);
	}
}
