package model.service;

public class Sec18_brazilInterestService implements Sec18_interestService{

	private double interestRate; 
	
	public Sec18_brazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
