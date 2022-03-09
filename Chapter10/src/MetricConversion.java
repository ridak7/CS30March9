import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	//DONE
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 217);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 329, 163);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel convTypePrompt = new JLabel("Select a converstion type:");
		convTypePrompt.setBounds(10, 11, 154, 26);
		panel.add(convTypePrompt);
		
		JComboBox converType = new JComboBox();
		converType.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters",
				"Gallons to Liters", "Pound to Kilograms"}));
		converType.setBounds(10, 48, 186, 26);
		panel.add(converType);
		
		JTextArea Conversion = new JTextArea();
		Conversion.setBounds(10, 101, 186, 26);
		panel.add(Conversion);
		
		JButton typeCheck = new JButton("Check");
		typeCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String conversionType = " ";
				 //different conversions info for the selected conversion types
				 if(converType.getSelectedItem().equals("Inches to Centimeters"))
				 {
					 conversionType = "1 inch = 2.54 centimeters";
				 }
				 
				 else if(converType.getSelectedItem().equals("Feet to Meters"))
				 {
					 conversionType = "1 foot = 0.3048 meters";
				 }
				 else if(converType.getSelectedItem().equals("Gallons to Liters"))
				 {
					 conversionType = "1 gallon = 4.5461 liters";
				 }
				 else if(converType.getSelectedItem().equals("Pound to Kilograms"))
				 {
					 conversionType = "1 pound = 0.4536 kilograms";
				 }
			
				 Conversion.setText(conversionType);
			}
		});
		typeCheck.setBounds(219, 50, 89, 23);
		panel.add(typeCheck);

	}
}
