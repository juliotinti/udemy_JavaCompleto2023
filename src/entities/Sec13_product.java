package entities;

public class Sec13_product 
{
	private String name; 
	private Double price;
	
	public Sec13_product() {}	
	
	public Sec13_product(String name, Double price) 
	{
		this.name = name;
		this.price = price;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Double getPrice() 
	{
		return price;
	}
	
	public void setPrice(Double price) 
	{
		this.price = price;
	} 
	
	
}
