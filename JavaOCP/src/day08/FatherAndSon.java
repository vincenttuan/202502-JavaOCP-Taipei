package day08;

public class FatherAndSon {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println(father.balance);
		father.play();
		//----------------------------------
		Son son = new Son();
		System.out.println(son.balance);
		son.play();
	}

}
