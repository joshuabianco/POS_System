import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static ArrayList<String> itemNames = new ArrayList<String>();
	public static ArrayList<Double> itemPrices = new ArrayList<Double>();
	public static ArrayList<String> managerUserName = new ArrayList<String>();
	public static ArrayList<String> managerPassword = new ArrayList<String>();
	public static ArrayList<String> employUserName = new ArrayList<String>();
	public static ArrayList<String> employPassword = new ArrayList<String>();
	public static ArrayList<String> drinkNames = new ArrayList<String>();
	public static ArrayList<Double> drinkPrices = new ArrayList<Double>();
	private static String inputFile;

	public void setInputFile(String inputFile) {
		ReadExcel.inputFile = inputFile;
	}

	public static void read(int pageNum) throws IOException {
		File inputWorkbook = new File(inputFile);
		Workbook w;
		try {
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			if (pageNum == (0)) {
				Sheet sheet = w.getSheet(pageNum);
				// Loop over first 10 column and lines
				for (int i = 0; i < sheet.getRows(); i++) {
					Cell prices = sheet.getCell(1, i);
					Cell names = sheet.getCell(0, i);
					itemNames.add(names.getContents());
					itemPrices.add(Double.parseDouble(prices.getContents()));
				}

			}

			else if (pageNum == (1)) {
				Sheet sheet = w.getSheet(pageNum);
				for (int i = 0; i < sheet.getRows(); i++) {
					Cell manageUserName = sheet.getCell(0, i);
					Cell managePass = sheet.getCell(1, i);
					Cell empUserName = sheet.getCell(2, i);
					Cell empPass = sheet.getCell(3, i);
					managerUserName.add(manageUserName.getContents());
					managerPassword.add(managePass.getContents());
					employUserName.add(empUserName.getContents());
					employPassword.add(empPass.getContents());
				}
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}
	
}