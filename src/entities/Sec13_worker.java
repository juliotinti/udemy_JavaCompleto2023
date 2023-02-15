package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Sec13_workerLevel;

public class Sec13_worker 
{
	//atributos básicos
	private String name; 
	private Sec13_workerLevel level; 
	private Double baseSalary;
	
	//associações
	private Sec13_department department; 
	private List<Sec13_hourContract> contracts = new ArrayList<>(); //quando tiver uma associação tem-muitos (uma lista), você n colocar ela no construtor

	public Sec13_worker() {	} 
	
	public Sec13_worker(String name, Sec13_workerLevel level, Double baseSalary, Sec13_department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Sec13_workerLevel getLevel()
{
		return level;
	}

	public void setLevel(Sec13_workerLevel level) 
	{
		this.level = level;
	}

	public Double getBaseSalary() 
	{
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) 
	{
		this.baseSalary = baseSalary;
	}

	public String getDepartment() 
	{
		return department.getName();
	}

	public void setDepartment(Sec13_department department) 
	{
		this.department = department;
	}

	public List<Sec13_hourContract> getContracts() 
	{
		return contracts;
	}	
	
	public void addContract(Sec13_hourContract contract)
	{
		contracts.add(contract);
	}
	
	public void removeContract(Sec13_hourContract contract)
	{
		contracts.remove(contract);
	}
	
	public double income (int year, int month)
	{
		double sum = baseSalary; 
		for(Sec13_hourContract c: contracts)
		{
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			if(year == c_year && month == c_month)
			{
				sum += c.totalValue();
			}
		}
		return sum; 
	}
	
	
}
