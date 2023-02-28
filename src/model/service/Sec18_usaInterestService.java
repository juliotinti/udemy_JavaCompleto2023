package model.service;

public class Sec18_usaInterestService implements Sec18_interestService {
	
	private double interestRate;

	public Sec18_usaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
