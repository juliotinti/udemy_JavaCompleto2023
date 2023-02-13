package entities;

public class Sec8_currencyConverter 
{

	public static final double IOF = 0.06; 
	
	public static double ConvertedValue(double dollarPrice, double quantity)
	{
		return dollarPrice*quantity*(1+IOF);
	}
	
}
