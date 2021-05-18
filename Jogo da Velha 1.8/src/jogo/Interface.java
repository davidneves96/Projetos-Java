package jogo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField txtJogadorUm;
	private JTextField txtJogadorDois;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
					frame.setName("JOGO DA VELHAAAA");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setTitle("JOGO DA VELHAA!!!");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 112, 291, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitul = new JLabel("");
		lblTitul.setForeground(Color.GREEN);
		lblTitul.setBackground(Color.GREEN);
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitul.setBounds(9, 112, 259, 23);
		contentPane.add(lblTitul);
		
		JLabel lblEscolhaJogUm = new JLabel("X");
		lblEscolhaJogUm.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaJogUm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEscolhaJogUm.setBounds(82, 47, 16, 19);
		contentPane.add(lblEscolhaJogUm);
		
		JLabel lblEscolhaJogDois = new JLabel("O");
		lblEscolhaJogDois.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaJogDois.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEscolhaJogDois.setBounds(82, 77, 16, 19);
		contentPane.add(lblEscolhaJogDois);
		
		JLabel lblPontosUm = new JLabel("");
		lblPontosUm.setForeground(Color.GREEN);
		lblPontosUm.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPontosUm.setBounds(182, 47, 99, 19);
		contentPane.add(lblPontosUm);
		
		JLabel lblPontosDois = new JLabel("");
		lblPontosDois.setForeground(Color.GREEN);
		lblPontosDois.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPontosDois.setBounds(182, 77, 99, 19);
		contentPane.add(lblPontosDois);
		
		JLabel lblVencedor = new JLabel("");
		lblVencedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVencedor.setBounds(122, 344, 54, 14);
		contentPane.add(lblVencedor);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblImagem.setIcon(new ImageIcon(Interface.class.getResource("/imagens/trofeu.png")));
		lblImagem.setBounds(0, 112, 291, 294);
		contentPane.add(lblImagem);
		
		txtJogadorUm = new JTextField();
		txtJogadorUm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtJogadorUm.setFocusable(true);
			}
		});
		txtJogadorUm.setFocusable(false);
		txtJogadorUm.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtJogadorUm.setText("Jogador 1:");
		txtJogadorUm.setBounds(10, 47, 68, 19);
		contentPane.add(txtJogadorUm);
		txtJogadorUm.setColumns(10);
		
		txtJogadorDois = new JTextField();
		txtJogadorDois.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtJogadorDois.setFocusable(true);
			}
		});
		txtJogadorDois.setFocusable(false);
		txtJogadorDois.setText("Jogador 2:");
		txtJogadorDois.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtJogadorDois.setColumns(10);
		txtJogadorDois.setBounds(10, 78, 68, 19);
		contentPane.add(txtJogadorDois);
		
		JLabel lblVelhinha = new JLabel("");
		lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovobalosa.jpg")));
		lblVelhinha.setBounds(0, 0, 291, 111);
		contentPane.add(lblVelhinha);
		
		
		
		JButton btn1 = new JButton("");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn1.getText()== "X" || btn1.getText() == "O") {
				lblTitul.setText("Escolha outro lugar para jogar!!!");
				}
				else
					if (btn1.getText() == "" && BackEnd.jogador == 1) {
						BackEnd.jogando1();
						btn1.setText(BackEnd.letra);
						BackEnd.grid[0][0]=BackEnd.letra;
						BackEnd.ganhar();
						if (BackEnd.ganhou == true) {
							lblTitul.setText("Parabéns!!! Você Ganhou!!!");
							lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
							lblVencedor.setText(txtJogadorUm.getText());
							panel.setVisible(false);
							lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
						}
					}
					else
						if (btn1.getText() == "" && BackEnd.jogador == 2) {
							BackEnd.jogando2();
							btn1.setText(BackEnd.letra);
							BackEnd.grid[0][0]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
								lblVencedor.setText(txtJogadorDois.getText());
								panel.setVisible(false);
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
			}
		});
		btn1.setBounds(10, 11, 80, 80);
		panel.add(btn1);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn2 = new JButton("");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn2.getText()== "X" || btn2.getText() == "O") {
				lblTitul.setText("Escolha outro lugar para jogar!!!");
				}
				else
					if (btn2.getText() == "" && BackEnd.jogador == 1) {
						BackEnd.jogando1();
						btn2.setText(BackEnd.letra);
						BackEnd.grid[0][1]=BackEnd.letra;
						BackEnd.ganhar();
						if (BackEnd.ganhou == true) {
							lblTitul.setText("Parabéns!!! Você Ganhou!!!");
							lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
							lblVencedor.setText(txtJogadorUm.getText());
							panel.setVisible(false);
							lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
						}
					}
					else
						if (btn2.getText() == "" && BackEnd.jogador == 2) {
							BackEnd.jogando2();
							btn2.setText(BackEnd.letra);
							BackEnd.grid[0][1]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
								lblVencedor.setText(txtJogadorDois.getText());
								panel.setVisible(false);
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
			}
		});
		btn2.setBounds(100, 11, 80, 80);
		panel.add(btn2);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn3 = new JButton("");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn3.getText()== "X" || btn3.getText() == "O") {
				lblTitul.setText("Escolha outro lugar para jogar!!!");
				}
				else
					if (btn3.getText() == "" && BackEnd.jogador == 1) {
						BackEnd.jogando1();
						btn3.setText(BackEnd.letra);
						BackEnd.grid[0][2]=BackEnd.letra;
						BackEnd.ganhar();
						if (BackEnd.ganhou == true) {
							lblTitul.setText("Parabéns!!! Você Ganhou!!!");
							lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
							lblVencedor.setText(txtJogadorUm.getText());
							panel.setVisible(false);
							lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
						}
					}
					else
						if (btn3.getText() == "" && BackEnd.jogador == 2) {
							BackEnd.jogando2();
							btn3.setText(BackEnd.letra);
							BackEnd.grid[0][2]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
								lblVencedor.setText(txtJogadorDois.getText());
								panel.setVisible(false);
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
			}
		});
		btn3.setBounds(190, 11, 80, 80);
		panel.add(btn3);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn4 = new JButton("");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn4.getText()== "X" || btn4.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn4.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn4.setText(BackEnd.letra);
							BackEnd.grid[1][0]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);	
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn4.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn4.setText(BackEnd.letra);
								BackEnd.grid[1][0]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
				}
		});
		btn4.setBounds(10, 102, 80, 80);
		panel.add(btn4);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn5 = new JButton("");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn5.getText()== "X" || btn5.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn5.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn5.setText(BackEnd.letra);
							BackEnd.grid[1][1]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn5.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn5.setText(BackEnd.letra);
								BackEnd.grid[1][1]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
			}
		});
		btn5.setBounds(100, 102, 80, 80);
		panel.add(btn5);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn6 = new JButton("");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn6.getText()== "X" || btn6.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn6.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn6.setText(BackEnd.letra);
							BackEnd.grid[1][2]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);		
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn6.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn6.setText(BackEnd.letra);
								BackEnd.grid[1][2]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
			}
		});
		btn6.setBounds(190, 102, 80, 80);
		panel.add(btn6);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn7 = new JButton("");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn7.getText()== "X" || btn7.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn7.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn7.setText(BackEnd.letra);
							BackEnd.grid[2][0]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);	
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn7.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn7.setText(BackEnd.letra);
								BackEnd.grid[2][0]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
			}
		});
		btn7.setBounds(10, 193, 80, 80);
		panel.add(btn7);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn8 = new JButton("");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn8.getText()== "X" || btn8.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn8.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn8.setText(BackEnd.letra);
							BackEnd.grid[2][1]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);	
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn8.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn8.setText(BackEnd.letra);
								BackEnd.grid[2][1]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
			}
		});
		btn8.setBounds(100, 193, 80, 80);
		panel.add(btn8);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btn9 = new JButton("");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btn9.getText()== "X" || btn9.getText() == "O") {
					lblTitul.setText("Escolha outro lugar para jogar!!!");
					}
					else
						if (btn9.getText() == "" && BackEnd.jogador == 1) {
							BackEnd.jogando1();
							btn9.setText(BackEnd.letra);
							BackEnd.grid[2][2]=BackEnd.letra;
							BackEnd.ganhar();
							if (BackEnd.ganhou == true) {
								lblTitul.setText("Parabéns!!! Você Ganhou!!!");
								lblPontosUm.setText(Integer.toString(BackEnd.ganho1));
								lblVencedor.setText(txtJogadorUm.getText());
								panel.setVisible(false);	
								lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
							}
						}
						else
							if (btn9.getText() == "" && BackEnd.jogador == 2) {
								BackEnd.jogando2();
								btn9.setText(BackEnd.letra);
								BackEnd.grid[2][2]=BackEnd.letra;
								BackEnd.ganhar();
								if (BackEnd.ganhou == true) {
									lblTitul.setText("Parabéns!!! Você Ganhou!!!");
									lblPontosDois.setText(Integer.toString(BackEnd.ganho2));
									lblVencedor.setText(txtJogadorDois.getText());
									panel.setVisible(false);
									lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovofeliz.jpg")));
								}
							}
			}
		});
		btn9.setBounds(190, 193, 80, 80);
		panel.add(btn9);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JButton btnDenovo = new JButton("Reiniciar");
		btnDenovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BackEnd.resetar();
				panel.setVisible(true);
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				lblVelhinha.setIcon(new ImageIcon(Interface.class.getResource("/imagens/vovobalosa.jpg")));
			}
		});
		btnDenovo.setBounds(9, 397, 260, 23);
		contentPane.add(btnDenovo);
		btnDenovo.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		


	}

}
