package day14;

public class Pen {
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pen pen = (Pen)obj;
		/*
		if(color.equals(pen.color) && price == pen.price) {
			return true;
		} else {
			return false;
		}
		*/
		return color.equals(pen.color) && price == pen.price;
	}
	
	@Override
	public int hashCode() {
		return 7 * 23 * price + color.hashCode();
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	
}
