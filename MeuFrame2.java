import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeuFrame2 extends JFrame {
	private JTextField A;
	private JTextField B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuFrame2 frame = new MeuFrame2();
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
	public MeuFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 248);
		getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("A:");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblA.setBounds(52, 64, 67, 14);
		getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B:");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblB.setBounds(52, 105, 46, 14);
		getContentPane().add(lblB);
		
		A = new JTextField();
		A.setBounds(85, 59, 149, 30);
		getContentPane().add(A);
		A.setColumns(10);
		
		B = new JTextField();
		B.setBounds(85, 100, 149, 30);
		getContentPane().add(B);
		B.setColumns(10);
		
		JButton botao = new JButton("Mostrar N\u00FAmeros");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto1 = A.getText();
		        String texto2 = B.getText();
		        int i = Integer.parseInt(texto1);
		        int j = Integer.parseInt(texto2);
		        String value = "";
		        
		        for(int x = i; x <= j; x++){
		            if (x > i && x < j){
		                value =  value + "," +x ;
		                
		            }
		            
		        }
		        JOptionPane.showMessageDialog(rootPane,"Os valores entre "+ i + " e " + j +" são:  " + value);
				
				
				
			}
		});
		botao.setBounds(69, 141, 175, 42);
		getContentPane().add(botao);
	}
}
