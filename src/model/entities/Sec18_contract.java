package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sec18_contract {
		
	private Integer number; 
	private LocalDate date; 
	private Double totalValue; 
	List<Sec18_installment> installments = new ArrayList<>();
	
	public Sec18_contract() {}

	public Sec18_contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Sec18_installment> getInstallments() {
		return installments;
	}	
	
}
