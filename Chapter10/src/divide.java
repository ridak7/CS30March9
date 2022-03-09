import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class divide {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					divide window = new divide();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public divide() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon logo = new ImageIcon("..//Chapter10/src/WesternLogo.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 711, 577);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtFirstName.setText(" ");
			}
		});
		txtFirstName.setForeground(Color.LIGHT_GRAY);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(10, 35, 183, 47);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtLastName.setText(" ");
			}
		});
		txtLastName.setForeground(Color.LIGHT_GRAY);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(212, 35, 183, 47);
		panel.add(txtLastName);
		
		JComboBox Grade = new JComboBox();
		Grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grade.setBounds(131, 125, 62, 43);
		panel.add(Grade);
		
		JLabel lblNewLabel = new JLabel("Enter Grade:");
		lblNewLabel.setBounds(10, 125, 111, 43);
		panel.add(lblNewLabel);
		
		JComboBox School = new JComboBox();
		School.setModel(new DefaultComboBoxModel(new String[] {"Crescent", "Western", "Diefenbaker", "Nelson", "FFCA"}));
		School.setBounds(285, 125, 110, 43);
		panel.add(School);
		
		JLabel lblNewLabel_1 = new JLabel("School:");
		lblNewLabel_1.setBounds(212, 123, 63, 45);
		panel.add(lblNewLabel_1);
		
		JTextArea disp = new JTextArea();
		disp.setBounds(10, 202, 385, 167);
		panel.add(disp);
		
		JLabel di = new JLabel("");
		di.setBounds(10, 380, 385, 186);
		panel.add(di);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String school = " ";
				String Fn = txtFirstName.getText();
				String Ln = txtLastName.getText();
				
				if(Grade.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(Grade.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else 
				{
					grade = "12";
				}
				
				if(School.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
				}
				else if(School.getSelectedItem().equals("Western"))
				{
					school = "Western";
					
					di.setIcon(logo);
				}
				else if(School.getSelectedItem().equals("Diefenbaker"))
				{
					school = "Diefenbaker";
				}
				else 
				{
					school = "Nelson";
				}
				
				
				disp.setText(Fn + " " + Ln + " is in grade: "
				+ grade + ", and goes to: " 
				+ school);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(419, 202, 123, 158);
		panel.add(btnNewButton);
		
		
		
	}
}
