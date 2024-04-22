package project;

import project.connectionprovider;
import java.sql.*;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class deleteDonor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
					deleteDonor frame = new deleteDonor();
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
	public deleteDonor() {
		setLocation(new Point(340, 130));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteDonorDetails = new JLabel("DELETE DONOR DETAILS");
		lblDeleteDonorDetails.setBounds(114, 10, 480, 45);
		lblDeleteDonorDetails.setFont(new Font("Tahoma", Font.BOLD, 37));
		contentPane.add(lblDeleteDonorDetails);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 65, 686, 16);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Donor ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(158, 87, 85, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(247, 88, 110, 19);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String donorId=textField_9.getText();
				try 
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from donor where donorId='"+donorId+"'");
					if(rs.next())
					{
						textField_1.setText(rs.getString(0));
						textField_2.setText(rs.getString(1));
						textField_3.setText(rs.getString(2));
						textField_4.setText(rs.getString(3));
						textField_5.setText(rs.getString(4));
						textField_6.setText(rs.getString(5));
						textField_7.setText(rs.getString(6));
						textField_8.setText(rs.getString(7));
						textField_9.setText(rs.getString(8));
						textField_10.setText(rs.getString(10));
						textField.setEditable(false);
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
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 137, 122, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Father Name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 176, 122, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Mother Name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(11, 226, 122, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Date of Birth");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(11, 268, 122, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Mobile Number");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(11, 319, 122, 13);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gender");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(11, 356, 122, 13);
		contentPane.add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 137, 178, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 175, 178, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 225, 178, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 267, 178, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 318, 178, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 355, 178, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("Email ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(356, 137, 104, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Blood Group");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(356, 176, 104, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(356, 226, 104, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(359, 274, 101, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(470, 136, 163, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(470, 174, 163, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(470, 219, 163, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(470, 266, 163, 87);
		contentPane.add(textField_10);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 386, 686, 7);
		contentPane.add(separator_1_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String donorid=textField.getText();
				try
				{
				Connection con=connectionprovider.getCon();
				Statement st=con.createStatement();
				st.executeUpdate("delete from donor where donorid='"+donorid+"'");
				JOptionPane.showMessageDialog(null,"Successfully deleted");
				setVisible(false);
				new deleteDonor().setVisible(true);
				}
				catch(Exception i)
				{
				JOptionPane.showMessageDialog(null,i);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(147, 403, 96, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("RESET");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new deleteDonor().setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(272, 403, 96, 21);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("CLOSE");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2_2.setBounds(394, 403, 96, 21);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\5fc76b1045e4e0de36b5031f79ed405c.jpg"));
		lblNewLabel.setBounds(0, 0, 701, 473);
		contentPane.add(lblNewLabel);
	}
}
