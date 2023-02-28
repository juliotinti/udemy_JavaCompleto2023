package model.service;

public interface Sec18_onlinePaymentService {
	
	Double paymentFee(Double amount);
	Double interest(Double amount, Integer months);
	
}
