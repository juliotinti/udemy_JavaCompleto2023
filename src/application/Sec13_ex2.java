package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Sec13_comment;
import entities.Sec13_post;

public class Sec13_ex2 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Sec13_comment c1 = new Sec13_comment("Have a nice trip");
		Sec13_comment c2 = new Sec13_comment("Wow that's awesome");
		Sec13_post p1 = new Sec13_post(LocalDateTime.parse("21/06/2018 13:05:44", sdf), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);	
		p1.addComment(c1);
		p1.addComment(c2);
		
		Sec13_comment c3 = new Sec13_comment("Good night");
		Sec13_comment c4 = new Sec13_comment("May the Force be with you");
		Sec13_post p2 = new Sec13_post(LocalDateTime.parse("28/07/2018 23:14:19", sdf), 
				"Good night guys", 
				"See you tomorrow", 
				5);	
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
