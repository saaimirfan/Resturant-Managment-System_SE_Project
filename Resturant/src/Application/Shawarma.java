package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Shawarma extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox_1_1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_2;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_1_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shawarma frame = new Shawarma();
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
	public Shawarma() {
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
		lblNewLabel.setIcon(new ImageIcon(Shawarma.class.getResource("/Resource/shawarma/ShawarmaPic.png")));
		lblNewLabel.setBounds(10, 11, 561, 220);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Shawarma.class.getResource("/Resource/shawarma/beef Shawarma.png")));
		lblNewLabel_1.setBounds(10, 266, 110, 70);
		contentPane.add(lblNewLabel_1);
		
		
		
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Shawarma.class.getResource("/Resource/shawarma/chicken Shawarma.png")));
		lblNewLabel_1_1.setBounds(10, 359, 110, 70);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("Chicken Shawarma");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(114, 375, 120, 41);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox.setBounds(244, 385, 110, 22);
		contentPane.add(comboBox);
		
		lblNewLabel_3_1 = new JLabel("price");
		lblNewLabel_3_1.setBounds(364, 389, 91, 18);
		contentPane.add(lblNewLabel_3_1);
		
		String ch = "14";
		
		Connection con3 = new Connection();
        Statement s3 =null;
    try {
    	ResultSet rs3=null;
		s3 = con3.EstablishConnection().createStatement();
		 rs3 = s3.executeQuery("SELECT * FROM Product_price");
		 String query3="select * from Product_price where ID = '"+ch+"'";
		 rs3 = s3.executeQuery(query3);
		while(rs3.next()) {
			lblNewLabel_3_1.setText(rs3.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		
		
		
		
		
		
		lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Shawarma.class.getResource("/Resource/shawarma/keema shawarma.png")));
		lblNewLabel_1_2.setBounds(10, 440, 110, 70);
		contentPane.add(lblNewLabel_1_2);
		
		lblNewLabel_2_1 = new JLabel("Keema Shwarma");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(114, 455, 104, 41);
		contentPane.add(lblNewLabel_2_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_1.setBounds(244, 465, 110, 22);
		contentPane.add(comboBox_1);
		
		lblNewLabel_3_2 = new JLabel();
		lblNewLabel_3_2.setBounds(364, 469, 91, 18);
		contentPane.add(lblNewLabel_3_2);
		
		String kem = "16";
		
		Connection con2 = new Connection();
        Statement s2 =null;
    try {
    	ResultSet rs2=null;
		s2 = con2.EstablishConnection().createStatement();
		 rs2 = s2.executeQuery("SELECT * FROM Product_price");
		 String query2="select * from Product_price where ID = '"+kem+"'";
		 rs2 = s2.executeQuery(query2);
		while(rs2.next()) {
			lblNewLabel_3_2.setText(rs2.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

		
		
		
		
		
		
		lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(Shawarma.class.getResource("/Resource/shawarma/vegShawarma.png")));
		lblNewLabel_1_3.setBounds(10, 532, 110, 70);
		contentPane.add(lblNewLabel_1_3);
		
		lblNewLabel_2_2 = new JLabel("Veg Shawarma");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(114, 547, 104, 41);
		contentPane.add(lblNewLabel_2_2);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_2.setBounds(244, 557, 110, 22);
		contentPane.add(comboBox_2);
		
		lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(364, 561, 91, 18);
		contentPane.add(lblNewLabel_3);
		
		String veg = "16";
		
		Connection con1 = new Connection();
        Statement s1 =null;
    try {
    	ResultSet rs1=null;
		s1 = con1.EstablishConnection().createStatement();
		 rs1 = s1.executeQuery("SELECT * FROM Product_price");
		 String query1="select * from Product_price where ID = '"+veg+"'";
		 rs1 = s1.executeQuery(query1);
		while(rs1.next()) {
			lblNewLabel_3.setText(rs1.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		
		btnNewButton = new JButton("Add To Cart");
		btnNewButton.setBounds(455, 385, 116, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.setBounds(455, 465, 116, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Add To Cart");
		btnNewButton_2.setBounds(455, 557, 116, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Return To Menu");
		
		btnNewButton_3.setBounds(10, 662, 134, 41);
		contentPane.add(btnNewButton_3);
		
		textArea = new JTextArea();
		textArea.setBounds(182, 638, 389, 95);
		contentPane.add(textArea);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity", "1", "2", "3", "4", "5", "6", "7"}));
		comboBox_1_1.setBounds(244, 301, 110, 22);
		contentPane.add(comboBox_1_1);
		
		lblNewLabel_2_1_1 = new JLabel("Beef Shawarma");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(114, 295, 104, 41);
		contentPane.add(lblNewLabel_2_1_1);
		
		lblNewLabel_3_1_1 = new JLabel();
		lblNewLabel_3_1_1.setBounds(364, 305, 91, 18);
		contentPane.add(lblNewLabel_3_1_1);
		
		
		String beef = "13";
		
		Connection con = new Connection();
        Statement s =null;
    try {
    	ResultSet rs=null;
		s = con.EstablishConnection().createStatement();
		 rs = s.executeQuery("SELECT * FROM Product_price");
		 String query="select * from Product_price where ID = '"+beef+"'";
		 rs = s.executeQuery(query);
		while(rs.next()) {
			lblNewLabel_3_1_1.setText(rs.getString("Price"));
		 
		 
		 		
		 
		 
		}
		 
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
		
		
		btnNewButton_1_1 = new JButton("Add To Cart");
		btnNewButton_1_1.setBounds(455, 301, 116, 23);
		contentPane.add(btnNewButton_1_1);
		
	}

	private void createEvents() {
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage m1 = new MainPage();
				m1.show();
				dispose();
				
			}
		});
		
	}
}
