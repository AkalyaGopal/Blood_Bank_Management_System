package project;
import java.sql.*;
import project.connectionprovider;


import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;

public class updatedonordetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatedonordetails frame = new updatedonordetails();
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
	public updatedonordetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE DONOR DETAILS");
		lblNewLabel.setBounds(97, 10, 521, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 65, 686, 16);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(120, 87, 123, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String donorId=textField_9.getText();
				try 
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from donor where donorId='"+donorId+"'");
					if(rs.next())
					{
						textField_0.setText(rs.getString(0));
						textField_1.setText(rs.getString(1));
						textField_2.setText(rs.getString(2));
						textField_3.setText(rs.getString(3));
						textField_4.setText(rs.getString(4));
						textField_5.setText(rs.getString(5));
						textField_6.setText(rs.getString(6));
						textField_7.setText(rs.getString(7));
						textField_8.setText(rs.getString(8));
						textField_10.setText(rs.getString(10));
						textField_9.setEditable(false);
					}
					else
						JOptionPane.showMessageDialog(null,"Donor does not Exist");
				}
				catch(Exception i){}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(383, 87, 96, 23);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 120, 686, 7);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_6 = new JLabel("Full Name");
		lblNewLabel_6.setBounds(10, 137, 122, 13);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Father Name");
		lblNewLabel_7.setBounds(10, 176, 122, 13);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Mother Name");
		lblNewLabel_8.setBounds(11, 226, 122, 13);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setBounds(11, 268, 122, 13);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Mobile Number");
		lblNewLabel_10.setBounds(11, 319, 122, 13);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gender");
		lblNewLabel_11.setBounds(11, 356, 122, 13);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2 = new JLabel("Email ID");
		lblNewLabel_2.setBounds(356, 137, 104, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Blood Group");
		lblNewLabel_3.setBounds(356, 176, 104, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setBounds(356, 226, 104, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(359, 274, 101, 13);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 387, 686, 7);
		contentPane.add(separator_1_1);
		
		textField_0 = new JTextField();
		textField_0.setBounds(120, 137, 178, 19);
		contentPane.add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 175, 178, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 225, 178, 19);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 318, 178, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 355, 178, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(470, 137, 163, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(470, 175, 163, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(470, 220, 163, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(247, 88, 110, 19);
		contentPane.add(textField_9);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String donorId=textField_9.getText();
				String name=textField_0.getText();
				String fatherName=textField_1.getText();
				String motherName=textField_2.getText();
				String DOB=textField_3.getText();
				String MobileNo=textField_4.getText();
				String gender=textField_5.getText();
				String email=textField_6.getText();
				String bloodGroup=textField_7.getText();
				String city=textField_8.getText();
				String address=textField_10.getText();
				JOptionPane jOptionPane;
				try
				{
					connectionprovider connentionprovider;
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("update donor set name='"+name+"',fatherName='"+fatherName+"',motherName'"+motherName+"',DOB='"+DOB+"',MobileNo='"+MobileNo+"',gender='"+gender+"',email='"+email+"',bloodGroup='"+bloodGroup+"',city='"+city+"',address='"+address+"' where MobileNo='"+MobileNo+"'");
					JOptionPane.showMessageDialog(null,"Successfully Updated");
					setVisible(false);
					new updatedonordetails().setVisible(true);
				}
				catch(Exception i)
				{
					JOptionPane.showMessageDialog(null,"Connection Error"); 
				}
				
			}
		});
		btnNewButton_2.setBounds(147, 404, 96, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("RESET");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new updatedonordetails().setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(272, 404, 96, 21);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("CLOSE");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_2.setBounds(394, 404, 96, 21);
		contentPane.add(btnNewButton_2_2);
		
		textField_10 = new JTextField();
		textField_10.setBounds(470, 267, 163, 87);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(120, 278, 178, 19);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\5fc76b1045e4e0de36b5031f79ed405c.jpg"));
		lblNewLabel_12.setBounds(0, 0, 686, 463);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		
	}
}

