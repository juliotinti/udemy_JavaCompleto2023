package model.entities;

public class Sec14_company extends Sec14_taxPayer {

	private int numberOfEmployees;
	
	public Sec14_company() {}	
	
	public Sec14_company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if(numberOfEmployees > 10)
		{
			return 0.14*super.getAnualIncome();
		}
		return 0.16*super.getAnualIncome();
	}
	
	@Override
	public String toString() {
		return super.getName() + ": $" + String.format("%.2f ", tax());
	}

}
