package com.feereport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddStudent extends JFrame {
	static AddStudent frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	String d;
/*	private JLabel lvalcity_1;
	private JLabel lvalcontact_1;
	private JLabel lvalcountry_1;
	private JLabel lvalfee_1;
	private JLabel lvalcourse_1;
	private JLabel lvalemail_1;
	private JLabel lvalname_1;
	private JLabel lvalstate_1;
	private JLabel lvalpaid_1;
	private JLabel lvaladdress_1;
/*private JLabel lvalcity_1;
	private JLabel lvalcontact_1;
	private JLabel lvalcountry_1;
	private JLabel lvalfee_1;
	private JLabel lvalcourse_1;
	private JLabel lvalemail_1;
	private JLabel lvalname_1;
	private JLabel lvalpaid;
	private JLabel lvalstate_1;
	private JLabel lvaladdress_1_1;
	*/
	/*JLabel lvalcity_1;
	 JLabel lvalcontact_1;
	 JLabel lvalcountry_1;
	 JLabel lvalfee_1;
	 JLabel lvalcourse_1;
	 JLabel lvalemail_1;
	 JLabel lvalname_1;
	 JLabel lvalpaid_1;
	 JLabel lvalstate_1;
	 JLabel lvaladdress_1;
	*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
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
	
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddAccountant = new JLabel("Add Student");
		lblAddAccountant.setForeground(Color.DARK_GRAY);
		lblAddAccountant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		
		JLabel lblEmail = new JLabel("Email:");
		
		JLabel lblCourse = new JLabel("Course:");
		
		JLabel lblFee = new JLabel("Fee:");
		
		JLabel lblPaid = new JLabel("Paid:");
		
		JLabel lblDue = new JLabel("Due:");
		
		JLabel lblAddress = new JLabel("Address:");
		
		JLabel lblCity = new JLabel("City:");
		
		JLabel lblState = new JLabel("State:");
		
		JLabel lblCountry = new JLabel("Country:");
		
		JLabel lblContactNo = new JLabel("Contact No:");
		
		
		JLabel lvalname_1 = new JLabel("");
		lvalname_1.setForeground(Color.RED);
		
		JLabel lvalemail_1 = new JLabel("");
		lvalemail_1.setForeground(Color.RED);
		
		JLabel lvalcourse_1 = new JLabel("");
		lvalcourse_1.setForeground(Color.RED);
		
		JLabel lvalfee_1 = new JLabel("");
		lvalfee_1.setForeground(Color.RED);
		
		JLabel lvalpaid_1 = new JLabel("");
		lvalpaid_1.setForeground(Color.RED);
		
		JLabel lvalcity_1 = new JLabel("");
		lvalcity_1.setForeground(Color.RED);
		
		JLabel lvalstate_1 = new JLabel("");
		lvalstate_1.setForeground(Color.RED);
		
		JLabel lvalcountry_1 = new JLabel("");
		lvalcountry_1.setForeground(Color.RED);
		
		JLabel lvalcontact_1 = new JLabel("");
		 lvalcontact_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lvalcontact_1.setForeground(Color.RED);
	
		JLabel lvaladdress_1 = new JLabel("");
		lvaladdress_1.setForeground(Color.RED);
		
		JLabel lvalall = new JLabel("");
		lvalall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lvalall.setForeground(Color.RED);
		//Public String d;
		
		//Labels for validations
		/* JLabel lvalcity_1;
		 JLabel lvalcontact_1;
		 JLabel lvalcountry_1_1;
		 JLabel lvalfee_1;
		 JLabel lvalcourse_1;
		 JLabel lvalemail_1;
		 JLabel lvalname_1;
		 JLabel lvalpaid_1;
		 JLabel lvalstate_1;
		 JLabel lvaladdress_1;
		*/
		
		JButton btnAddAccountant = new JButton("Add Student");
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
			//	int due= fee-paid;
			//	d= Integer.toString(due);
			//	textField_5.setText(d);
				int due=Integer.parseInt(textField_5.getText());
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
			
				
				if(name.trim().isEmpty() && email.trim().isEmpty() && course.trim().isEmpty() && textField_3.getText().trim().isEmpty()
				 && textField_4.getText().trim().isEmpty() && address.trim().isEmpty() && city.trim().isEmpty() && state.trim().isEmpty()
				 && country.trim().isEmpty() && contactno.trim().isEmpty()) 
				{
					lvalall.setText("Fields are Empty!!!");
				}
				else if(name.trim().isEmpty()) {
					lvalname_1.setText("Enter your name here!");
				}
				else if(email.trim().isEmpty()) {
					lvalemail_1.setText("Enter your email here!");
				}
				else if(course.trim().isEmpty()) {
					lvalcourse_1.setText("Enter your course name here!");
				}
				else if(textField_3.getText().trim().isEmpty()) {
					lvalfee_1.setText("Enter course fee here!");
				}
				else if(textField_4.getText().trim().isEmpty()) {
					lvalpaid_1.setText("Enter your paid amount here!");
				}
				else if(address.trim().isEmpty()) {
					lvaladdress_1.setText("Enter your address here!");
				}
				else if(city.trim().isEmpty()) {
					lvalcity_1.setText("Enter your city name here!");
				}
				else if(state.trim().isEmpty()) {
					lvalstate_1.setText("Enter your name of state here!");
				}
				else if(country.trim().isEmpty()) {
					lvalcountry_1.setText("Enter your country name here!");
				}
				else if(contactno.trim().isEmpty()) {
					lvalcontact_1.setText("Enter your contact no here!");
				}
				else {
				Student s=new Student(name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.save(s);
				
				
				 if(status>0){
					JOptionPane.showMessageDialog(AddStudent.this,"Student added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");
					textField_9.setText("");textArea.setText("");
				}else{
					JOptionPane.showMessageDialog(AddStudent.this,"Sorry, Unable to add student!");
				}
				}
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due= fee-paid;
				d= Integer.toString(due);
				textField_5.setText(d);
			}
		});
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setRows(3);
		textArea.setColumns(20);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				frame.dispose();
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(142)
							.addComponent(lblAddAccountant))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPaid, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(4)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lvalcontact_1, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalcountry_1, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalfee_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalcourse_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalemail_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalname_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
												.addComponent(lvalpaid_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
												.addComponent(lvalstate_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lvalcity_1, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
									.addComponent(lvaladdress_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblContactNo)
					.addContainerGap(357, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCountry, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
					.addGap(350))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(395, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(376, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(128)
					.addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(btnBack))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lvalall, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddAccountant)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lvalname_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lvalemail_1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblEmail)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lvalcourse_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCourse)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFee)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPaid)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDue)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lvalfee_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lvalpaid_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAddress)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addComponent(lvaladdress_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCity)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lvalcity_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_6, Alignment.TRAILING))
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblState)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lvalstate_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lvalcountry_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCountry)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblContactNo)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lvalcontact_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddAccountant, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnBack)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lvalall, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
