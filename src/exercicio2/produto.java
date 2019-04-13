package exercicio2;

public class produto {
	private String name;
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public produto(String name, float price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return this.name + this.price;
	}
}
