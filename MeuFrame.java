import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

public class MeuFrame extends JFrame {

	private JPanel contentPane;
	private JTextField TXTlogin;
	private JTextField TXTsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuFrame frame = new MeuFrame();
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
	public MeuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if("admin".equals(TXTlogin.getText()) && "swordfish".equals(TXTsenha.getText())) {
					JOptionPane.showMessageDialog(rootPane, "Login efetuado com sucesso!");
				}else{JOptionPane.showMessageDialog(rootPane, "Login ou Senha incorretas, tente novamente!");
				
				
				}
			}
		});
		btnOk.setBounds(103, 108, 89, 23);
		contentPane.add(btnOk);
		
		TXTlogin = new JTextField();
		TXTlogin.setBounds(92, 46, 141, 20);
		contentPane.add(TXTlogin);
		TXTlogin.setColumns(10);
		
		TXTsenha = new JTextField();
		TXTsenha.setBounds(92, 77, 141, 20);
		contentPane.add(TXTsenha);
		TXTsenha.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBackground(Color.BLACK);
		lblLogin.setBounds(35, 49, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(35, 80, 47, 14);
		contentPane.add(lblSenha);
	
	
	}
}
