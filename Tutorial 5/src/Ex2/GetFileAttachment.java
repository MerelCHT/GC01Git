package Students;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Label;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CurrencyGUI {

	private JFrame frame;
	private JTextField amount;
	private JButton btnNewButton;
	String Currency1 = "GBP";
	String Currency2 = "GBP";
	static int actualValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyGUI window = new CurrencyGUI();
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
	public CurrencyGUI() {
		initialize();
	}

	//This determines from which currency to which other currency the user wants to convert, and then converts the amount entered
	//with the right currency rate. 
	public static double converter(double amount, String C1, String C2){
		if(C1.equals("GBP") && C2.equals("EUR")){
			amount = amount * 1.28;
		}	
		else if(C1.equals("GBP") && C2.equals("USD")){
			amount = amount * 1.60;
		}
		else if(C1.equals("GBP") && C2.equals("YEN")){
			amount = amount * 173.10;
		}
		else if(C1.equals("EUR") && C2.equals("YEN")){
			amount = amount * 136.72;
		}
		else if(C1.equals("EUR") && C2.equals("USD")){
			amount = amount * 1.26;
		}
		else if(C1.equals("EUR") && C2.equals("GBP")){
			amount = amount * 0.79;
		}
		else if(C1.equals("USD") && C2.equals("YEN")){
			amount = amount * 107.91;
		}
		else if(C1.equals("USD") && C2.equals("EUR")){
			amount = amount * 0.79;
		}
		else if(C1.equals("USD") && C2.equals("GBP")){
			amount = amount * 0.62;
		}
		else if(C1.equals("YEN") && C2.equals("EUR")){
			amount = amount * 0.0073;
		}
		else if(C1.equals("YEN") && C2.equals("USD")){
			amount = amount * 0.0093;
		}
		else if(C1.equals("YEN") && C2.equals("GBP")){
			amount = amount * 0.0058;
		}
		else{
			amount = amount * 1;
		}
		
		return amount;
		
	}
			
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Set the label "enter amount" in front of the field where you put in the amount you want to convert.
		JLabel lblEnterAmount = new JLabel("Enter amount");
		lblEnterAmount.setBounds(24, 173, 94, 16);
		frame.getContentPane().add(lblEnterAmount);
		
		//Creates a text field where you can enter an amount to convert. 
		amount = new JTextField();
		amount.setBounds(118, 167, 134, 28);
		frame.getContentPane().add(amount);
		amount.setColumns(10);
		
		//Creates a button which, when clicked, will run the calculations. 
		/*
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
				    actualValue = Integer.parseInt(amount.getText());
				}
				catch (NumberFormatException f)
				{
				    System.out.println("Not a number");
				}
			}
		});
		*/
		btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if (e.getSource() == btnNewButton){
				System.out.println(amount.getText());
					try
					{
					    actualValue = Integer.parseInt(amount.getText());
					}
					catch (NumberFormatException f)
					{
					    System.out.println("Not a number");
					}
					double output = converter(actualValue, Currency1, Currency2);
					System.out.println(output);				
				//}
			}
		});
		btnNewButton.setBounds(279, 168, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		//Label for the ComboBox convert from. 
		JLabel lblConvertFrom = new JLabel("Convert from:");
		lblConvertFrom.setBounds(34, 6, 94, 16);
		frame.getContentPane().add(lblConvertFrom);
		
		//Label for the ComboBox convert to. 
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(279, 6, 61, 16);
		frame.getContentPane().add(lblTo);
		
		//ComboBox where you can select from which currency you want to convert. 
		JComboBox fromCurrency = new JComboBox(new String[]{"GBP", "EUR", "USD", "YEN"});
		fromCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox fromCurrency = (JComboBox)e.getSource();
		        String fCurrency = (String)fromCurrency.getSelectedItem();
		      
		        if(fCurrency.equals("EUR")){
		        	Currency1 = "EUR";
		        }
		        else if(fCurrency.equals("USD")){
		        	Currency1 = "USD";
		        }
		        else if(fCurrency.equals("GBP")){
		        	Currency1 = "GBP";
		        }
		        else
		        {
		        	Currency1 = "YEN";
		        }
			}
		});
		
		fromCurrency.setBounds(44, 34, 84, 27);
		frame.getContentPane().add(fromCurrency);
		
		//ComboBox where you can select to which currency you want to convert.
		JComboBox toCurrency = new JComboBox(new String[]{"GBP", "EUR", "USD", "YEN"});
		toCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox toCurrency = (JComboBox)e.getSource();
		        String tCurrency = (String)toCurrency.getSelectedItem();
		       
		        if(tCurrency.equals("EUR")){
		        	Currency2 = "EUR";
		        }
		        else if(tCurrency.equals("USD")){
		        	Currency2 = "USD";
		        }
		        else if(tCurrency.equals("GBP")){
		        	Currency2 = "GBP";
		        }
		        else
		        {
		        	Currency2 = "YEN";
		        }
			}
		});
		
		toCurrency.setBounds(279, 34, 82, 27);
		frame.getContentPane().add(toCurrency);
	}
}