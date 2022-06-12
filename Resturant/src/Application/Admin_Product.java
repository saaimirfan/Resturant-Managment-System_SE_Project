package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Admin_Product extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JButton btnNewButton_1;
	private JLabel status_prod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Product frame = new Admin_Product();
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
	public Admin_Product() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		status_prod = new JLabel("");
		status_prod.setBounds(75, 128, 143, 14);
		contentPane.add(status_prod);
		
	
		
		comboBox = new JComboBox();
	
		
		Connection con = new Connection();
        Statement s =null;
    try {
    	ResultSet rs=null;
		s = con.EstablishConnection().createStatement();
		 rs = s.executeQuery("SELECT * FROM Product_price");
		
		 
		 while(rs.next()) {
			 
			 comboBox.addItem(rs.getString("Name"));
			

				
			 
			 
		 }
		 		
		 
		 
		
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		comboBox.setBounds(31, 73, 187, 22);
		contentPane.add(comboBox);
		
		
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
	
				
				Connection con1 = new Connection();
		        Statement s1 =null;
		        ResultSet rs1=null;
		        String stat = null ;
		  
		        String  a = "1";
		        String cbox= comboBox.getSelectedItem().toString();
		        System.out.println(cbox);
		        try {
		        	
		        	s1 = con1.EstablishConnection().createStatement();
		   		 rs1 = s1.executeQuery("SELECT * FROM Product_price");
		   		String query1="select * from Product_price where Name = '"+cbox+"'";
		        rs1 = s1.executeQuery(query1);
		        	while(rs1.next()) {
		        		
		        		stat = rs1.getString("Status");	 
		        		
		        		
		            		
		            	
		        		
		        		
		        	}
		        	
		        	if(stat.equals(a)) {
		        		status_prod.setText("Product Enabled");
		        	}
		        	else {
		        		status_prod.setText("Product Disabled");
		        	}
		        	
		        	
		        	
				
		        } catch (SQLException e1) {
		    		// TODO Auto-generated catch block
		    		e1.printStackTrace();
		    	}
				
			}
		
	});
		
		
		
		
		btnNewButton_1 = new JButton("Back to Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage p1 = new AdminPage();
				p1.show();
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(10, 248, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton Enable = new JButton("Enable");
		Enable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con2 = new Connection();
		        Statement s2 =null;
		        String up = "1";
		        
		    try {
		    	

				String cbox1= comboBox.getSelectedItem().toString();
				System.out.print(cbox1);
				
		    	s2 = con2.EstablishConnection().createStatement();
			
				 String query="Update Product_price set Status = '"+up+"' where  Name = '"+cbox1+"'";
		         s2.executeUpdate(query);
		         
		         JOptionPane.showMessageDialog(null, "Product Enabled");
		         
		         
		         
		         
				
				
				
				
		    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
				
				
				
				
				
				
			}
		});
		Enable.setBounds(339, 54, 89, 23);
		contentPane.add(Enable);
		
		JButton btnNewButton_3 = new JButton("Disable");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con3 = new Connection();
		        Statement s3 =null;
		        String down = "0";
		        
		    try {
		    	

				String cbox1= comboBox.getSelectedItem().toString();
				System.out.print(cbox1);
				
		    	s3 = con3.EstablishConnection().createStatement();
			
				 String query2="Update Product_price set Status = '"+down+"' where  Name = '"+cbox1+"'";
		         s3.executeUpdate(query2);
		         
		         JOptionPane.showMessageDialog(null, "Product Disabled");
		         
		         
		         
		         
				
				
				
				
		    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
			}
		});
		btnNewButton_3.setBounds(339, 135, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel Status = new JLabel("Status");
		Status.setBounds(31, 128, 46, 14);
		contentPane.add(Status);
		
		
	}
}
