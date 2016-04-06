
public class Item {
	private String name;
	private double price;
	private int QTY;
	public Item(String n, double p, int q)
	{
		name = n;
		price = p;
		QTY = q;
	}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public int getQTY() {
		return QTY;
	}

}
