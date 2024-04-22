package project;
import javax.swing.JTable;
import java.sql.*;
import project.connectionprovider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class searchBloodDonorLocation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchBloodDonorLocation frame = new searchBloodDonorLocation();
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
	public searchBloodDonorLocation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(340, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEARCH BLOOD DONOR(ADDRESS)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(141, 10, 576, 42);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 62, 686, 16);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("ADDRESS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(193, 74, 77, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String location=textField.getText();
				try
				{
				Connection con= connectionprovider.getCon();
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select *from donor where city like '%"+location+"%' or address like '%"+location+"%'");
				table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception i)
				{
				JOptionPane.showMessageDialog(null,i);
				}
				
			}
		});
		textField.setBounds(287, 78, 233, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 106, 686, 16);
		contentPane.add(separator_1);
		
		table = new JTable();
		table.setBounds(10, 132, 666, 217);
		contentPane.add(table);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 378, 686, 16);
		contentPane.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(509, 404, 85, 49);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\5fc76b1045e4e0de36b5031f79ed405c.jpg"));
		lblNewLabel_2.setBounds(0, 0, 706, 474);
		contentPane.add(lblNewLabel_2);
	}
}
