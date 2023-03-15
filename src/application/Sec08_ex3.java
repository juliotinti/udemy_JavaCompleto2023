package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Sec08_student;

public class Sec08_ex3 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Sec08_student student = new Sec08_student();
		
		System.out.println("Student data: (name, grades)");
		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();
		System.out.println(student);
		
		sc.close();
	}

}
