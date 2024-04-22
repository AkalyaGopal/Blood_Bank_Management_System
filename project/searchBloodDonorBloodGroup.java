package project;
import javax.swing.JTable;
import java.sql.*;
import project.connectionprovider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Point;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class searchBloodDonorBloodGroup extends JFrame {

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
					searchBloodDonorBloodGroup frame = new searchBloodDonorBloodGroup();
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
	public searchBloodDonorBloodGroup() {
		setLocation(new Point(340, 130));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchBloodDonorblood = new JLabel("SEARCH BLOOD DONOR(Blood Group)");
		lblSearchBloodDonorblood.setBounds(117, 21, 462, 29);
		lblSearchBloodDonorblood.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblSearchBloodDonorblood);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 60, 676, 15);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Blood Group");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(136, 76, 105, 22);
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
		textField.setColumns(10);
		textField.setBounds(257, 80, 233, 19);
		contentPane.add(textField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 122, 676, 15);
		contentPane.add(separator_1);
		
		table = new JTable();
		table.setBounds(10, 147, 666, 208);
		contentPane.add(table);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 379, 676, 15);
		contentPane.add(separator_1_1);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(556, 404, 85, 49);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\5fc76b1045e4e0de36b5031f79ed405c.jpg"));
		lblNewLabel.setBounds(0, 0, 686, 463);
		contentPane.add(lblNewLabel);
	}
}
