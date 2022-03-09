import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField Int;

	/**
	 * Launch the application.
	 */
	//DONE
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 305, 149);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel int1 = new JLabel("Enter an integer:");
		int1.setBounds(10, 43, 133, 27);
		panel.add(int1);
		
		Int = new JTextField();
		Int.setBounds(157, 46, 133, 24);
		panel.add(Int);
		Int.setColumns(10);
		
		JTextArea factor = new JTextArea();
		factor.setForeground(Color.MAGENTA);
		factor.setBounds(98, 101, 192, 26);
		panel.add(factor);
		
		JButton divButton = new JButton("Check"); 
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//gets input number from user
				String Int1 = Int.getText();
				
				int Factor = Integer.parseInt(Int1);
				//divides by 3 to see if it equal 0 
				if(Factor % 3 == 0 )
				{
					//if yes then it is divisible
					factor.setText("Number is divisible by 3");
				}
				else
				{
					//if not then it is not divisible
					factor.setText("Number is not divisible by 3");
				}
				
			}
		});
		divButton.setBounds(10, 100, 78, 27);
		panel.add(divButton);
	}
}
