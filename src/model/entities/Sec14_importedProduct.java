package model.entities;

public class Sec14_importedProduct extends Sec14_product
{
	private Double customsFee;
	
	public Sec14_importedProduct() {}	
	
	public Sec14_importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag()
	{
		return super.getName() + " $ " + String.format("%.2f ", totalPrice()) + "(Customs fee: $" +  String.format("%.2f ", customsFee) + ")";
	}

	public Double totalPrice(){
		return super.getPrice() + customsFee;
	}
}
