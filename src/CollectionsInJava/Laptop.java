package CollectionsInJava;

public class Laptop implements Comparable<Laptop> {
	String model;
	int price;
	int ramSize;

	public Laptop(String model, int price, int ramSize) {
		super();
		this.model = model;
		this.price = price;
		this.ramSize = ramSize;
	}

	@Override
	public int compareTo(Laptop l) {
		return this.getModel().compareTo(l.model);
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + ", ramSize=" + ramSize + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
}
