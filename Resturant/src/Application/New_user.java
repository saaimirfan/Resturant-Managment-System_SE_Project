package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class New_user extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_user frame = new New_user();
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
	public New_user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(103, 75, 158, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(32, 78, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(299, 78, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		pass = new JTextField();
		pass.setBounds(355, 75, 184, 20);
		contentPane.add(pass);
		pass.setColumns(10);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = new Connection();
		        Statement s =null;
		    try {
		    	String user = name.getText();
		    	String p = pass.getText();
				s = con.EstablishConnection().createStatement();
				 String query="insert into Login ([user_name],[user_pass]) values ('"+user+"','"+p+"')";
				 int a = s.executeUpdate(query);
				
					JOptionPane.showMessageDialog(null, "User Added");
					
					name.setText("");
					pass.setText("");
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
			}
		});
		btnNewButton.setBounds(132, 173, 135, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con1 = new Connection();
		        Statement s1 =null;
		    try {
		    	String user1 = name.getText();
		    	
				s1 = con1.EstablishConnection().createStatement();
				String query1 ="Delete From Login Where user_name = '"+user1+"'";
		         
		         int a =s1.executeUpdate(query1);
		         
					JOptionPane.showMessageDialog(null, "User Deleted");
					
					name.setText("");
					pass.setText("");
					
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(331, 173, 167, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back To Admin Page");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage p1 = new AdminPage();
				p1.show();
				dispose();
				
				
			}
		});
		btnNewButton_2.setBounds(32, 363, 135, 23);
		contentPane.add(btnNewButton_2);
	}
}
