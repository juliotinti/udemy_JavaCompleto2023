package application;

import java.time.LocalDate;

import entities.Aula_enum_order;
import entities.enums.Aula_enum_orderStatus;

public class Aula_enum {

	public static void main(String[] args)
	{
		Aula_enum_order order = new Aula_enum_order(1080, LocalDate.now() , Aula_enum_orderStatus.PENDING_PAYMENT);
		System.out.println(order);
		order.setStatus(Aula_enum_orderStatus.DELIVERED);
		System.out.println(order);		

	}

}
