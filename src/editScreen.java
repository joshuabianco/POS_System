import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class editScreen {

	public static JFrame frame;
	public static DefaultListModel listModel, listModel1;
	public static JList itemsInList, itemsToChange;

	public editScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		listModel = new DefaultListModel();
		operations.populateList(listModel, operations.itemList);
		itemsInList = new JList(listModel);
		itemsInList.setBounds(42, 56, 217, 312);
		frame.getContentPane().add(itemsInList);
		
		listModel1 = new DefaultListModel();
		operations.populateList(listModel1, operations.removeList);
		itemsToChange = new JList(listModel1);
		itemsToChange.setBounds(370, 56, 217, 312);
		frame.getContentPane().add(itemsToChange);
		
		JButton Back = new JButton("Cancel");
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations.cancelEdit();
			}
		});
		Back.setBounds(66, 420, 124, 57);
		frame.getContentPane().add(Back);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations.deleteItem();
			}
		});
		btnDelete.setBounds(269, 187, 89, 40);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton = new JButton("Accept");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operations.acceptChanges();
			}
		});
		btnNewButton.setBounds(439, 420, 124, 57);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 652, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
