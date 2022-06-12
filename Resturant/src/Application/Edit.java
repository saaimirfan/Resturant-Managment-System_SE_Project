package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Edit extends JFrame {

	private JPanel contentPane;
	private JTextField rice;
	private JTextField New;
	private JButton btnNewButton_1;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
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
	public Edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Price");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(46, 28, 184, 51);
		contentPane.add(lblNewLabel);
		
		
		JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.setBounds(46, 101, 184, 22);
		contentPane.add(comboBox_1);
		
		
		Connection con = new Connection();
        Statement s =null;
    try {
    	ResultSet rs=null;
		s = con.EstablishConnection().createStatement();
		 rs = s.executeQuery("SELECT * FROM Product_price");
		
		 
		 while(rs.next()) {
			 
			 comboBox_1.addItem(rs.getString("Name"));
			

				
			 
			 
		 }
		 		
		 
		 
		
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
   
		
		
		
		
		
		
		
		rice = new JTextField();
		rice.setEditable(false);
		rice.setBounds(260, 102, 208, 21);
		contentPane.add(rice);
		rice.setColumns(10);
		
		
    	
    	
    	
    	comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con1 = new Connection();
		        Statement s1 =null;
		    try {
				
				String cbox= comboBox_1.getSelectedItem().toString();
				System.out.print(cbox);
			
    	
    	
    	
    	
		s1 = con1.EstablishConnection().createStatement();
		ResultSet rs1= s1.executeQuery("SELECT * FROM Product_price");
		 String query="select * from Product_price where Name = '"+cbox+"'";
         rs1 = s1.executeQuery(query);
         
         while(rs1.next()) {
         
         rice.setText(rs1.getString("Price"));
		 
         }
		 
		 
		 
		 
		 
		 
	
		 New.setText("");
		
		 
		 
		 
		 
    } catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    	}
	});
		
		
		
		New = new JTextField();
		New.setBounds(46, 171, 184, 22);
		contentPane.add(New);
		New.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter New Price");
		lblNewLabel_1.setBounds(46, 150, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Current Price");
		lblNewLabel_2.setBounds(260, 82, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Product Name");
		lblNewLabel_3.setBounds(46, 82, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton Edit = new JButton("Edit");
		Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Connection con2 = new Connection();
		        Statement s2 =null;
		    try {
		    	
		    	String up =New.getText();
				String cbox1= comboBox_1.getSelectedItem().toString();
				System.out.print(cbox1);
				
		    	s2 = con2.EstablishConnection().createStatement();
			
				 String query="Update Product_price set Price = '"+up+"' where  Name = '"+cbox1+"'";
		         s2.executeUpdate(query);
		         
		         
				
				
				
				
		    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
				
				
				
				
			}
		});
		
		
		Edit.setBounds(309, 171, 89, 23);
		contentPane.add(Edit);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPage admin = new AdminPage();
				admin.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(62, 342, 95, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
