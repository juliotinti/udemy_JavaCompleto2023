package model.service;

public class Sec18_paypalService implements Sec18_onlinePaymentService {

	private double paymentFee = 0.02; //2% taxa de pagamento
	private double interestFee = 0.01; //1% juro simples mensal
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * paymentFee;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * (interestFee * months);
	}

}
