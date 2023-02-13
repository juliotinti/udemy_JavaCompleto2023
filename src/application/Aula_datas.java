package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aula_datas {

	public static void main(String[] args) 
	{
		LocalDate d01 = LocalDate.now(); /*gera a data Agora local*/
		LocalDateTime d02 = LocalDateTime.now(); /*gera a data e hora Agora local*/
		Instant d03 = Instant.now(); /*gera a data GMT0(Z) em relação a minha data local*/
		
		/*instanciando datas a meu bel prazer*/
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26+03:00");
		
		/*instanciando de maneira customizada*/
		/*documentação DateTimeFormatter = https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html*/
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("30/01/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("30/01/2022 01:57", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		/*Instanciando passando ano mes e dia isoladamente*/
		LocalDate d10 = LocalDate.of(2022, 7, 22);
		LocalDateTime d11 = LocalDateTime.of(2023,01,20,1,30);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println("_________________________________");
		
		/*transformando data em texto ISO 8601*/
		System.out.println(d06.toString());
		
		/*transformando data em texto de maneira customizada*/
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d04.format(fmt2));
		System.out.println(d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));		
		System.out.println(fmt2.format(d04));
		Instant d100 = Instant.parse("2022-01-08T04:55:18Z"); 
		/*para imprimir customizadamente uma data global, precisa info da timezone*/
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		/*ZoneId.systemDefault() pega o timezone do usuário*/
		System.out.println(fmt3.format(d100));/*hora global n tem .format, por isso precisamos usar do DateTimeFormatter*/
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT; /*existem funções prontas para formatação, so olhar documentação*/
		System.out.println(fmt4.format(d100));
		System.out.println("_________________________________");
		
	
		/*Para saber quais são os zoneIds
		 * for(String s: ZoneId.getAvailableZoneIds())
		 * {
		 * 		System.out.println(s); 
		 * }
		 * */
		/*Convertendo data global para local, fazendo as conversões de TimeZone*/
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("_________________________________");
		
		/*Calculos com data-hora*/
		LocalDate pastWeekLocalDate = d04.minusDays(7); //subtraindo 7 dias de d04
		LocalDate nextWeekLocalDate = d04.plusDays(7); //adicionando 7 dias de d04
		System.out.println("d04 dia = " + d04);
		System.out.println("d04 minus 7 = " + pastWeekLocalDate);
		System.out.println("d04 plus 7 = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); 
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); 
		System.out.println("d05 dia = " + d05);
		System.out.println("d05 minus 7 = " + pastWeekLocalDateTime);
		System.out.println("d05 plus 7 = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); 
		System.out.println("d06 dia = " + d06);
		System.out.println("d06 minus 7 = " + pastWeekInstant);
		System.out.println("d06 plus 7 = " + nextWeekInstant);
		
		/*Cálculo de duração precisa de uma outra classe*/
		Duration t1 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
		System.out.println(t1.toDays() + " dias");
		
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay() , d04.atTime(0, 0)); 
		//precisa converter o LocalDate para LocalDateTime para calcular, visto que LocalDate n tem horas
		System.out.println(t2.toDays() + " dias");
		
		Duration t3 = Duration.between(d06, pastWeekInstant);
		System.out.println(t3.toDays() + " dias");
		
	}

}
