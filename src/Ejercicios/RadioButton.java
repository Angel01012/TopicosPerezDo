package Ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Font;

public class RadioButton extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	static int x=0;
	static double Calificacion=0;
	static String R="";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio RadioButton\r\n");
		setBounds(100, 100, 612, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPregunta = new JLabel("Pregunta 1");
		lblPregunta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPregunta.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Seleccione la opcion Correcta", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLACK));
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setVisible(false);

		
		JButton btnSiguiente = new JButton("Siguiente");

		btnSiguiente.setVisible(false);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPregunta.setVisible(true);
				lblPregunta.setText("La plataforma Java se ofrece para descarga en diferentes ediciones:");
				panel.setVisible(true);
				btnAnterior.setVisible(true);
				btnAnterior.setEnabled(false);
				btnSiguiente.setVisible(true);
				btnIniciar.setVisible(false);
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setVisible(false);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPregunta)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAnterior)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnIniciar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSiguiente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFinalizar))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(202, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(lblPregunta)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnterior)
						.addComponent(btnIniciar)
						.addComponent(btnSiguiente)
						.addComponent(btnSalir)
						.addComponent(btnFinalizar))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		
		JRadioButton rdbOpcion1 = new JRadioButton("Oracle JDK, OpenJDK \n");
		rdbOpcion1.setSelected(false);
		
		JRadioButton rdbOpcion2 = new JRadioButton("JSE, JEE, JME \n");
		rdbOpcion2.setSelected(false);
		
		JRadioButton rdbOpcion3 = new JRadioButton("JRE, JDK, JVM \n");
		rdbOpcion3.setSelected(false);
		
		contentPane.setLayout(gl_contentPane);
		
		
		ButtonGroup btnGroup=new ButtonGroup();
		btnGroup.add(rdbOpcion1);
		btnGroup.add(rdbOpcion2);
		btnGroup.add(rdbOpcion3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbOpcion3)
						.addComponent(rdbOpcion2)
						.addComponent(rdbOpcion1))
					.addGap(62))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(rdbOpcion1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbOpcion2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbOpcion3)
					.addGap(33))
		);
		panel.setLayout(gl_panel);
		// 		rdbOpcion1.clearSection()
		btnGroup.clearSelection();
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGroup.setSelected(btnGroup.getSelection(), false);
				while(x<5)
				{
					if(x==0)
					{
						if(rdbOpcion2.isSelected())
						{
							Calificacion=+20;
						}
						lblPregunta.setText("El lenguaje de programación Java es:");
						rdbOpcion1.setText("Multiplataforma, Multiparadigma y Tipos Dinámicos");
						rdbOpcion2.setText("Multiplataforma, Orientado a Objetos y Tipos Dinámicos");
						rdbOpcion3.setText("Multiplataforma, Orientado a Objetos y Tipos Estáticos");
						x++;
						btnGroup.setSelected(btnGroup.getSelection(), false);
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						break;
					}
					if(x==1)
					{
						if(rdbOpcion3.isSelected())
						{
							Calificacion=+20;
						}
						lblPregunta.setText("Las versiones de Java que se denominan LTS: ");
						rdbOpcion1.setText("Ya no se actualizarán cuando salga la próxima versión");
						rdbOpcion2.setText("Recibirán soporte a largo plazo");
						rdbOpcion3.setText("Son de paga");
						x++;
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==2)
					{
						if(rdbOpcion2.isSelected())
						{
							Calificacion+=20;
						}
						lblPregunta.setText("Actualmente Oracle libera una nueva versiön de Java cada:");
						rdbOpcion1.setText("Cada Mes");
						rdbOpcion2.setText("Cada 3 meses");
						rdbOpcion3.setText("Cada 6 meses");
						x++;
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==3)
					{
						if(rdbOpcion3.isSelected())
						{
							Calificacion+=20;
						}
						lblPregunta.setText("Si deseamos solamente ejecutar aplicaciones para la plataforma Java, necesitaremos instalar el: ");
						rdbOpcion1.setText("JVM");
						rdbOpcion2.setText("JRE");
						rdbOpcion3.setText("JDK");
						x++;
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==4)
					{
						if(rdbOpcion2.isSelected())
						{
							Calificacion+=20;
						}
						lblPregunta.setText("Si deseamos desarrollar aplicaciones en Java, deberemos instalar el ");
						rdbOpcion1.setText("JVM");
						rdbOpcion2.setText("JSE");
						rdbOpcion3.setText("JDK");
						x++;
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						btnFinalizar.setVisible(true);
						btnSiguiente.setEnabled(false);
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
				}
			}
		});
		
		
		

		
		
		
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(x<5)
				{
					x--;
					if(x==0)
					{

						lblPregunta.setText("La plataforma Java se ofrece para descarga en diferentes ediciones:");
						rdbOpcion1.setText("Oracle JDK, OpenJDK");
						rdbOpcion2.setText("JSE, JEE, JME");
						rdbOpcion3.setText("JRE, JDK, JVM");
						
						btnGroup.setSelected(btnGroup.getSelection(), false);
						btnAnterior.setEnabled(false);
						btnGroup.clearSelection();
						break;
					}
					if(x==1)
					{

						lblPregunta.setText("El lenguaje de programación Java es:");
						rdbOpcion1.setText("Multiplataforma, Multiparadigma y Tipos Dinámicos");
						rdbOpcion2.setText("Multiplataforma, Orientado a Objetos y Tipos Dinámicos");
						rdbOpcion3.setText("Multiplataforma, Orientado a Objetos y Tipos Estáticos");
						
						btnGroup.setSelected(btnGroup.getSelection(), false);
						btnAnterior.setEnabled(true);
						btnGroup.clearSelection();
						break;
					}
					if(x==2)
					{
						lblPregunta.setText("Las versiones de Java que se denominan LTS: ");
						rdbOpcion1.setText("Ya no se actualizarán cuando salga la próxima versión");
						rdbOpcion2.setText("Recibirán soporte a largo plazo");
						rdbOpcion3.setText("Son de paga");
						
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==3)
					{

						lblPregunta.setText("Actualmente Oracle libera una nueva versiön de Java cada:");
						rdbOpcion1.setText("Cada Mes");
						rdbOpcion2.setText("Cada 3 meses");
						rdbOpcion3.setText("Cada 6 meses");
						
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==4)
					{
						lblPregunta.setText("Si deseamos solamente ejecutar aplicaciones para la plataforma Java, necesitaremos instalar el: ");
						rdbOpcion1.setText("JVM");
						rdbOpcion2.setText("JRE");
						rdbOpcion3.setText("JDK");
						
						btnGroup.clearSelection();
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
					if(x==5)
					{
						lblPregunta.setText("Si deseamos desarrollar aplicaciones en Java, deberemos instalar el ");
						rdbOpcion1.setText("JVM");
						rdbOpcion2.setText("JSE");
						rdbOpcion3.setText("JDK");
						
						btnGroup.clearSelection();
						btnFinalizar.setVisible(true);
						btnSiguiente.setEnabled(false);
						btnGroup.setSelected(btnGroup.getSelection(), false);
						break;
					}
				}
				
			}
		});
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x==5)
				{
					if(rdbOpcion3.isSelected())
					{
						Calificacion+=20;
					}
				}
				R+=Calificacion;
				btnFinalizar.setEnabled(false);
				btnAnterior.setEnabled(false);
				JOptionPane.showMessageDialog(null, R);
			}
		});
		
	}
}
