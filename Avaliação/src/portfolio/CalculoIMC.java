package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtImc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
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
	public CalculoIMC() {
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(21, 40, 48, 14);
		contentPane.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(63, 37, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(21, 85, 48, 14);
		contentPane.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setBounds(63, 82, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(25, 183, 48, 14);
		contentPane.add(lblImc);

		txtImc = new JTextField();
		txtImc.setBounds(10, 208, 63, 20);
		contentPane.add(txtImc);
		txtImc.setColumns(10);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpar();}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/limpar.png")));
		btnLimpar.setBounds(314, 37, 78, 74);
		contentPane.add(btnLimpar);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/imc.png")));
		btnCalcular.setBounds(226, 40, 64, 64);
		contentPane.add(btnCalcular);
		
	}
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		double peso, altura, imc;
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		
		imc = peso /(altura*altura);
		txtImc.setText(formatador.format(imc));
		if (imc < 18.5) {
			
		} else if (imc >= 18.5 && imc < 25) {
			
		} else if (imc >= 25 && imc <30) {
			
		}
		
	}
	//limpar campos 
	private void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtImc.setText(null);
		
		
	}
	
	}

