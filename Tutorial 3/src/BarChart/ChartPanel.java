package BarChart;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ChartPanel extends JPanel{
	private double[] values;
	private String[] names;
	
	public ChartPanel(double[] v, String[] n){
		setBackground(Color.white);
		values = v;
		names = n;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//Bar chart drawing code here.
		
		//Find out what the maximum value of the data is.
		if (values == null || values.length == 0)
		      return;
		    double minValue = 0;
		    double maxValue = 0;
		    for (int i = 0; i < values.length; i++) {
		      if (minValue > values[i])
		        minValue = values[i];
		      if (maxValue < values[i])
		        maxValue = values[i];
		    }
		    
		//Calculate the screen's height & width, and the width of each bar, which depends on the number of bars and
		//the size of the screen. 
		int screenHeight = getSize().height;
		int screenWidth = getSize().width;
		int barWidth = screenWidth/values.length;

	    double scale = (screenHeight) / (maxValue - minValue);
	   
	    for (int i = 0; i < values.length; i++) {
	      int valueX = i * barWidth;
	      int valueY = (int) values[i];
	      int height = (int) (values[i] * scale);
	      if (values[i] >= 0)
	        valueY += (int) ((maxValue - values[i]) * scale);
	      else {
	        valueY += (int) (maxValue * scale);
	        height = -height;
	      }

	      g.setColor(Color.red);
	      g.fillRect(valueX, valueY, barWidth, height);
	      g.setColor(Color.black);
	      //g.drawString(names[i], valueX, valueY);
	   
	    }

		
	}
	
}
