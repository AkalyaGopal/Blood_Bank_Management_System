import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(327, 287, 176, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(581, 284, 335, 23);
		textField.setBackground(new Color(255, 250, 250));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(327, 359, 176, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(581, 356, 335, 23);
		passwordField.setBackground(new Color(255, 250, 250));
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("bbms")&&  passwordField.getText().equals("cse"))
				{
					setVisible((false));
					new home().setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
			}
		});
		btnNewButton.setBounds(712, 424, 87, 25);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to close Application? ","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}
		});
		btnNewButton_1.setBounds(829, 424, 87, 25);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\bg2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1371, 791);
		contentPane.add(lblNewLabel_2);
	}
}