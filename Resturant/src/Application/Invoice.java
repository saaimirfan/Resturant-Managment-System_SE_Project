package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Invoice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		
		
		initcomponent();
		createEvents();
		
	}

	private void initcomponent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 575, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(64, 573, 473, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Invoice");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Paid");
		
		btnNewButton.setBounds(315, 621, 198, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back to Menu");
		
		btnNewButton_1.setBounds(64, 621, 126, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 63, 500, 460);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		
		
		scrollPane.setViewportView(table);
		
	}

	private void createEvents() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				Connection con1 = new Connection();
		        Statement s1 =null;
		       
		        
		    try {
		    	ResultSet rs1=null;
				s1 = con1.EstablishConnection().createStatement();
				 rs1 = s1.executeQuery("SELECT * FROM Serve");
				 DefaultTableModel model = new DefaultTableModel();
				
				 model.addColumn("Product");
				 model.addColumn("QTY");
				 model.addColumn("Total Selected Price");
				 
				 while(rs1.next()) {
					 model.addRow(new Object[] {
							 
							 rs1.getString("Product"),
							 rs1.getString("Qty"),
							 rs1.getString("Prices"),
							 
							 
							 
							 
							 
							 
					 });
					 
					 table.setModel(model);
					 
					 
					 
					 
				 }
				 
				int rowcount = table.getRowCount();
				int sum = 0;
				for(int i = 0;i<rowcount;i++) {
					sum=sum+Integer.parseInt(table.getValueAt(i, 2).toString());
				}
				
				
				textField.setText(Integer.toString(sum));
				textField.setEditable(false);
				
				
				
				
				
				
				
				 
				
				 
		    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			}
		});
		
		
		
		
		 
  
		 
	 
		
 
		
		
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				MainPage p1 =new MainPage();
				p1.show();
				dispose();
			}
		});
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    
    }
}
	
