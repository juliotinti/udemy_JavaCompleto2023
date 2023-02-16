package model.entities;

import java.time.LocalDate;

import model.enums.Aula_enum_orderStatus;

public class Aula_enum_order 
{
	private Integer id;
	private LocalDate moment;
	private Aula_enum_orderStatus status;
	
	public Aula_enum_order ()
	{}
	
	public Aula_enum_order(Integer id, LocalDate moment, Aula_enum_orderStatus status) 
	{
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public LocalDate getMoment() 
	{
		return moment;
	}
	
	public void setMoment(LocalDate moment)
	{
		this.moment = moment;
	}
	
	public Aula_enum_orderStatus getStatus() 
	{
		return status;
	}
	
	public void setStatus(Aula_enum_orderStatus status) 
	{
		this.status = status;
	}

	@Override
	public String toString() {
		return "Aula_enum_order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	} 
	
	
}
