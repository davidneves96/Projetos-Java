package contadorDeNumeros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ContadorInterface extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorInterface frame = new ContadorInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	//variaveis
	public int contador = 0;
	//variaveis
	
	/**
	 * Create the frame.
	 */
	public ContadorInterface() {
		setTitle("Contador");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JButton btnContador = new JButton("0");
		btnContador.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		btnContador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador += 1;
				btnContador.setText(String.valueOf(contador));
		
			}
		});
		contentPane.add(btnContador, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Resetar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador = 0;
				btnContador.setText(String.valueOf(contador));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}


	
}
