package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainPage() {
		
		initcomponents();
		createEvents();
		
	}

	private void initcomponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/menuPic.jpg")));
		lblNewLabel.setBounds(10, 59, 595, 248);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("    Pizza");
		
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/pizza.jpg")));
		
		btnNewButton.setBounds(10, 332, 290, 85);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("    Burger");
		
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/burger.jpg")));
		btnNewButton_1.setBounds(307, 332, 290, 85);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("   Biryani");
		
		btnNewButton_2.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/biryani.png")));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setBounds(10, 428, 290, 85);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("    Shawarma");
		
		btnNewButton_3.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/shawara.png")));
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBounds(307, 428, 290, 85);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("    Drinks");
		
		btnNewButton_4.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/drinks.png")));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setBounds(10, 524, 290, 85);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Desert");
		
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setIcon(new ImageIcon(MainPage.class.getResource("/Resource/dessert.png")));
		btnNewButton_5.setBounds(307, 524, 290, 85);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("End Transaction");
		
		btnNewButton_6.setBounds(10, 620, 587, 63);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(508, 11, 89, 23);
		contentPane.add(btnNewButton_7);
		
	}

	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pizza p1 = new Pizza();
				p1.show();
				dispose();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Burger b1 = new Burger();
				b1.show();
				dispose();
				
				
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Biryani bi1 = new Biryani();
				bi1.show();
				dispose();
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shawarma s1 =new Shawarma();
				s1.show();
				dispose();
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Drinks d1 = new Drinks();
				d1.show();
				dispose();
				
				
			}
		});
		
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Desert ds = new Desert();
			ds.show();
			dispose();
			
			
			}
			
		});
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Invoice n1 =new Invoice();
			n1.show();
			dispose();
			
			}
		});
		
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login l1 = new Login();
				l1.show();
				dispose();
				
			}
		});
		
		
	}
}
