package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrontEnd extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNota5;
	private JTextField txtNota6;
	private JLabel lblNewLabel_1;
	private JTextField txtNotaProva;
	private JLabel lblNotaDaProva;

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
		setTitle("C\u00E1lculo de M\u00E9dia da Nassau");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota1.selectAll();
			}
		});
		txtNota1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota1.setText("Unidade 1");
		txtNota1.setBounds(14, 61, 134, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		txtNota1.selectAll();
		
		txtNota2 = new JTextField();
		txtNota2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota2.selectAll();
			}
		});
		txtNota2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota2.setText("Unidade 2");
		txtNota2.setColumns(10);
		txtNota2.setBounds(14, 92, 134, 20);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota3.selectAll();
			}
		});
		txtNota3.setText("Unidade 3");
		txtNota3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota3.setColumns(10);
		txtNota3.setBounds(14, 123, 134, 20);
		contentPane.add(txtNota3);
		
		txtNota4 = new JTextField();
		txtNota4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota4.selectAll();
			}
		});
		txtNota4.setText("Unidade 4");
		txtNota4.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota4.setColumns(10);
		txtNota4.setBounds(14, 157, 134, 20);
		contentPane.add(txtNota4);
		
		txtNota5 = new JTextField();
		txtNota5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota5.selectAll();
			}
		});
		txtNota5.setText("Atividade Colaborativa");
		txtNota5.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota5.setColumns(10);
		txtNota5.setBounds(14, 188, 134, 20);
		contentPane.add(txtNota5);
		
		txtNota6 = new JTextField();
		txtNota6.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNota6.selectAll();
			}
		});
		txtNota6.setText("Atividade Contextualizada");
		txtNota6.setColumns(10);
		txtNota6.setBounds(14, 219, 134, 20);
		contentPane.add(txtNota6);
		
		JLabel lblNotaDasAtividades = new JLabel("Notas das Atividades:");
		lblNotaDasAtividades.setToolTipText("");
		lblNotaDasAtividades.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNotaDasAtividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaDasAtividades.setBounds(5, 14, 155, 39);
		contentPane.add(lblNotaDasAtividades);
		
		lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(198, 92, 46, 85);
		contentPane.add(lblNewLabel_1);
		
		txtNotaProva = new JTextField();
		txtNotaProva.setHorizontalAlignment(SwingConstants.CENTER);
		txtNotaProva.setColumns(10);
		txtNotaProva.setBounds(278, 123, 134, 20);
		contentPane.add(txtNotaProva);
		
		lblNotaDaProva = new JLabel("Nota da Prova:");
		lblNotaDaProva.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaDaProva.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNotaDaProva.setBounds(268, 81, 155, 39);
		contentPane.add(lblNotaDaProva);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedia.setBounds(306, 175, 81, 62);
		contentPane.add(lblMedia);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(305, 152, 81, 26);
		contentPane.add(lblStatus);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtNota1.getText().matches("[-+]?\\d*\\.?\\d*"))
				BackEnd.nota[0] = Float.valueOf(txtNota1.getText());
				else
					BackEnd.nota[0] = 0.0f;
				
				if (txtNota2.getText().matches("[-+]?\\d*\\.?\\d*"))
				BackEnd.nota[1] = Float.valueOf(txtNota2.getText());
				else
					BackEnd.nota[1] = 0.0f;
				
				if (txtNota3.getText().matches("[-+]?\\d*\\.?\\d*"))
				BackEnd.nota[2] = Float.valueOf(txtNota3.getText());
				else
					BackEnd.nota[2] = 0.0f;
				
				if (txtNota4.getText().matches("[-+]?\\d*\\.?\\d*"))
				BackEnd.nota[3] = Float.valueOf(txtNota4.getText());
				else
					BackEnd.nota[3] = 0.0f;
				
				if (txtNota5.getText().matches("[-+]?\\d*\\.?\\d*"))
				BackEnd.nota[4] = Float.valueOf(txtNota5.getText());
				else
					BackEnd.nota[4] = 0.0f;
				
				if (txtNota6.getText().matches("[-+]?\\d*\\.?\\d*"))
					BackEnd.nota[5] = Float.valueOf(txtNota6.getText());
				else
					BackEnd.nota[5] = 0.0f;
				
				
				
				if (txtNotaProva.getText().matches("[-+]?\\d*\\.?\\d+") || txtNotaProva.getText() == null)
					BackEnd.mediaAv2 = Float.valueOf(txtNotaProva.getText());
				else
					BackEnd.mediaAv2 = 0.0f;
					
				BackEnd.calcular();
				
				if(BackEnd.media >= 7) {
					lblStatus.setText("Aprovado:");
					lblStatus.setForeground(Color.green);
					lblMedia.setText(String.valueOf((Math.round(BackEnd.media*100.0)/100.0)));
					lblMedia.setForeground(Color.green);
					}
					else {
					lblStatus.setText("Reprovado:");
					lblStatus.setForeground(Color.red);
					lblMedia.setText(String.valueOf((Math.round(BackEnd.media*100.0)/100.0)));
					lblMedia.setForeground(Color.red);
					}
				}
		});
		btncalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncalcular.setBounds(179, 237, 89, 23);
		contentPane.add(btncalcular);
		

	}
}
