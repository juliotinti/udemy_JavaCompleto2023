package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sec18_installment {
	
	private LocalDate dueDate;
	private Double amount;

	public Sec18_installment() {}
	
	public Sec18_installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public Double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + String.format("%.2f", amount);
	}

	
	
}
