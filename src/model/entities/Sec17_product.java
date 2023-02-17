package model.entities;

public class Sec17_product {
	
	private String name; 
	private Double price;
	private int quantity;
	
	public Sec17_product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Sec17_product() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
	public double totalValue()
	{
		return quantity*price;
	}

	@Override
	public String toString() {
		return name + "," + String.format("%.2f", totalValue());
	}
	
	

}
