import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.deleteDonor;
import project.searchBloodDonorBloodGroup;
import project.searchBloodDonorLocation;
import project.updatedonordetails;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Donor");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add new");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new addnewdonor().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Update details");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new updatedonordetails().setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Search Donor");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Location");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new searchBloodDonorLocation().setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_1.add(separator_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Blood Group");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new searchBloodDonorBloodGroup().setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_3 = new JMenu("Delete Donor");
		menuBar_1.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Delete Donor");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new deleteDonor().setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_4 = new JMenu("Exit");
		menuBar_1.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Logout");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					new login().setVisible(true);
				}
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_9);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_4.add(separator_5);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Exit Application");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\akalamri\\Downloads\\print-182616983.jpg"));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}
}