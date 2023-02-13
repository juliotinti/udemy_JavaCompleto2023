package entities;

public class Sec8_employee 
{
	public String name; 
	public double grossSalary;
	public double tax; 
	
	public double NetSalary()
	{
		return grossSalary-tax; 
	}
	
	public void IncreaseSalary(double percentage)
	{
		this.grossSalary *= (1+(percentage/100)); 
	}
	

}
