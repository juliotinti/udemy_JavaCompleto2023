package model.service;

import java.time.LocalDate;

import model.entities.Sec18_contract;
import model.entities.Sec18_installment;

public class Sec18_contractService {
	
	private Sec18_onlinePaymentService onlinePaymentService; 
	
	public Sec18_contractService(Sec18_onlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract (Sec18_contract contract, Integer months){
		double basicQuota = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++)
		{
			LocalDate dueDate = contract.getDate().plusMonths(i); //aumentar os meses com base no parcelamento
			double interest = onlinePaymentService.interest(basicQuota, i);
			double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + paymentFee;
			contract.getInstallments().add(new Sec18_installment(dueDate, quota));
		}
	}
}
