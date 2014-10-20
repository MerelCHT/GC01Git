package Radargraph;

import java.awt.Dimension;
import javax.swing.JFrame;

class Controller {
	public static void main(String[] args) throws Exception
	{
		//run asynchronously
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				createAndShowGUI();
			}
		});
	}
	
	public static void createAndShowGUI()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(640, 480));
		frame.add(new RadarGraph());
		frame.pack();
		// doe iets
		frame.setVisible(true);
		
		
	}

}
