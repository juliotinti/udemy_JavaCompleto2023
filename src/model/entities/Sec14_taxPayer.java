package model.entities;

public abstract class Sec14_taxPayer {

	private String name; 
	private Double anualIncome;

	public Sec14_taxPayer() {}
	
	public Sec14_taxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double tax();
	
}
