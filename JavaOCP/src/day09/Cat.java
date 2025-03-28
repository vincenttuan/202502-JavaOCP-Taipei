package day09;

public class Cat extends Animal {
	public Cat() {
		super("貓");
		System.out.println("Cat 建構子");
	}
	
	public Cat(String name) {
		super(name);
		System.out.println("Cat 建構子");
	}
	
	public void voice() {
		System.out.println("喵~~~");
	}
}
