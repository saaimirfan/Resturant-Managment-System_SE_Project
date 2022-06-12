package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		initcomponent();
		createEvents();
	
	}


	


	private void initcomponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(89, 11, 191, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(34, 90, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(34, 153, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(143, 87, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 150, 173, 20);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(157, 205, 89, 23);
		contentPane.add(btnNewButton);
		
	}

	
	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String pass = passwordField.getText();
				
				
				
				 Connection con = new Connection();
	             Statement s =null;
             try {
				s = con.EstablishConnection().createStatement();
				 ResultSet rs = s.executeQuery("SELECT * FROM Login");
				 String query="select * from Login where user_name = '"+name+"'";
				 rs = s.executeQuery(query);
				 
				
				 
				 
				
				 
				 
				 
				 
				 
				 if(rs.next()) {

						Welcome w1 = new Welcome();
						w1.show();
						dispose();
					}
					else if(name.equals("admin")&& pass.equals("admin")) {

						AdminPage ad =new AdminPage();
						ad.show();
						dispose();
						
					}
					
					else {
						
						JOptionPane.showMessageDialog(null, "Incorrent Username Or Password");
					
					}
					
				
				 
				 
				 
				 
				 
				
                 
				 
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
	             
	            

           
				
				
				
				
				
				
				
				
				
			
			}
		});
		
	}
}
