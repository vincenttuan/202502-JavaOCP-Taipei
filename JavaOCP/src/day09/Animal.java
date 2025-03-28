package day09;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal 建構子");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
