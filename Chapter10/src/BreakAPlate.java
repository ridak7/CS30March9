import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BreakAPlate {

	private JFrame frame;
	// pick four random integers, each 1-3

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		//Importing images from file:)
		ImageIcon pHolder = new ImageIcon("..\\Chapter10\\src\\placeholder.gif");
		ImageIcon plates1 = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon plates2 = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon plates3 = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		ImageIcon tiger = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		
		
		frame = new JFrame();
		frame.setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 456, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 446, 374);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plates = new JLabel("");
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(62, 77, 319, 107);
		panel.add(plates);
		
		JLabel PrizeWon = new JLabel("");
		PrizeWon.setHorizontalAlignment(SwingConstants.CENTER);
		PrizeWon.setBounds(73, 235, 303, 127);
		panel.add(PrizeWon);
		
		//main screen
		plates.setIcon(new ImageIcon("..\\Chapter10\\src\\plates.gif"));
		PrizeWon.setIcon(new ImageIcon("..\\Chapter10\\src\\placeholder.gif"));
		
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				// pick four random integers, each 1-3
				int playGame = 1 + (int)( 3 * Math.random() );
				
				
				if (playGame == 1)
				{
					plates.setIcon(plates2);
					PrizeWon.setIcon(sticker);
					play.setText("Play Again");
					
				}
				
				else if (playGame == 2)
				{
					plates.setIcon(plates3);
					PrizeWon.setIcon(tiger);
					play.setText("Play Again");
				}
				else
				{
					
				}
			}
		});

		play.setBounds(163, 195, 121, 29);
		panel.add(play);
		
		JLabel title = new JLabel("Break A Plate");
		title.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 11, 426, 35);
		panel.add(title);
	}
}
