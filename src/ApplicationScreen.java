import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;

public class ApplicationScreen {

	static JFrame frame;
	static JTextField textField;
	static JTextArea txtrHereIsSome;
	static JButton ClockInOut;

	/**
	 * Create the application.
	 */
	public ApplicationScreen(boolean manager) {
		initialize(manager);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(boolean manager) {
		frame = new JFrame();
		frame.setEnabled(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1120, 906);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setFocusTraversalKeysEnabled(false);
		panel_1.setDoubleBuffered(false);
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));

		txtrHereIsSome = new JTextArea();
		txtrHereIsSome.setMaximumSize(new Dimension(4, 22));
		txtrHereIsSome.setRequestFocusEnabled(false);
		txtrHereIsSome.setAutoscrolls(false);
		txtrHereIsSome.setEditable(false);
		txtrHereIsSome.setCaretColor(new Color(0, 0, 0));
		txtrHereIsSome.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrHereIsSome.setForeground(new Color(0, 0, 255));
		txtrHereIsSome.setBackground(new Color(240, 230, 140));
		txtrHereIsSome.setLineWrap(true);
		txtrHereIsSome.setTabSize(6);
		txtrHereIsSome.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		txtrHereIsSome.setColumns(25);
		txtrHereIsSome.setRows(20);
		// panel_1.add(txtrHereIsSome, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(txtrHereIsSome);
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.add(scrollPane, BorderLayout.NORTH);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_1.add(panel_7, BorderLayout.CENTER);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[] { 30, 85, 85, 85, 30 };
		gbl_panel_7.rowHeights = new int[] { 30, 50, 50, 60, 60, 60, 60, 60 };
		gbl_panel_7.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0 };
		gbl_panel_7.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0 };
		panel_7.setLayout(gbl_panel_7);

		textField = new JTextField();
		textField.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_7.add(textField, gbc_textField);
		textField.setColumns(10);

		Button one = new Button("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		one.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_one = new GridBagConstraints();
		gbc_one.fill = GridBagConstraints.BOTH;
		gbc_one.insets = new Insets(0, 0, 5, 5);
		gbc_one.gridx = 1;
		gbc_one.gridy = 3;
		panel_7.add(one, gbc_one);

		Button two = new Button("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		two.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 2;
		gbc_button_4.gridy = 3;
		panel_7.add(two, gbc_button_4);

		Button three = new Button("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = ((Button) arg0.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		three.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_three = new GridBagConstraints();
		gbc_three.fill = GridBagConstraints.BOTH;
		gbc_three.insets = new Insets(0, 0, 5, 5);
		gbc_three.gridx = 3;
		gbc_three.gridy = 3;
		panel_7.add(three, gbc_three);

		Button four = new Button("4");
		four.setBackground(SystemColor.activeCaptionBorder);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		GridBagConstraints gbc_four = new GridBagConstraints();
		gbc_four.fill = GridBagConstraints.BOTH;
		gbc_four.insets = new Insets(0, 0, 5, 5);
		gbc_four.gridx = 1;
		gbc_four.gridy = 4;
		panel_7.add(four, gbc_four);

		Button five = new Button("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		five.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_five = new GridBagConstraints();
		gbc_five.fill = GridBagConstraints.BOTH;
		gbc_five.insets = new Insets(0, 0, 5, 5);
		gbc_five.gridx = 2;
		gbc_five.gridy = 4;
		panel_7.add(five, gbc_five);

		Button six = new Button("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		six.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_six = new GridBagConstraints();
		gbc_six.fill = GridBagConstraints.BOTH;
		gbc_six.insets = new Insets(0, 0, 5, 5);
		gbc_six.gridx = 3;
		gbc_six.gridy = 4;
		panel_7.add(six, gbc_six);

		Button seven = new Button("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		seven.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_seven = new GridBagConstraints();
		gbc_seven.fill = GridBagConstraints.BOTH;
		gbc_seven.insets = new Insets(0, 0, 5, 5);
		gbc_seven.gridx = 1;
		gbc_seven.gridy = 5;
		panel_7.add(seven, gbc_seven);

		Button eight = new Button("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		eight.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_eight = new GridBagConstraints();
		gbc_eight.fill = GridBagConstraints.BOTH;
		gbc_eight.insets = new Insets(0, 0, 5, 5);
		gbc_eight.gridx = 2;
		gbc_eight.gridy = 5;
		panel_7.add(eight, gbc_eight);

		Button nine = new Button("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		nine.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_nine = new GridBagConstraints();
		gbc_nine.fill = GridBagConstraints.BOTH;
		gbc_nine.insets = new Insets(0, 0, 5, 5);
		gbc_nine.gridx = 3;
		gbc_nine.gridy = 5;
		panel_7.add(nine, gbc_nine);

		Button zero = new Button("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ((Button) e.getSource()).getActionCommand();
				operations.addCalcNum(command);
			}
		});
		zero.setBackground(SystemColor.activeCaptionBorder);
		GridBagConstraints gbc_zero = new GridBagConstraints();
		gbc_zero.fill = GridBagConstraints.BOTH;
		gbc_zero.insets = new Insets(0, 0, 5, 5);
		gbc_zero.gridx = 2;
		gbc_zero.gridy = 6;
		panel_7.add(zero, gbc_zero);

		Button button_5 = new Button("Clear");
		button_5.setBackground(SystemColor.activeCaptionBorder);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.clearCalc();
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 3;
		gbc_button_5.gridy = 6;
		panel_7.add(button_5, gbc_button_5);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel_3.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 240, 100, 100, 30, 30, 30, 30, 30,
				30, 30, 100, 0 };
		gbl_panel.rowHeights = new int[] { 50, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JTextPane txtpnDdmmyyyy = new JTextPane();
		txtpnDdmmyyyy.setBackground(Color.BLACK);
		txtpnDdmmyyyy.setForeground(Color.WHITE);
		txtpnDdmmyyyy.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 26));
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		txtpnDdmmyyyy.setText(currentDate);
		GridBagConstraints gbc_txtpnDdmmyyyy = new GridBagConstraints();
		gbc_txtpnDdmmyyyy.anchor = GridBagConstraints.LINE_START;
		gbc_txtpnDdmmyyyy.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnDdmmyyyy.gridx = 0;
		gbc_txtpnDdmmyyyy.gridy = 0;
		panel.add(txtpnDdmmyyyy, gbc_txtpnDdmmyyyy);
		
		ClockInOut = new JButton("Clocked Out");
		ClockInOut.setRequestFocusEnabled(false);
		ClockInOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.clockIn();
			}
		});
		ClockInOut.setBackground(Color.RED);
		ClockInOut.setForeground(Color.BLACK);
		GridBagConstraints gbc_ClockInOut = new GridBagConstraints();
		gbc_ClockInOut.fill = GridBagConstraints.BOTH;
		gbc_ClockInOut.gridwidth = 4;
		gbc_ClockInOut.insets = new Insets(0, 0, 0, 5);
		gbc_ClockInOut.gridx = 3;
		gbc_ClockInOut.gridy = 0;
		panel.add(ClockInOut, gbc_ClockInOut);

		JButton btnManage = new JButton("Manage");
		btnManage.setRequestFocusEnabled(false);
		btnManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.manage();
			}
		});
		GridBagConstraints gbc_btnManage = new GridBagConstraints();
		gbc_btnManage.fill = GridBagConstraints.BOTH;
		gbc_btnManage.gridx = 10;
		gbc_btnManage.gridy = 0;
		panel.add(btnManage, gbc_btnManage);
		if (manager) {
			btnManage.setEnabled(true);
			btnManage.setVisible(true);
		} else {
			btnManage.setEnabled(false);
			btnManage.setVisible(false);
		}

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_3.add(panel_2, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {100, 100, 30, 100, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 30, 30};
		gbl_panel_2.rowHeights = new int[] { 50, 10 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_2.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		Button button_46 = new Button("Edit Order");
		button_46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.editOrder();
			}
		});
		button_46.setForeground(Color.BLACK);
		button_46.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_button_46 = new GridBagConstraints();
		gbc_button_46.fill = GridBagConstraints.BOTH;
		gbc_button_46.insets = new Insets(0, 0, 0, 5);
		gbc_button_46.gridx = 1;
		gbc_button_46.gridy = 0;
		panel_2.add(button_46, gbc_button_46);

		Button button_47 = new Button("Cash Out");
		button_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.clearArea();
			}
		});
		button_47.setForeground(Color.BLACK);
		button_47.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_button_47 = new GridBagConstraints();
		gbc_button_47.insets = new Insets(0, 0, 0, 5);
		gbc_button_47.fill = GridBagConstraints.BOTH;
		gbc_button_47.gridx = 3;
		gbc_button_47.gridy = 0;
		panel_2.add(button_47, gbc_button_47);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.logOut();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 5;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridx = 11;
		gbc_btnNewButton.gridy = 0;
		panel_2.add(btnNewButton, gbc_btnNewButton);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFocusCycleRoot(true);
		tabbedPane.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		panel_3.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 20));
		panel_4.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Entree", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 50, 140, 140, 140, 140, 140, 50 };
		gbl_panel_4.rowHeights = new int[] { 50, 100, 100, 100, 100, 100, 30 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0 };
		gbl_panel_4.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0 };
		panel_4.setLayout(gbl_panel_4);

		JButton ClassicBurger = new JButton("");
		ClassicBurger.setRequestFocusEnabled(false);
		ClassicBurger.setVerticalAlignment(SwingConstants.BOTTOM);
		ClassicBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ClassicBurger");
			}
		});

		JButton btnBurgerCombo = new JButton("Burger Combo");
		btnBurgerCombo.setRequestFocusEnabled(false);
		GridBagConstraints gbc_btnBurgerCombo = new GridBagConstraints();
		gbc_btnBurgerCombo.fill = GridBagConstraints.BOTH;
		gbc_btnBurgerCombo.insets = new Insets(0, 0, 5, 5);
		gbc_btnBurgerCombo.gridx = 1;
		gbc_btnBurgerCombo.gridy = 0;
		panel_4.add(btnBurgerCombo, gbc_btnBurgerCombo);

		JButton btnWingCombo = new JButton("Wing Combo");
		btnWingCombo.setRequestFocusEnabled(false);
		GridBagConstraints gbc_btnWingCombo = new GridBagConstraints();
		gbc_btnWingCombo.fill = GridBagConstraints.BOTH;
		gbc_btnWingCombo.insets = new Insets(0, 0, 5, 5);
		gbc_btnWingCombo.gridx = 2;
		gbc_btnWingCombo.gridy = 0;
		panel_4.add(btnWingCombo, gbc_btnWingCombo);

		JButton btnNewButton_25 = new JButton("Sandwhich Combo");
		btnNewButton_25.setRequestFocusEnabled(false);
		GridBagConstraints gbc_btnNewButton_25 = new GridBagConstraints();
		gbc_btnNewButton_25.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_25.gridx = 3;
		gbc_btnNewButton_25.gridy = 0;
		panel_4.add(btnNewButton_25, gbc_btnNewButton_25);

		JButton btnNewButton_26 = new JButton("Pasta Combo");
		btnNewButton_26.setRequestFocusEnabled(false);
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton_26 = new GridBagConstraints();
		gbc_btnNewButton_26.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_26.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_26.gridx = 4;
		gbc_btnNewButton_26.gridy = 0;
		panel_4.add(btnNewButton_26, gbc_btnNewButton_26);

		JButton btnPizzaCombo = new JButton("Pizza Combo");
		btnPizzaCombo.setRequestFocusEnabled(false);
		GridBagConstraints gbc_btnPizzaCombo = new GridBagConstraints();
		gbc_btnPizzaCombo.fill = GridBagConstraints.BOTH;
		gbc_btnPizzaCombo.insets = new Insets(0, 0, 5, 5);
		gbc_btnPizzaCombo.gridx = 5;
		gbc_btnPizzaCombo.gridy = 0;
		panel_4.add(btnPizzaCombo, gbc_btnPizzaCombo);
		ClassicBurger.setBackground(Color.WHITE);
		ClassicBurger.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/ClassicBurger.PNG")));
		GridBagConstraints gbc_ClassicBurger = new GridBagConstraints();
		gbc_ClassicBurger.fill = GridBagConstraints.BOTH;
		gbc_ClassicBurger.insets = new Insets(0, 0, 5, 5);
		gbc_ClassicBurger.gridx = 1;
		gbc_ClassicBurger.gridy = 1;
		panel_4.add(ClassicBurger, gbc_ClassicBurger);

		JButton HotWings = new JButton("");
		HotWings.setRequestFocusEnabled(false);
		HotWings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("HotWings");
			}
		});
		HotWings.setBackground(Color.WHITE);
		HotWings.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/HotWings.jpg")));
		GridBagConstraints gbc_HotWings = new GridBagConstraints();
		gbc_HotWings.insets = new Insets(0, 0, 5, 5);
		gbc_HotWings.gridx = 2;
		gbc_HotWings.gridy = 1;
		panel_4.add(HotWings, gbc_HotWings);

		JButton ChickenSandwhich = new JButton("");
		ChickenSandwhich.setRequestFocusEnabled(false);
		ChickenSandwhich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ChickenSandwich");
			}
		});
		ChickenSandwhich.setBackground(Color.WHITE);
		ChickenSandwhich.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/ChickenSandwhich.PNG")));
		ChickenSandwhich.setRolloverEnabled(false);
		GridBagConstraints gbc_ChickenSandwhich = new GridBagConstraints();
		gbc_ChickenSandwhich.fill = GridBagConstraints.BOTH;
		gbc_ChickenSandwhich.insets = new Insets(0, 0, 5, 5);
		gbc_ChickenSandwhich.gridx = 3;
		gbc_ChickenSandwhich.gridy = 1;
		panel_4.add(ChickenSandwhich, gbc_ChickenSandwhich);

		JButton Capellini = new JButton("");
		Capellini.setRequestFocusEnabled(false);
		Capellini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Capellini");
			}
		});
		Capellini.setBackground(Color.WHITE);
		Capellini.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Capellini.jpg")));
		GridBagConstraints gbc_Capellini = new GridBagConstraints();
		gbc_Capellini.fill = GridBagConstraints.BOTH;
		gbc_Capellini.insets = new Insets(0, 0, 5, 5);
		gbc_Capellini.gridx = 4;
		gbc_Capellini.gridy = 1;
		panel_4.add(Capellini, gbc_Capellini);

		JButton California = new JButton("");
		California.setRequestFocusEnabled(false);
		California.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("California");
			}
		});
		California.setBackground(Color.WHITE);
		California.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/California.jpg")));
		GridBagConstraints gbc_California = new GridBagConstraints();
		gbc_California.fill = GridBagConstraints.BOTH;
		gbc_California.insets = new Insets(0, 0, 5, 5);
		gbc_California.gridx = 5;
		gbc_California.gridy = 1;
		panel_4.add(California, gbc_California);

		JButton BaconBurger = new JButton("");
		BaconBurger.setRequestFocusEnabled(false);
		BaconBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.addText("BaconBurger");
			}
		});
		BaconBurger.setBackground(Color.WHITE);
		BaconBurger.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/BaconBurger.jpg")));
		BaconBurger.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_BaconBurger = new GridBagConstraints();
		gbc_BaconBurger.fill = GridBagConstraints.BOTH;
		gbc_BaconBurger.insets = new Insets(0, 0, 5, 5);
		gbc_BaconBurger.gridx = 1;
		gbc_BaconBurger.gridy = 2;
		panel_4.add(BaconBurger, gbc_BaconBurger);

		JButton SpicyGarlic = new JButton("");
		SpicyGarlic.setRequestFocusEnabled(false);
		SpicyGarlic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("SpicyGarlic  ");
			}
		});
		SpicyGarlic.setBackground(Color.WHITE);
		SpicyGarlic.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/SpicyGarlic.jpg")));
		GridBagConstraints gbc_SpicyGarlic = new GridBagConstraints();
		gbc_SpicyGarlic.fill = GridBagConstraints.BOTH;
		gbc_SpicyGarlic.insets = new Insets(0, 0, 5, 5);
		gbc_SpicyGarlic.gridx = 2;
		gbc_SpicyGarlic.gridy = 2;
		panel_4.add(SpicyGarlic, gbc_SpicyGarlic);

		JButton SpicyChicken = new JButton("");
		SpicyChicken.setRequestFocusEnabled(false);
		SpicyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.addText("SpicyChicken");
			}
		});
		SpicyChicken.setBackground(Color.WHITE);
		SpicyChicken.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/SpicyChicken.PNG")));
		GridBagConstraints gbc_SpicyChicken = new GridBagConstraints();
		gbc_SpicyChicken.fill = GridBagConstraints.BOTH;
		gbc_SpicyChicken.insets = new Insets(0, 0, 5, 5);
		gbc_SpicyChicken.gridx = 3;
		gbc_SpicyChicken.gridy = 2;
		panel_4.add(SpicyChicken, gbc_SpicyChicken);

		JButton Spaghetti = new JButton("");
		Spaghetti.setRequestFocusEnabled(false);
		Spaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Spaghetti");
			}
		});
		Spaghetti.setBackground(Color.WHITE);
		Spaghetti.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Spaghetti.jpg")));
		GridBagConstraints gbc_Spaghetti = new GridBagConstraints();
		gbc_Spaghetti.fill = GridBagConstraints.BOTH;
		gbc_Spaghetti.insets = new Insets(0, 0, 5, 5);
		gbc_Spaghetti.gridx = 4;
		gbc_Spaghetti.gridy = 2;
		panel_4.add(Spaghetti, gbc_Spaghetti);

		JButton DeepDish = new JButton("");
		DeepDish.setRequestFocusEnabled(false);
		DeepDish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("DeepDish");
			}
		});
		DeepDish.setBackground(Color.WHITE);
		DeepDish.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Deep Dish.jpg")));
		GridBagConstraints gbc_DeepDish = new GridBagConstraints();
		gbc_DeepDish.fill = GridBagConstraints.BOTH;
		gbc_DeepDish.insets = new Insets(0, 0, 5, 5);
		gbc_DeepDish.gridx = 5;
		gbc_DeepDish.gridy = 2;
		panel_4.add(DeepDish, gbc_DeepDish);

		JButton BuffaloBurger = new JButton("");
		BuffaloBurger.setRequestFocusEnabled(false);
		BuffaloBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("BuffaloBurger");
			}
		});
		BuffaloBurger.setBackground(Color.WHITE);
		BuffaloBurger.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/BuffaloBurger.jpg")));
		BuffaloBurger.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_BuffaloBurger = new GridBagConstraints();
		gbc_BuffaloBurger.fill = GridBagConstraints.BOTH;
		gbc_BuffaloBurger.insets = new Insets(0, 0, 5, 5);
		gbc_BuffaloBurger.gridx = 1;
		gbc_BuffaloBurger.gridy = 3;
		panel_4.add(BuffaloBurger, gbc_BuffaloBurger);

		JButton ThaiCurry = new JButton("");
		ThaiCurry.setRequestFocusEnabled(false);
		ThaiCurry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ThaiCurry");
			}
		});
		ThaiCurry.setBackground(Color.WHITE);
		ThaiCurry.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Thai Curry.jpg")));
		GridBagConstraints gbc_ThaiCurry = new GridBagConstraints();
		gbc_ThaiCurry.fill = GridBagConstraints.BOTH;
		gbc_ThaiCurry.insets = new Insets(0, 0, 5, 5);
		gbc_ThaiCurry.gridx = 2;
		gbc_ThaiCurry.gridy = 3;
		panel_4.add(ThaiCurry, gbc_ThaiCurry);

		JButton BLT = new JButton("");
		BLT.setRequestFocusEnabled(false);
		BLT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("BLT");
			}
		});
		BLT.setBackground(Color.WHITE);
		BLT.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/BLT.jpg")));
		GridBagConstraints gbc_BLT = new GridBagConstraints();
		gbc_BLT.fill = GridBagConstraints.BOTH;
		gbc_BLT.insets = new Insets(0, 0, 5, 5);
		gbc_BLT.gridx = 3;
		gbc_BLT.gridy = 3;
		panel_4.add(BLT, gbc_BLT);

		JButton Fusilli = new JButton("");
		Fusilli.setRequestFocusEnabled(false);
		Fusilli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Fusilli");
			}
		});
		Fusilli.setBackground(Color.WHITE);
		Fusilli.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Fusili.jpg")));
		GridBagConstraints gbc_Fusilli = new GridBagConstraints();
		gbc_Fusilli.fill = GridBagConstraints.BOTH;
		gbc_Fusilli.insets = new Insets(0, 0, 5, 5);
		gbc_Fusilli.gridx = 4;
		gbc_Fusilli.gridy = 3;
		panel_4.add(Fusilli, gbc_Fusilli);

		JButton ThinCrust = new JButton("");
		ThinCrust.setRequestFocusEnabled(false);
		ThinCrust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ThinCrust");
			}
		});
		ThinCrust.setBackground(Color.WHITE);
		ThinCrust.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Thin Crust.jpg")));
		GridBagConstraints gbc_ThinCrust = new GridBagConstraints();
		gbc_ThinCrust.fill = GridBagConstraints.BOTH;
		gbc_ThinCrust.insets = new Insets(0, 0, 5, 5);
		gbc_ThinCrust.gridx = 5;
		gbc_ThinCrust.gridy = 3;
		panel_4.add(ThinCrust, gbc_ThinCrust);

		JButton ChiliBurger = new JButton("");
		ChiliBurger.setRequestFocusEnabled(false);
		ChiliBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ChiliBurger");
			}
		});
		ChiliBurger.setBackground(Color.WHITE);
		ChiliBurger.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/ChiliBurger.PNG")));
		ChiliBurger.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_ChiliBurger = new GridBagConstraints();
		gbc_ChiliBurger.fill = GridBagConstraints.BOTH;
		gbc_ChiliBurger.insets = new Insets(0, 0, 5, 5);
		gbc_ChiliBurger.gridx = 1;
		gbc_ChiliBurger.gridy = 4;
		panel_4.add(ChiliBurger, gbc_ChiliBurger);

		JButton SweetBBQ = new JButton("");
		SweetBBQ.setRequestFocusEnabled(false);
		SweetBBQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("SweetBBQ");
			}
		});
		SweetBBQ.setBackground(Color.WHITE);
		SweetBBQ.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/SweetBBQ.jpg")));
		GridBagConstraints gbc_SweetBBQ = new GridBagConstraints();
		gbc_SweetBBQ.fill = GridBagConstraints.BOTH;
		gbc_SweetBBQ.insets = new Insets(0, 0, 5, 5);
		gbc_SweetBBQ.gridx = 2;
		gbc_SweetBBQ.gridy = 4;
		panel_4.add(SweetBBQ, gbc_SweetBBQ);

		JButton Cheesesteak = new JButton("");
		Cheesesteak.setRequestFocusEnabled(false);
		Cheesesteak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Cheesesteak");
			}
		});
		Cheesesteak.setBackground(Color.WHITE);
		Cheesesteak.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Cheesesteak.jpg")));
		GridBagConstraints gbc_Cheesesteak = new GridBagConstraints();
		gbc_Cheesesteak.fill = GridBagConstraints.BOTH;
		gbc_Cheesesteak.insets = new Insets(0, 0, 5, 5);
		gbc_Cheesesteak.gridx = 3;
		gbc_Cheesesteak.gridy = 4;
		panel_4.add(Cheesesteak, gbc_Cheesesteak);

		JButton Tripoline = new JButton("");
		Tripoline.setRequestFocusEnabled(false);
		Tripoline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Tripoline");
			}
		});
		Tripoline.setBackground(Color.WHITE);
		Tripoline.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Tripoline.jpg")));
		GridBagConstraints gbc_Tripoline = new GridBagConstraints();
		gbc_Tripoline.fill = GridBagConstraints.BOTH;
		gbc_Tripoline.insets = new Insets(0, 0, 5, 5);
		gbc_Tripoline.gridx = 4;
		gbc_Tripoline.gridy = 4;
		panel_4.add(Tripoline, gbc_Tripoline);

		JButton Neopolitan = new JButton("");
		Neopolitan.setRequestFocusEnabled(false);
		Neopolitan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Neopolitan");
			}
		});
		Neopolitan.setBackground(Color.WHITE);
		Neopolitan.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Neopolitan.jpg")));
		GridBagConstraints gbc_Neopolitan = new GridBagConstraints();
		gbc_Neopolitan.fill = GridBagConstraints.BOTH;
		gbc_Neopolitan.insets = new Insets(0, 0, 5, 5);
		gbc_Neopolitan.gridx = 5;
		gbc_Neopolitan.gridy = 4;
		panel_4.add(Neopolitan, gbc_Neopolitan);

		JButton UmamiBurger = new JButton("");
		UmamiBurger.setRequestFocusEnabled(false);
		UmamiBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("UmamiBurger");
			}
		});
		UmamiBurger.setBackground(Color.WHITE);
		UmamiBurger.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/UmamiBurger.PNG")));
		UmamiBurger.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_UmamiBurger = new GridBagConstraints();
		gbc_UmamiBurger.fill = GridBagConstraints.BOTH;
		gbc_UmamiBurger.insets = new Insets(0, 0, 5, 5);
		gbc_UmamiBurger.gridx = 1;
		gbc_UmamiBurger.gridy = 5;
		panel_4.add(UmamiBurger, gbc_UmamiBurger);

		JButton DeathWings = new JButton("");
		DeathWings.setRequestFocusEnabled(false);
		DeathWings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("DeathWings");
			}
		});
		DeathWings.setBackground(Color.WHITE);
		DeathWings.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/DeathWings.jpg")));
		GridBagConstraints gbc_DeathWings = new GridBagConstraints();
		gbc_DeathWings.fill = GridBagConstraints.BOTH;
		gbc_DeathWings.insets = new Insets(0, 0, 5, 5);
		gbc_DeathWings.gridx = 2;
		gbc_DeathWings.gridy = 5;
		panel_4.add(DeathWings, gbc_DeathWings);

		JButton ClubSandwhich = new JButton("");
		ClubSandwhich.setRequestFocusEnabled(false);
		ClubSandwhich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("ClubSandwich");
			}
		});
		ClubSandwhich.setBackground(Color.WHITE);
		ClubSandwhich.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/ClubSandwich.png")));
		GridBagConstraints gbc_ClubSandwhich = new GridBagConstraints();
		gbc_ClubSandwhich.fill = GridBagConstraints.BOTH;
		gbc_ClubSandwhich.insets = new Insets(0, 0, 5, 5);
		gbc_ClubSandwhich.gridx = 3;
		gbc_ClubSandwhich.gridy = 5;
		panel_4.add(ClubSandwhich, gbc_ClubSandwhich);

		JButton Ziti = new JButton("");
		Ziti.setRequestFocusEnabled(false);
		Ziti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Ziti");
			}
		});
		Ziti.setBackground(Color.WHITE);
		Ziti.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/MenuIcons/Ziti.jpg")));
		GridBagConstraints gbc_Ziti = new GridBagConstraints();
		gbc_Ziti.fill = GridBagConstraints.BOTH;
		gbc_Ziti.insets = new Insets(0, 0, 5, 5);
		gbc_Ziti.gridx = 4;
		gbc_Ziti.gridy = 5;
		panel_4.add(Ziti, gbc_Ziti);

		JButton NewYorkStyle = new JButton("");
		NewYorkStyle.setRequestFocusEnabled(false);
		NewYorkStyle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations.addText("NewYorkStyle");
			}
		});
		NewYorkStyle.setBackground(Color.WHITE);
		NewYorkStyle.setIcon(new ImageIcon(ApplicationScreen.class.getResource("/MenuIcons/NewYorkStyle.PNG")));
		GridBagConstraints gbc_NewYorkStyle = new GridBagConstraints();
		gbc_NewYorkStyle.fill = GridBagConstraints.BOTH;
		gbc_NewYorkStyle.insets = new Insets(0, 0, 5, 5);
		gbc_NewYorkStyle.gridx = 5;
		gbc_NewYorkStyle.gridy = 5;
		panel_4.add(NewYorkStyle, gbc_NewYorkStyle);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 20));
		panel_5.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Drinks", null, panel_5, null);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] { 50, 180, 180, 180, 50 };
		gbl_panel_5.rowHeights = new int[] { 50, 200, 200, 200, 50 };
		gbl_panel_5.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_5.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel_5.setLayout(gbl_panel_5);

		JButton SevenUp = new JButton(new ImageIcon(
				ApplicationScreen.class.getResource("/DrinkIcons/7up.jpg")));
		SevenUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("7up");
			}
		});
		SevenUp.setBackground(Color.WHITE);
		// btnDrink.setIcon(new
		// ImageIcon("C:\\Users\\Seth Register.SETHSLAPTOP\\Desktop\\DrinkIcons\\7up.jpg"));
		GridBagConstraints gbc_SevenUp = new GridBagConstraints();
		gbc_SevenUp.fill = GridBagConstraints.BOTH;
		gbc_SevenUp.insets = new Insets(0, 0, 5, 5);
		gbc_SevenUp.gridx = 1;
		gbc_SevenUp.gridy = 1;
		panel_5.add(SevenUp, gbc_SevenUp);

		JButton btnDrink_1 = new JButton("");
		btnDrink_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("A&W");
			}
		});
		btnDrink_1.setBackground(Color.WHITE);
		btnDrink_1.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/A&W.jpg")));
		GridBagConstraints gbc_btnDrink_1 = new GridBagConstraints();
		gbc_btnDrink_1.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_1.gridx = 2;
		gbc_btnDrink_1.gridy = 1;
		panel_5.add(btnDrink_1, gbc_btnDrink_1);

		JButton btnDrink_2 = new JButton("");
		btnDrink_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Coke");
			}
		});
		btnDrink_2.setBackground(Color.WHITE);
		btnDrink_2.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Coke.png")));
		GridBagConstraints gbc_btnDrink_2 = new GridBagConstraints();
		gbc_btnDrink_2.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_2.gridx = 3;
		gbc_btnDrink_2.gridy = 1;
		panel_5.add(btnDrink_2, gbc_btnDrink_2);

		JButton btnDrink_3 = new JButton("");
		btnDrink_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Orange Crush");
			}
		});
		btnDrink_3.setBackground(Color.WHITE);
		btnDrink_3.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Crush.png")));
		btnDrink_3
		.setSelectedIcon(new ImageIcon(
				"C:\\Users\\Seth Register.SETHSLAPTOP\\Desktop\\DrinkIcons\\Crush.png"));
		GridBagConstraints gbc_btnDrink_3 = new GridBagConstraints();
		gbc_btnDrink_3.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_3.gridx = 1;
		gbc_btnDrink_3.gridy = 2;
		panel_5.add(btnDrink_3, gbc_btnDrink_3);

		JButton btnDrink_4 = new JButton("");
		btnDrink_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Mtn Dew");
			}
		});
		btnDrink_4.setBackground(Color.WHITE);
		btnDrink_4.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/MtnDew.png")));
		GridBagConstraints gbc_btnDrink_4 = new GridBagConstraints();
		gbc_btnDrink_4.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_4.gridx = 2;
		gbc_btnDrink_4.gridy = 2;
		panel_5.add(btnDrink_4, gbc_btnDrink_4);

		JButton btnDrink_5 = new JButton("");
		btnDrink_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Diet Coke");
			}
		});
		btnDrink_5.setBackground(Color.WHITE);
		btnDrink_5.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Diet Coke.png")));
		GridBagConstraints gbc_btnDrink_5 = new GridBagConstraints();
		gbc_btnDrink_5.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_5.gridx = 3;
		gbc_btnDrink_5.gridy = 2;
		panel_5.add(btnDrink_5, gbc_btnDrink_5);

		JButton btnDrink_6 = new JButton("");
		btnDrink_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Dr. Pepper");
			}
		});
		btnDrink_6.setBackground(Color.WHITE);
		btnDrink_6.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Dr.Pepper.jpg")));
		GridBagConstraints gbc_btnDrink_6 = new GridBagConstraints();
		gbc_btnDrink_6.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_6.gridx = 1;
		gbc_btnDrink_6.gridy = 3;
		panel_5.add(btnDrink_6, gbc_btnDrink_6);

		JButton btnDrink_7 = new JButton("");
		btnDrink_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Pepsi");
			}
		});
		btnDrink_7.setBackground(Color.WHITE);
		btnDrink_7.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Pepsi.jpg")));
		GridBagConstraints gbc_btnDrink_7 = new GridBagConstraints();
		gbc_btnDrink_7.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_7.gridx = 2;
		gbc_btnDrink_7.gridy = 3;
		panel_5.add(btnDrink_7, gbc_btnDrink_7);

		JButton btnDrink_8 = new JButton("");
		btnDrink_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addText("Sprite");
			}
		});
		btnDrink_8.setBackground(Color.WHITE);
		btnDrink_8.setIcon(new ImageIcon(ApplicationScreen.class
				.getResource("/DrinkIcons/Sprite.jpg")));
		GridBagConstraints gbc_btnDrink_8 = new GridBagConstraints();
		gbc_btnDrink_8.fill = GridBagConstraints.BOTH;
		gbc_btnDrink_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnDrink_8.gridx = 3;
		gbc_btnDrink_8.gridy = 3;
		panel_5.add(btnDrink_8, gbc_btnDrink_8);

	}

}
