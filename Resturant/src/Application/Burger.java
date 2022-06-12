package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Burger extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Burger frame = new Burger();
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
	public Burger() {
		initcomponenets();
		createEvents();
		
	}

	private void initcomponenets() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Burger.class.getResource("/Resource/Burger/BurgerPic.png")));
		lblNewLabel.setBounds(10, 11, 561, 220);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Burger.class.getResource("/Resource/Burger/cheeseBurger.png")));
		lblNewLabel_1.setBounds(10, 242, 110, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Burger.class.getResource("/Resource/Burger/chickenBurger.png")));
		lblNewLabel_1_1.setBounds(10, 346, 110, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Burger.class.getResource("/Resource/Burger/specialBurger.png")));
		lblNewLabel_1_2.setBounds(10, 456, 110, 70);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(Burger.class.getResource("/Resource/Burger/zingerBurger.png")));
		lblNewLabel_1_3.setBounds(10, 558, 110, 70);
		contentPane.add(lblNewLabel_1_3);
		
		
		JLabel lblNewLabel_5 = new JLabel("Cheese Burger");
		lblNewLabel_5.setBounds(139, 269, 103, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Chicken Burger\r\n");
		lblNewLabel_5_1.setBounds(139, 370, 103, 22);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Special Burger");
		lblNewLabel_5_2.setBounds(139, 482, 103, 22);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Zinger Burger\r\n");
		lblNewLabel_5_3.setBounds(139, 584, 103, 22);
		contentPane.add(lblNewLabel_5_3);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox.setBounds(221, 269, 109, 22);
		contentPane.add(comboBox);
		
		
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.setBounds(446, 266, 110, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_1.setBounds(221, 370, 109, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_2.setBounds(221, 482, 109, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_3.setBounds(221, 584, 109, 22);
		contentPane.add(comboBox_3);
		
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(356, 273, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		String chese = "5";
		
		Connection con = new Connection();
        Statement s =null;
    try {
    	ResultSet rs=null;
		s = con.EstablishConnection().createStatement();
		 rs = s.executeQuery("SELECT * FROM Product_price");
		 String query="select * from Product_price where ID = '"+chese+"'";
		 rs = s.executeQuery(query);
		while(rs.next()) {
			lblNewLabel_10.setText(rs.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		
		JLabel lblNewLabel_10_1 = new JLabel("New label");
		lblNewLabel_10_1.setBounds(356, 374, 46, 14);
		contentPane.add(lblNewLabel_10_1);
		
		
		
		String chik = "6";
		
		Connection con1 = new Connection();
        Statement s1 =null;
    try {
    	ResultSet rs1=null;
		s1 = con1.EstablishConnection().createStatement();
		 rs1 = s1.executeQuery("SELECT * FROM Product_price");
		 String query1="select * from Product_price where ID = '"+chik+"'";
		 rs1 = s1.executeQuery(query1);
		while(rs1.next()) {
			lblNewLabel_10_1.setText(rs1.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		JLabel lblNewLabel_10_2 = new JLabel("New label");
		lblNewLabel_10_2.setBounds(356, 486, 46, 14);
		contentPane.add(lblNewLabel_10_2);
		
		
		String spec = "7";
		
		Connection con2 = new Connection();
        Statement s2 =null;
    try {
    	ResultSet rs2=null;
		s2 = con2.EstablishConnection().createStatement();
		 rs2 = s2.executeQuery("SELECT * FROM Product_price");
		 String query2="select * from Product_price where ID = '"+spec+"'";
		 rs2 = s2.executeQuery(query2);
		while(rs2.next()) {
			lblNewLabel_10_2.setText(rs2.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		JLabel lblNewLabel_10_3 = new JLabel("New label");
		lblNewLabel_10_3.setBounds(356, 588, 46, 14);
		contentPane.add(lblNewLabel_10_3);
		
		
		String zing = "8";
		
		Connection con3 = new Connection();
        Statement s3 =null;
    try {
    	ResultSet rs3=null;
		s3 = con3.EstablishConnection().createStatement();
		 rs3 = s3.executeQuery("SELECT * FROM Product_price");
		 String query3="select * from Product_price where ID = '"+zing+"'";
		 rs3 = s3.executeQuery(query3);
		while(rs3.next()) {
			lblNewLabel_10_3.setText(rs3.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.setBounds(446, 370, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add To Cart");
		btnNewButton_2.setBounds(446, 482, 110, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add To Cart");
		btnNewButton_3.setBounds(446, 584, 110, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Back To Menu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(31, 707, 117, 32);
		contentPane.add(btnNewButton_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(180, 662, 391, 88);
		contentPane.add(textArea);
		
	}

	private void createEvents() {
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage p1 = new MainPage();
				p1.show();
				dispose();
				
			}
		});
		
	}

}
