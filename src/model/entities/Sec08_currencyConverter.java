package model.entities;

public class Sec08_currencyConverter 
{

	public static final double IOF = 0.06; 
	
	public static double ConvertedValue(double dollarPrice, double quantity)
	{
		return dollarPrice*quantity*(1+IOF);
	}
	
}
