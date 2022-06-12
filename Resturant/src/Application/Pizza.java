package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Pizza extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JTextArea textArea;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_1;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_3_3;
	private JLabel lblNewLabel_3_2;
	private JLabel lblNewLabel_3_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		initcomponent();
		createEvents();
		
		
		
		
	}

	private void initcomponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 783);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pizza.class.getResource("/Resource/pizza/pizzaPic.png")));
		lblNewLabel.setBounds(10, 11, 561, 220);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pizza.class.getResource("/Resource/pizza/pepperoni.png")));
		lblNewLabel_1.setBounds(10, 266, 110, 70);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Pepperoni Pizza");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(114, 281, 104, 41);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox.setBounds(244, 291, 110, 22);
		contentPane.add(comboBox);
		
		btnNewButton = new JButton("Add To Cart");
		
		
		
		
		
		
		
		
		
		
		btnNewButton.setBounds(455, 291, 116, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel();
		String perp = "12";
		
		Connection con = new Connection();
        Statement s =null;
    try {
    	ResultSet rs=null;
		s = con.EstablishConnection().createStatement();
		 rs = s.executeQuery("SELECT * FROM Product_price");
		 String query="select * from Product_price where ID = '"+perp+"'";
		 rs = s.executeQuery(query);
		while(rs.next()) {
		 lblNewLabel_3.setText(rs.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		
		
		
		
		lblNewLabel_3.setBounds(364, 291, 91, 18);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Pizza.class.getResource("/Resource/pizza/bbq.png")));
		lblNewLabel_1_1.setBounds(10, 359, 110, 70);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2_1 = new JLabel("BBQ Pizza");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(114, 375, 104, 41);
		contentPane.add(lblNewLabel_2_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_1.setBounds(244, 385, 110, 22);
		contentPane.add(comboBox_1);
		
		lblNewLabel_3_1 = new JLabel();
		lblNewLabel_3_1.setBounds(364, 389, 91, 18);
		contentPane.add(lblNewLabel_3_1);
		
		
		String bbq = "9";
		
		Connection con1 = new Connection();
        Statement s1 =null;
    try {
    	ResultSet rs1=null;
		s1 = con1.EstablishConnection().createStatement();
		 rs1 = s1.executeQuery("SELECT * FROM Product_price");
		 String query1="select * from Product_price where ID = '"+bbq+"'";
		 rs1 = s1.executeQuery(query1);
		while(rs1.next()) {
			lblNewLabel_3_1.setText(rs1.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Pizza.class.getResource("/Resource/pizza/chickenFajita.png")));
		lblNewLabel_1_2.setBounds(10, 440, 110, 70);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_2_2 = new JLabel("Chicken Fajita");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(114, 455, 104, 41);
		contentPane.add(lblNewLabel_2_2);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_2.setBounds(244, 465, 110, 22);
		contentPane.add(comboBox_2);
		
		lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(364, 469, 91, 18);
		contentPane.add(lblNewLabel_3_2);
		
		
		String fudg = "10";
		
		Connection con2 = new Connection();
        Statement s2 =null;
    try {
    	ResultSet rs2=null;
		s2 = con2.EstablishConnection().createStatement();
		 rs2 = s2.executeQuery("SELECT * FROM Product_price");
		 String query2="select * from Product_price where ID = '"+fudg+"'";
		 rs2 = s2.executeQuery(query2);
		while(rs2.next()) {
			lblNewLabel_3_2.setText(rs2.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(Pizza.class.getResource("/Resource/pizza/margherita.png")));
		lblNewLabel_1_3.setBounds(10, 532, 110, 70);
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_2_3 = new JLabel("Margarita Pizza");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(114, 547, 104, 41);
		contentPane.add(lblNewLabel_2_3);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_3.setBounds(244, 557, 110, 22);
		contentPane.add(comboBox_3);
		
		lblNewLabel_3_3 = new JLabel();
		lblNewLabel_3_3.setBounds(364, 561, 91, 18);
		contentPane.add(lblNewLabel_3_3);
		
		
		String marg = "11";
		
		Connection con3 = new Connection();
        Statement s3 =null;
    try {
    	ResultSet rs3=null;
		s3 = con3.EstablishConnection().createStatement();
		 rs3 = s3.executeQuery("SELECT * FROM Product_price");
		 String query3="select * from Product_price where ID = '"+marg+"'";
		 rs3 = s3.executeQuery(query3);
		while(rs3.next()) {
			lblNewLabel_3_3.setText(rs3.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		btnNewButton_1 = new JButton("Add To Cart");
		
		btnNewButton_1.setBounds(455, 385, 116, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Add To Cart");
		
		btnNewButton_2.setBounds(455, 465, 116, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Add To Cart");
	
		btnNewButton_3.setBounds(455, 557, 116, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Return To Menu");
		
		btnNewButton_4.setBounds(10, 662, 134, 41);
		contentPane.add(btnNewButton_4);
		
		textArea = new JTextArea();
		textArea.setBounds(182, 638, 389, 95);
		contentPane.add(textArea);
		
	}

	private void createEvents() {
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String qty = 	comboBox.getSelectedItem().toString();
			int i=Integer.parseInt(qty);
			
			
			
		
				
			
			String pr = lblNewLabel_3_1.getText();
			int j=Integer.parseInt(pr);
			
			
			int c = j*i;
			
			System.out.println(c);
			
			Connection con = new Connection();
	        Statement s =null;
	    try {
	    	String prod = lblNewLabel_2.getText();
			s = con.EstablishConnection().createStatement();
			 String query="insert into Serve ([Product],[Qty],[Prices]) values ('"+prod+"','"+i+"','"+j+"')";
			 int a = s.executeUpdate(query);
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
				
				
				
				
				
				
				
			}
			 catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			 }}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String qty = 	comboBox_1.getSelectedItem().toString();
				int i=Integer.parseInt(qty);
				
				
				
			
					
				
				String pr = lblNewLabel_3.getText();
				int j=Integer.parseInt(pr);
				
				
				int c = j*i;
				
				System.out.println(c);
				
				Connection con = new Connection();
		        Statement s =null;
		    try {
		    	String prod = lblNewLabel_2_1.getText();
				s = con.EstablishConnection().createStatement();
				 String query="insert into Serve ([Product],[Qty],[Prices]) values ('"+prod+"','"+i+"','"+j+"')";
				 int a = s.executeUpdate(query);
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
					
					
					
					
					
					
					
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				 }
			
			
			
			
			
			
			}
		});
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String qty = 	comboBox_2.getSelectedItem().toString();
				int i=Integer.parseInt(qty);
				
				
				
			
					
				
				String pr = lblNewLabel_3_2.getText();
				int j=Integer.parseInt(pr);
				
				
				int c = j*i;
				
				System.out.println(c);
				
				
				
				
				
				
				
				
				
				
				Connection con = new Connection();
		        Statement s =null;
		    try {
		    	String prod = lblNewLabel_2_2.getText();
				s = con.EstablishConnection().createStatement();
				 String query="insert into Serve ([Product],[Qty],[Prices]) values ('"+prod+"','"+i+"','"+j+"')";
				 int a = s.executeUpdate(query);
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
					
					
					
					
					
					
					
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				 }
				
				
				
				
				
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				String qty = 	comboBox_3.getSelectedItem().toString();
				int i=Integer.parseInt(qty);
				
				
				
			
					
				
				String pr = lblNewLabel_3_3.getText();
				int j=Integer.parseInt(pr);
				
				
				int c = j*i;
				
				System.out.println(c);
				
				Connection con = new Connection();
		        Statement s =null;
		    try {
		    	String prod = lblNewLabel_2_3.getText();
				s = con.EstablishConnection().createStatement();
				 String query="insert into Serve ([Product],[Qty],[Prices]) values ('"+prod+"','"+i+"','"+j+"')";
				 int a = s.executeUpdate(query);
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
					
					
					
					
					
					
					
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				 }
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		
		
		////////////////////////////////////////////////////////enable/disable funtion///////////////////////////////////////////////////////////////////////
		
		
		Connection con5 = new Connection();
        Statement s5 =null;       
        try { String statprep = "12";
        s5 = con5.EstablishConnection().createStatement();
		 ResultSet rs5 = s5.executeQuery("SELECT * FROM Product_price");
		 String query="select * from Product_price where ID = '"+statprep+"'";
		 rs5 = s5.executeQuery(query);
		 String s = null;
		 while(rs5.next()) {
			s =rs5.getString("Status"); 	 
		 }
		if(s.equals("0")) {
			btnNewButton.setEnabled(false);
			btnNewButton.setText("Out OF Stock");
		}
		}
	 catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();	 	}
        /////////////////////////////////////////////////////////////////////
    	Connection con6 = new Connection();
        Statement s6 =null;       
        try { String statprep2 = "9";
        s6 = con5.EstablishConnection().createStatement();
		 ResultSet rs6 = s6.executeQuery("SELECT * FROM Product_price");
		 String query6="select * from Product_price where ID = '"+statprep2+"'";
		 rs6 = s6.executeQuery(query6);
		 String s1 = null;
		 while(rs6.next()) {
			s1 =rs6.getString("Status"); 	 
		 }
		if(s1.equals("0")) {
			btnNewButton_1.setEnabled(false);
			btnNewButton_1.setText("Out OF Stock");
		}
		}
	 catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();	 	}
        ///////////////////////////////////////////////////////////////////////////
     	Connection con7 = new Connection();
        Statement s7 =null;       
        try { String statprep3 = "10";
        s7 = con7.EstablishConnection().createStatement();
		 ResultSet rs7 = s7.executeQuery("SELECT * FROM Product_price");
		 String query7="select * from Product_price where ID = '"+statprep3+"'";
		 rs7 = s7.executeQuery(query7);
		 String s2 = null;
		 while(rs7.next()) {
			s2 =rs7.getString("Status"); 	 
		 }
		if(s2.equals("0")) {
			btnNewButton_2.setEnabled(false);
			btnNewButton_2.setText("Out OF Stock");
		}
		}
	 catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();	 	}
        ///////////////////////////////////////////////////////
    	Connection con8 = new Connection();
        Statement s8 =null;       
        try { String statprep4 = "11";
        s8 = con8.EstablishConnection().createStatement();
		 ResultSet rs8 = s8.executeQuery("SELECT * FROM Product_price");
		 String query8="select * from Product_price where ID = '"+statprep4+"'";
		 rs8 = s8.executeQuery(query8);
		 String s3 = null;
		 while(rs8.next()) {
			s3 =rs8.getString("Status"); 	 
		 }
		if(s3.equals("0")) {
			btnNewButton_3.setEnabled(false);
			btnNewButton_3.setText("Out OF Stock");
		}
		}
	 catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();	 	}
        
        
        
        
        
        
        
        
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage p1 =new MainPage();
				p1.show();
				dispose();
				
			}
		});
	
		
	}
}
