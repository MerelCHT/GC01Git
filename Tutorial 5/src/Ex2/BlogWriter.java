package Ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JTextArea;

public class BlogWriter {

	private JFrame frame;
	private JTextField time;
	private JTextField date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlogWriter window = new BlogWriter();
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
	public BlogWriter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblWriteNewBlog = new JLabel("Write new blog post:");
		lblWriteNewBlog.setBounds(43, 86, 139, 16);
		panel.add(lblWriteNewBlog);
		
		final JTextArea enterPost = new JTextArea();
		enterPost.setBounds(42, 110, 344, 121);
		panel.add(enterPost);
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					System.out.println("Time: " + time.getText());
				    System.out.println("Date: " + date.getText());
				    System.out.println(enterPost.getText());
				    
				}
				catch (NumberFormatException f)
				{
					
				}
				String post = time.getText() + " "+ date.getText() + "\n" + enterPost.getText();
				try{
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blog.html", true)));
					pw.println(post);
					pw.close();
				}
				catch (IOException g) { }
			
			}
		});
		btnSubmit.setBounds(299, 243, 117, 29);
		panel.add(btnSubmit);
		
		JLabel lblEnterTime = new JLabel("Enter time:");
		lblEnterTime.setBounds(43, 6, 82, 16);
		panel.add(lblEnterTime);
		
		JLabel lblEnterDate = new JLabel("Enter date:");
		lblEnterDate.setBounds(43, 37, 82, 16);
		panel.add(lblEnterDate);
		
		time = new JTextField();
		time.setBounds(137, 0, 134, 28);
		panel.add(time);
		time.setColumns(10);
		
		date = new JTextField();
		date.setBounds(137, 31, 134, 28);
		panel.add(date);
		date.setColumns(10);
		
		
		
		
	}
}
