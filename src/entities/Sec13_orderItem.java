package entities;

public class Sec13_orderItem 
{
	private Integer quantity;
	
	private Sec13_product product;
	
	public Sec13_orderItem(){}	
	
	public Sec13_orderItem(Integer quantity, Sec13_product product)
	{
		this.product = product;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Sec13_product getProduct() 
	{
		return product;
	}

	public Double subTotal()
	{
		return quantity*product.getPrice();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", " + String.format("$%.2f, ", product.getPrice()));
		sb.append("Quantity: " + quantity + ", Subtotal: " + String.format("$%.2f", subTotal()) + "\n");
		return sb.toString();
	}
	
	
}
