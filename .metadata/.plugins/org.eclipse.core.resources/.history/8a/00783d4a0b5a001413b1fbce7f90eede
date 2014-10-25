import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Ex2 {

	private JFrame frame;
	private JTextField txtEnterAmountTo;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 window = new Ex2();
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
	public Ex2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtEnterAmountTo = new JTextField();
		txtEnterAmountTo.setText("Enter amount to convert");
		txtEnterAmountTo.setToolTipText("");
		frame.getContentPane().add(txtEnterAmountTo, BorderLayout.NORTH);
		txtEnterAmountTo.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert amount");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GBP", "EUR", "USD", "YEN"}));
		frame.getContentPane().add(comboBox, BorderLayout.WEST);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"GBP", "EUR", "USD", "YEN"}));
		frame.getContentPane().add(comboBox_1, BorderLayout.EAST);
	}

}
