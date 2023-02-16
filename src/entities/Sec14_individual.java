package entities;

public class Sec14_individual extends Sec14_taxPayer 
{
	private Double healthExpenditures;
	
	public Sec14_individual() {}
	
	public Sec14_individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax()
	{
		double multiply = 0.0;
		if(healthExpenditures != 0)
		{
			multiply = 0.5;
		}
		if(super.getAnualIncome() <= 20000.00)
		{
			return 0.15*super.getAnualIncome()-(multiply*healthExpenditures);
		}
		else
		{
			return 0.25*super.getAnualIncome()-(multiply*healthExpenditures);
		}
	}

	@Override
	public String toString() {
		return super.getName() + ": $" + String.format("%.2f ", tax());
	}
	
}
