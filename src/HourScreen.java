import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HourScreen {

	static JFrame frame;

	/**
	 * Create the application.
	 */
	public HourScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 717, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// the stuff for the add button
				//
				
				
			}
		});
		btnAdd.setBounds(316, 120, 85, 50);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// the stuff for the edit button
				//	
				//
			}
		});
		btnEdit.setBounds(316, 222, 85, 50);
		frame.getContentPane().add(btnEdit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.backManage();
			}
		});
		btnBack.setBounds(40, 377, 85, 50);
		frame.getContentPane().add(btnBack);
		
		JList<String> EmployeeNames = new JList<String>();		//JList 
		EmployeeNames.setBorder(null);
		EmployeeNames.setBackground(Color.WHITE);
		EmployeeNames.setBounds(40, 41, 225, 299);
		frame.getContentPane().add(EmployeeNames);
		
		JList<String> EmployeeHours = new JList<String>();		//JList 
		EmployeeHours.setBorder(null);
		EmployeeHours.setBounds(444, 41, 225, 299);
		frame.getContentPane().add(EmployeeHours);
	}
}
