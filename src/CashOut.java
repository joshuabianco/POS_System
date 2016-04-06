import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class CashOut {

	static JTextArea cashOutArea;
	static JFrame frame;

	/**
	 * Create the application.
	 */
	public CashOut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);

		JButton Credit = new JButton("Credit/Debit");
		Credit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = ((JButton) e.getSource()).getActionCommand();
				operations.processPayment(command);
			}
		});
		Credit.setBounds(71, 42, 122, 49);
		frame.getContentPane().add(Credit);

		JButton Cash = new JButton("Cash");
		Cash.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		Cash.setBounds(71, 135, 122, 49);
		frame.getContentPane().add(Cash);

		JButton GiftCard = new JButton("GiftCard");
		GiftCard.setBounds(71, 223, 122, 49);
		frame.getContentPane().add(GiftCard);

		cashOutArea = new JTextArea();
		cashOutArea.setBounds(153, 42, 221, 315);
		frame.getContentPane().add(cashOutArea);
		cashOutArea.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		operations.setCashArea(cashOutArea);

		JButton discount = new JButton("Discount");
		discount.setBounds(71, 308, 122, 49);
		frame.getContentPane().add(discount);

		JScrollPane scrollPane = new JScrollPane(cashOutArea);
		scrollPane.setBounds(290, 42, 356, 315);
		frame.getContentPane().add(scrollPane);
		frame.setBounds(100, 100, 672, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
