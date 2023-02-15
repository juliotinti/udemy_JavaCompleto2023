package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.Aula_enum_orderStatus;

public class Sec13_order 
{
	private LocalDateTime moment; 
	private Aula_enum_orderStatus status; 
	
	private List<Sec13_orderItem> items = new ArrayList<>();
	private Sec13_client client;
	
	public Sec13_order(){}	
	
	public Sec13_order(LocalDateTime moment, Aula_enum_orderStatus status, Sec13_client client)
	{
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() 
	{
		return moment;
	}
	
	public Aula_enum_orderStatus getStatus() 
	{
		return status;
	}
	
	public void setStatus(Aula_enum_orderStatus status) 
	{
		this.status = status;
	}
	
	public List<Sec13_orderItem> getItems() 
	{
		return items;
	}

	public Sec13_client getClient() {
		return client;
	}
	
	public void setClient(Sec13_client client)
	{
		this.client = client;
	} 
	
	public void addItem(Sec13_orderItem item)
	{
		items.add(item);
	}
	
	public void removeItem(Sec13_orderItem item)
	{
		items.remove(item);
	}

	public Double total()
	{
		Double _total = 0.0;
		for(Sec13_orderItem order: items)
		{
			_total += order.subTotal();
		}
		return _total; 
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") - " 
				+ client.getEmail() + "\n");
		sb.append("Ordem items:\n");
		for(Sec13_orderItem item: items)
		{
			sb.append(item);			
		}
		sb.append("Total price: " + String.format("$%.2f", total()));
		return sb.toString();
	}
	
}
