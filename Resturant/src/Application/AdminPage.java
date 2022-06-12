package Application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		
		initcomponents();
		createEvents();
	}

	private void initcomponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Page");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 31, 192, 44);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Edit Price");
		
		btnNewButton.setBounds(44, 141, 130, 55);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Enable/Disable Product");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Product a1 = new Admin_Product();
				a1.show();
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(319, 141, 160, 55);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Add/Delete User");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			New_user u1 = new New_user();
			u1.show();
			dispose();
			}
		});
		btnNewButton_2.setBounds(44, 274, 130, 55);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l1 = new Login();
				l1.show();
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(442, 445, 89, 23);
		contentPane.add(btnNewButton_3);
		
	}

	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit e1 =new Edit();
				e1.show();
				dispose();
			}
		});
		
	}
	}


