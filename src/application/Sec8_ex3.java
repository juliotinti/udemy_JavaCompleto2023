package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec8_student;

public class Sec8_ex3 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sec8_student student = new Sec8_student();
		
		System.out.println("Student data: (name, grades)");
		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();
		System.out.println(student);
		
		sc.close();
	}

}
