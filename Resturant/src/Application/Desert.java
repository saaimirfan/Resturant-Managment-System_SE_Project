package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Desert extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desert frame = new Desert();
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
	public Desert() {
		initcomponent();
		createEvents();
	}
	private void initcomponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Desert.class.getResource("/Resource/dessert/dessertPic.png")));
		lblNewLabel.setBounds(10, 11, 561, 220);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Desert.class.getResource("/Resource/dessert/cup cakes.png")));
		lblNewLabel_1.setBounds(10, 266, 110, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Desert.class.getResource("/Resource/dessert/donuts.png")));
		lblNewLabel_2.setBounds(10, 359, 110, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Desert.class.getResource("/Resource/dessert/lava cake.png")));
		lblNewLabel_3.setBounds(10, 559, 110, 70);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Desert.class.getResource("/Resource/dessert/icecream.png")));
		lblNewLabel_4.setBounds(10, 468, 110, 70);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cup Cake");
		lblNewLabel_5.setBounds(124, 294, 103, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Donuts");
		lblNewLabel_6.setBounds(124, 387, 103, 18);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ice Cream");
		lblNewLabel_7.setBounds(124, 496, 103, 18);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Lava Cake");
		lblNewLabel_8.setBounds(130, 583, 103, 18);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox.setBounds(206, 290, 109, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.setBounds(446, 290, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.setBounds(446, 385, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add To Cart");
		btnNewButton_2.setBounds(446, 494, 110, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add To Cart");
		btnNewButton_3.setBounds(452, 581, 110, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel();
		lblNewLabel_9.setBounds(325, 294, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		String cup = "17";
		
		Connection con2 = new Connection();
        Statement s2 =null;
    try {
    	ResultSet rs2=null;
		s2 = con2.EstablishConnection().createStatement();
		 rs2 = s2.executeQuery("SELECT * FROM Product_price");
		 String query2="select * from Product_price where ID = '"+cup+"'";
		 rs2 = s2.executeQuery(query2);
		while(rs2.next()) {
			lblNewLabel_9.setText(rs2.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(325, 387, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		
		String don = "18";
		
		Connection con3 = new Connection();
        Statement s3 =null;
    try {
    	ResultSet rs3=null;
		s3 = con3.EstablishConnection().createStatement();
		 rs3 = s3.executeQuery("SELECT * FROM Product_price");
		 String query3="select * from Product_price where ID = '"+don+"'";
		 rs3 = s3.executeQuery(query3);
		while(rs3.next()) {
			lblNewLabel_10.setText(rs3.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(325, 496, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		
String ice = "19";
		
		Connection con4 = new Connection();
        Statement s4 =null;
    try {
    	ResultSet rs4=null;
		s4 = con4.EstablishConnection().createStatement();
		 rs4 = s4.executeQuery("SELECT * FROM Product_price");
		 String query4="select * from Product_price where ID = '"+ice+"'";
		 rs4 = s4.executeQuery(query4);
		while(rs4.next()) {
			lblNewLabel_11.setText(rs4.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(331, 583, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		String lav = "20";
		
		Connection con5 = new Connection();
        Statement s5 =null;
    try {
    	ResultSet rs5=null;
		s5 = con5.EstablishConnection().createStatement();
		 rs5 = s5.executeQuery("SELECT * FROM Product_price");
		 String query5="select * from Product_price where ID = '"+lav+"'";
		 rs5 = s5.executeQuery(query5);
		while(rs5.next()) {
			lblNewLabel_12.setText(rs5.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_4.setBounds(206, 385, 109, 22);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_1.setBounds(206, 494, 109, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_2.setBounds(212, 581, 109, 22);
		contentPane.add(comboBox_2);
		
	
		JTextArea textArea = new JTextArea();
		textArea.setBounds(180, 646, 391, 104);
		contentPane.add(textArea);
		
		btnNewButton_4 = new JButton("Back To Menu");
		
		btnNewButton_4.setBounds(10, 677, 110, 37);
		contentPane.add(btnNewButton_4);
		
		
		
	}

	private void createEvents() {
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainPage page = new MainPage();
				page.show();
				dispose();
			}
		});
	}

}
