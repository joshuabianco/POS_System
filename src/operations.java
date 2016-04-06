import java.awt.Color;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

public class operations {

	static ArrayList<Item> itemList = new ArrayList<Item>();
	static ArrayList<Item> removeList = new ArrayList<Item>();
	static boolean isClockedIn = false;

	public static void addText(String name) {
		// ApplicationScreen.txtrHereIsSome.setText(null);
		Item food = createItem(name);
		itemList.add(food);
		printList(ApplicationScreen.txtrHereIsSome);
	}

	public static void printList(JTextArea a) {
		a.setText(null);
		DecimalFormat df = new DecimalFormat("#.00");

		for (int i = 0; i < itemList.size(); i++) {
			String ename = itemList.get(i).getName();
			String price = df.format(itemList.get(i).getPrice());
			String qty = Integer.toString(itemList.get(i).getQTY());

			if (fixText(ename) >= 60) {
				a.append("x" + qty + "\t"
						+ ename + "\t" + price + "\n");
				a.append("-------------------------------------------------"+ "\n");
			} else {
				a.append("x" + qty + "\t"
						+ ename + "\t" + "\t" + price + "\n");
				a.append("-------------------------------------------------"+ "\n");
			}
		}
		String tax = df.format(subTotal(itemList) * 0.07);
		String total = df.format(subTotal(itemList) + Double.parseDouble(tax));
		a.append("\t" + "Tax" + "\t" + "\t"
				+ tax + "\n");
		a.append("\t" + "Total" + "\t" + "\t"
				+ total);
		clearCalc();

	}
	
	public static void setCashArea(JTextArea a){
		a.setText(null);
		DecimalFormat df = new DecimalFormat("#.00");

		for (int i = 0; i < itemList.size(); i++) {
			String ename = itemList.get(i).getName();
			String price = df.format(itemList.get(i).getPrice());
			String qty = Integer.toString(itemList.get(i).getQTY());

			if (fixText(ename) >= 75) {
				a.append("x" + qty + "\t"
						+ ename + "\t" + price + "\n");
				a.append("-------------------------------------------------------"+ "\n");
			} else {
				a.append("x" + qty + "\t"
						+ ename + "\t" + "\t" + price + "\n");
				a.append("-------------------------------------------------------"+ "\n");
			}
		}
		String tax = df.format(subTotal(itemList) * 0.07);
		String total = df.format(subTotal(itemList) + Double.parseDouble(tax));
		a.append("\t" + "Tax" + "\t" + "\t"
				+ tax + "\n");
		a.append("\t" + "Total" + "\t" + "\t"
				+ total);
		clearCalc();

	}

	private static int fixText(String name) {
		AffineTransform affinetransform = new AffineTransform();
		FontRenderContext frc = new FontRenderContext(affinetransform, true,
				true);
		Font font = new Font("Tahoma", Font.PLAIN, 12);
		int textwidth = (int) (font.getStringBounds(name, frc).getWidth());
		//System.out.println(textwidth);
		return textwidth;
	}

	private static double subTotal(ArrayList<Item> item) {
		double subTotal = 0;
		for (int i = 0; i < item.size(); i++) {
			subTotal += item.get(i).getPrice();
		}
		return subTotal;
	}

	private static Item createItem(String name) {
		int QTY;
		try {
			QTY = Integer.parseInt(ApplicationScreen.textField.getText());
		} catch (NumberFormatException e) {
			QTY = 1;
		}
		double price = getPrice(name) * QTY;
		Item food = new Item(name, price, QTY);
		return food;
	}

	private static double getPrice(String ItemName) {
		int itemIndex = -1;
		double price;
		ReadExcel test = new ReadExcel();
		test.setInputFile("Prices.xls");
		try {
			ReadExcel.read(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			itemIndex = ReadExcel.itemNames.indexOf(ItemName);
			price = ReadExcel.itemPrices.get(itemIndex);
		} catch (ArrayIndexOutOfBoundsException e) {
			price = 1.99;
		}
		return price;
	}

	public static void addCalcNum(String s) {
		String textToAdd = s;
		String jField = ApplicationScreen.textField.getText();
		if (jField != null && jField.length() < 15) {
			textToAdd = jField + textToAdd;
		} else if (jField.length() >= 15) {
			textToAdd = jField;
		}
		ApplicationScreen.textField.setText(textToAdd);
	}

	public static void logIn() {
		int manageUserNameIndex = -1;
		int managePassIndex = -2;
		int employUserNameIndex = -1;
		int employPassIndex = -2;
		ReadExcel test = new ReadExcel();
		test.setInputFile("Prices.xls");
		try {
			ReadExcel.read(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String username = loginWindow.textField.getText();
		String password = loginWindow.textField_1.getText();
		if (ReadExcel.managerUserName.contains(username)
				& ReadExcel.managerPassword.contains(password)) {
			manageUserNameIndex = ReadExcel.managerUserName.indexOf(username);
			managePassIndex = ReadExcel.managerPassword.indexOf(password);

		} else if (ReadExcel.employUserName.contains(username)
				& ReadExcel.employPassword.contains(password)) {
			employUserNameIndex = ReadExcel.employUserName.indexOf(username);
			employPassIndex = ReadExcel.employPassword.indexOf(password);

		} else {
			errorMessage();
		}
		if (manageUserNameIndex == managePassIndex) {
			initApp(true);
			manageUserNameIndex = -1;
			managePassIndex = -2;
		} else if (employUserNameIndex == employPassIndex) {
			initApp(false);
			employUserNameIndex = -1;
			employPassIndex = -2;
		} else {
			errorMessage();
		}
	}
	
	public static void manage(){
		new HourScreen();
		HourScreen.frame.setVisible(true);
		ApplicationScreen.frame.setEnabled(false);
	}

	public static void clearCalc() {
		ApplicationScreen.textField.setText("");
	}

	public static void clearArea() {
		new CashOut();
		CashOut.frame.setVisible(true);
		ApplicationScreen.frame.setEnabled(false);
	}

	private static void errorMessage() {
		loginWindow.textField.setText("Wrong Name or Password");
		loginWindow.textField_1.setText("Wrong Name or Password");
	}

	private static void initApp(boolean manager) {
		new ApplicationScreen(manager);
		ApplicationScreen.frame.setVisible(true);
		loginWindow.frmLogin.dispose();
	}

	public static void logOut() {
		try {
			new loginWindow();
			loginWindow.frmLogin.setVisible(true);
			ApplicationScreen.frame.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
		clearCalc();
		isClockedIn = false;
		itemList.removeAll(itemList);
		removeList.removeAll(removeList);
		ApplicationScreen.ClockInOut.setText("Clocked Out");
	}
	
	public static void clockIn(){
		if(!isClockedIn){
			ApplicationScreen.ClockInOut.setBackground(Color.GREEN);
			ApplicationScreen.ClockInOut.setText("Clocked In");
			isClockedIn = true;
		}
		else{
			ApplicationScreen.ClockInOut.setBackground(Color.RED);
			ApplicationScreen.ClockInOut.setText("Clocked Out");
			isClockedIn = false;
		}
	}

	public static void editOrder() {
		new editScreen();
		editScreen.frame.setVisible(true);
		ApplicationScreen.frame.setEnabled(false);
	}

	@SuppressWarnings("unchecked")
	public static void deleteItem() {
		int j = -1;
		int selectedIndex = editScreen.itemsInList.getSelectedIndex();
		String s = (String) editScreen.listModel.getElementAt(selectedIndex);
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getName().equals(s)) {
				j = i;
				break;
			}
		}
		Item remove = itemList.get(j);
		removeList.add(remove);
		editScreen.listModel1.addElement((remove).getName());
		editScreen.listModel.remove(selectedIndex);
	}
	public static void backManage(){
		HourScreen.frame.dispose();
		ApplicationScreen.frame.setEnabled(true);
		ApplicationScreen.frame.toFront();
	}
	public static void cancelEdit() {
		editScreen.frame.dispose();
		removeList.removeAll(removeList);
		ApplicationScreen.frame.setEnabled(true);
		ApplicationScreen.frame.toFront();
	}

	public static void acceptChanges() {
		editScreen.frame.dispose();
		ApplicationScreen.frame.setEnabled(true);
		ApplicationScreen.frame.toFront();
		for (int i = 0; i < removeList.size(); i++) {
			for (int j = 0; j < itemList.size(); j++) {
				if (removeList.get(i).getName()
						.equals(itemList.get(j).getName())) {
					itemList.remove(j);
				}
			}
		}
		removeList.removeAll(removeList);
		printList(ApplicationScreen.txtrHereIsSome);
	}

	@SuppressWarnings("unchecked")
	public static void populateList(DefaultListModel list, ArrayList<Item> AList) {
		for (int i = 0; i < AList.size(); i++) {
			list.addElement(itemList.get(i).getName());
		}
	}
	
	public static void processPayment(String s){
		if(s.equals("Credit/Debit")){
			ApplicationScreen.txtrHereIsSome.setText(null);
			ApplicationScreen.frame.setEnabled(true);
			ApplicationScreen.frame.toFront();
			itemList.clear();
		}
	}

}
