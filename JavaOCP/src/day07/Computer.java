package day07;

public class Computer {
	private String name;
	private CPU cpu;
	private RAM ram;
	private HD hd;
	private int price;
	
	public Computer(String name, CPU cpu, RAM ram, HD hd) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.price = cpu.getPrice() + ram.getPrice() + hd.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public HD getHd() {
		return hd;
	}

	public void setHd(HD hd) {
		this.hd = hd;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", cpu=" + cpu + ", ram=" + ram + ", hd=" + hd + ", price=" + price + "]";
	}
	
	
	
}
