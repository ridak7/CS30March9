import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 349, 226);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 321, 177);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plantListPrompt = new JLabel("Select a plant name:");
		plantListPrompt.setBounds(10, 11, 203, 35);
		panel.add(plantListPrompt);
		
		JComboBox plantList = new JComboBox();
		plantList.setModel(new DefaultComboBoxModel(new String[] {"Basil", "Lavender", "Parsley", 
				"Peppermint", "Saffron", "Sage"}));
		plantList.setBounds(10, 57, 145, 50);
		panel.add(plantList);
		
		JLabel latinNames = new JLabel("Latin Name");
		latinNames.setBounds(10, 116, 203, 50);
		panel.add(latinNames);
		
		JButton plantCheck = new JButton("Check");
		plantCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 String plantName = " ";
				 
				 if(plantList.getSelectedItem().equals("Basil"))
				 {
					 plantName = "Ocimim";
				 }
				 
				 else if(plantList.getSelectedItem().equals("Lavender"))
				 {
					 plantName = "Lavendula  Spica";
				 }
				 else if(plantList.getSelectedItem().equals("Parsley"))
				 {
					 plantName = "Apium";
				 }
				 else if(plantList.getSelectedItem().equals("Peppermint"))
				 {
					 plantName = "Mentha Pipertia";
				 }
				 else if(plantList.getSelectedItem().equals("Saffron"))
				 {
					 plantName = "Crocus";
				 }
				 else if(plantList.getSelectedItem().equals("Sage"))
				 {
					 plantName = "Saliva";
				 }
					 
				 latinNames.setText(plantName);
				 
		
			}
		});
		plantCheck.setBounds(170, 57, 141, 50);
		panel.add(plantCheck);
	}
}
