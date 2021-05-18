package nokiatela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class FrontEnd extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
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
	public FrontEnd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		
		JLabel layout = new JLabel("");
		layout.setBounds(0, 0, 212, 452);
		int a = getSize().height;
		int b = getSize().width;
		layout.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/layout.png")).getImage().getScaledInstance(b, a, Image.SCALE_SMOOTH)));
		contentPane.add(layout);
		layout.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		
		JLabel tela = new JLabel("Nokia");
		tela.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		tela.setFocusable(false);
		tela.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		tela.setHorizontalAlignment(SwingConstants.CENTER);
		tela.setBackground(new Color(0, 128, 0));
		tela.setBounds(44, 115, 118, 100);
		contentPane.add(tela);
		
		JButton btn_cancelar = new JButton("");
		btn_cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			BackEnd.apertarC();
			tela.setText("Nokia");
			}
		});
		btn_cancelar.setOpaque(false);
		btn_cancelar.setBorderPainted(false);
		btn_cancelar.setBounds(53, 241, 28, 23);
		contentPane.add(btn_cancelar);
		
		
		JButton btn_1 = new JButton("");
		btn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("1");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_1.setOpaque(false);
		btn_1.setBorderPainted(false);
		btn_1.setBounds(44, 286, 28, 23);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("");
		btn_2.setOpaque(false);
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("2");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}

		});
		btn_2.setBounds(89, 291, 28, 23);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("");
		btn_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("3");
				teste = Integer.parseInt(valor);
				tela.setText(valor);

			}
		});
		btn_3.setOpaque(false);
		btn_3.setBorderPainted(false);
		btn_3.setBounds(134, 286, 28, 23);
		contentPane.add(btn_3);
		
		JButton btn_5 = new JButton("");
		btn_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("5");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		
		JButton btn_4 = new JButton("");
		btn_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("4");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_4.setOpaque(false);
		btn_4.setBorderPainted(false);
		btn_4.setBounds(47, 316, 28, 23);
		contentPane.add(btn_4);
		btn_5.setOpaque(false);
		btn_5.setBorderPainted(false);
		btn_5.setBounds(90, 322, 28, 23);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("");
		btn_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("6");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_6.setOpaque(false);
		btn_6.setBorderPainted(false);
		btn_6.setBounds(134, 315, 28, 23);
		contentPane.add(btn_6);
		
		JButton btn_7 = new JButton("");
		btn_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("7");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_7.setOpaque(false);
		btn_7.setBorderPainted(false);
		btn_7.setBounds(48, 346, 28, 23);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("");
		btn_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("8");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_8.setOpaque(false);
		btn_8.setBorderPainted(false);
		btn_8.setBounds(90, 352, 28, 23);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("");
		btn_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("9");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_9.setOpaque(false);
		btn_9.setBorderPainted(false);
		btn_9.setBounds(131, 345, 28, 23);
		contentPane.add(btn_9);
		
		JButton btn_asteristico = new JButton("");
		btn_asteristico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("10");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_asteristico.setOpaque(false);
		btn_asteristico.setBorderPainted(false);
		btn_asteristico.setBounds(49, 377, 28, 23);
		contentPane.add(btn_asteristico);
		
		JButton btn_0 = new JButton("");
		btn_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("0");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_0.setOpaque(false);
		btn_0.setBorderPainted(false);
		btn_0.setBounds(91, 382, 28, 23);
		contentPane.add(btn_0);
		
		JButton btn_jogoveia = new JButton("");
		btn_jogoveia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				valor = valor.concat("12");
				teste = Integer.parseInt(valor);
				tela.setText(valor);
			}
		});
		btn_jogoveia.setOpaque(false);
		btn_jogoveia.setBorderPainted(false);
		btn_jogoveia.setBounds(130, 375, 28, 23);
		contentPane.add(btn_jogoveia);
		
		JButton btn_enter = new JButton("");
		btn_enter.setOpaque(false);
		btn_enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BackEnd.ApertarEnter();
				tela.setText(BackEnd.frase);
			

			}
		});
		btn_enter.setBounds(73, 227, 59, 23);
		contentPane.add(btn_enter);
	

	}
	//variaveis
	public static String valor = "";
	public static int teste = 0;
}
