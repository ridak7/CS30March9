import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Event;

public class SemesterAvg
{

	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;

	//THIS CHANGE JUST OCCURED NOW
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 460, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel prompt1 = new JLabel("Enter first grade:");
		prompt1.setBounds(10, 84, 232, 26);
		panel.add(prompt1);
		
		grade1 = new JTextField(10);
		grade1.setBounds(252, 84, 138, 26);
		panel.add(grade1);
		grade1.setColumns(10);
		
		JLabel prompt2 = new JLabel("Enter second grade:");
		prompt2.setBounds(10, 121, 232, 26);
		panel.add(prompt2);
		
		grade2 = new JTextField(10);
		grade2.setText("");
		grade2.setBounds(252, 122, 138, 26);
		panel.add(grade2);
		grade2.setColumns(10);
		
		JLabel prompt3 = new JLabel("Enter third grade:");
		prompt3.setBounds(10, 158, 232, 26);
		panel.add(prompt3);
		
		grade3 = new JTextField(10);
		grade3.setBounds(252, 158, 138, 26);
		panel.add(grade3);
		grade3.setColumns(10);
		
		JTextArea avg = new JTextArea();
		avg.setBounds(252, 262, 138, 26);
		panel.add(avg);
				
		
		JButton avgButton = new JButton("Average");
		avgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String g1 = grade1.getText();
				String g2 = grade2.getText();
				String g3 = grade3.getText();
			
				int G1 = Integer.parseInt(g1);
				int G2 = Integer.parseInt(g2);
				int G3 = Integer.parseInt(g3);
				
				int Avg = ((G1 + G2 + G3) / 3); 
						
				avg.setText("" + Avg);
				
			}
		});
		avgButton.setBounds(79, 263, 89, 23);
		panel.add(avgButton);
		
		
		

	}
	
}
