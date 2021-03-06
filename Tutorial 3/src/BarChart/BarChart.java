package BarChart;

import java.awt.Dimension;
import javax.swing.JFrame;

public class BarChart {
	public static void main(String[] args) throws Exception
	{
		//run asynchronously
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				BarChart();
			}
		});
	}
	
	public static void BarChart(){
		JFrame frame = new JFrame();
		frame.setSize(400, 300);
		double[] values = new double[3];
		
		String[] names = new String[3];
		
		values[0] = 5;
		names[0] = "Item 1";
		
		values[1] = 2;
		names[1] = "Item 2";
		
		values[2] = 4;
		names[2] = "Item 3";
		
		frame.getContentPane().add(new ChartPanel(values, names));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}




