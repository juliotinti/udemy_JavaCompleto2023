package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sec14_usedProduct extends Sec14_product
{
	private LocalDate manufactureDate;

	public Sec14_usedProduct() {}	

	public Sec14_usedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag()
	{
		return super.getName() + "(used) $ " + String.format("%.2f ", super.getPrice()) + "(Manufacture date: " + 
					manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}	
	
}
