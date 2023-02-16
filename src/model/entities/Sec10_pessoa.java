package model.entities;

public class Sec10_pessoa 
{
	private String name; 
	private int idade; 
	private double altura;
	
	public Sec10_pessoa(String name, Integer idade, Double altura) 
	{
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	public double getAltura() 
	{
		return altura;
	}
	
	public void setAltura(double altura) 
	{
		this.altura = altura;
	} 
	
}
