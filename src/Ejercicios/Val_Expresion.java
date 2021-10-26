package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Val_Expresion extends JFrame {

	private JPanel contentPane;
	private JTextField txtValidarTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Val_Expresion frame = new Val_Expresion();
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
	public Val_Expresion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtValidarTexto = new JTextField();
		txtValidarTexto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnSalir = new JButton("Salir");
		
		 JLabel lblResultado = new JLabel("   ");
		lblResultado.setVisible(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addComponent(txtValidarTexto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addComponent(btnAceptar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir)
							.addGap(38)
							.addComponent(lblResultado)))
					.addContainerGap(162, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(txtValidarTexto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptar)
						.addComponent(btnSalir)
						.addComponent(lblResultado))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stack<String> strPila = new Stack<String>();
				String strExpresion = txtValidarTexto.getText();
				char chrCaracter;
				int error=0;
				for (int i=0;i<strExpresion.length();i++)
				{
					chrCaracter=strExpresion.charAt(i);
					if(chrCaracter=='(')
					{
						strPila.push("AbreParentesis");
					}
					if(chrCaracter==')')
					{
						if(strPila.empty())
						{
							error=0;
							break;
						}
						else
						{
							strPila.pop();
						}
					}
					
				}
				if(strPila.empty() && error==0)
				{
					JOptionPane.showMessageDialog(null, "Expresion correcta");
				}
				else
					JOptionPane.showMessageDialog(null, "Expresion incorrecta");
			}
		});
		

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
	}
}
