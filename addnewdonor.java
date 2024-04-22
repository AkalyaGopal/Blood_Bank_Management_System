import java.sql.*;

import java.text.SimpleDateFormat;

import project.connectionprovider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class addnewdonor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addnewdonor frame = new addnewdonor();
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
	public addnewdonor() {
		setUndecorated(true);
		setLocation(new Point(340, 130));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() 
		{
			public JLabel lblNewLabel_1;

			@Override
			public void componentShown(ComponentEvent e) 
			{
				try 
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select max(donorid)from donor");
					if(rs.first())
					{
						int id=rs.getInt(1);
						id=id+1;
						String str=String.valueOf(id);
						lblNewLabel_1.setText(str);
					}
					else
						lblNewLabel_1.setText("1");
				}
				
				catch(Exception i)
				{
					JOptionPane.showMessageDialog(null, i);
				}
			}
		}
			);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD NEW DONOR");
		lblNewLabel.setBounds(191, 22, 362, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 70, 686, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setBounds(129, 122, 163, 19);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 171, 163, 19);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 221, 163, 19);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JDateChooser dateChooser  = new JDateChooser();
		dateChooser.setBounds(131, 268, 161, 19);
		contentPane.add(dateChooser);
		
		textField_3 = new JTextField();
		textField_3.setBounds(129, 314, 163, 19);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 350, 163, 21);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setToolTipText("\r\n\r\n");
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Email ID");
		lblNewLabel_2.setBounds(366, 127, 94, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Blood Group");
		lblNewLabel_3.setBounds(366, 176, 94, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setBounds(366, 226, 94, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(369, 274, 91, 13);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(470, 124, 145, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"}));
		comboBox_1.setBounds(470, 172, 145, 21);
		contentPane.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(470, 223, 145, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(470, 268, 145, 103);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Full Name");
		lblNewLabel_6.setBounds(11, 127, 122, 13);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Father Name");
		lblNewLabel_7.setBounds(11, 176, 122, 13);
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
		
		JLabel lblNewLabel_12 = new JLabel("New Donor ID");
		lblNewLabel_12.setBounds(10, 90, 123, 13);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_12);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 383, 686, 13);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String lblNewLabel_1 = null;
				String donorid=lblNewLabel_1;
				String name=textField.getText();
				String fatherName=textField_1.getText();
				String motherName=textField_2.getText();
				SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
				String DOB=dFormat.format(dateChooser.getDate());
				String MobileNo=textField_3.getText();
				String gender=(String)comboBox.getSelectedItem();
				String email=textField_4.getText();
				String bloodGroup=(String)comboBox_1.getSelectedItem();
				String city=textField_5.getText();
				String address=textArea.getText();
				
				try
				{
					Connection con=connectionprovider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("insert into donor values('"+donorid+"','"+name+"','"+fatherName+"','"+motherName+"','"+DOB+"','"+MobileNo+"','"+gender+"','"+email+"','"+bloodGroup+"','"+city+"','"+address+"')");
					JOptionPane.showMessageDialog(null, "Successfully Updated");
					setVisible(false);
					new addnewdonor().setVisible(true);
				}
				catch(Exception i)
				{
					JOptionPane.showMessageDialog(null, i);
				}
			}
		});
		btnNewButton.setBounds(117, 406, 85, 21);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new addnewdonor().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(271, 406, 85, 21);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CLOSE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(431, 406, 85, 21);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(129, 82, 163, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_13 =  new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\5fc76b1045e4e0de36b5031f79ed405c.jpg"));
		lblNewLabel_13.setBounds(0, 0, 700, 500);
		contentPane.add(lblNewLabel_13);
		
		
	}
}

