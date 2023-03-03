package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sec19_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> studentsA = new HashSet<>();
		Set<Integer> studentsB = new HashSet<>();
		Set<Integer> studentsC = new HashSet<>();
		for(int i = 0; i<3; i++)
		{
			System.out.printf("How many students for course %c? ", 65 + i);
			int qty = sc.nextInt(); 	
			for(int j = 0; j<qty; j++) {
				if(i == 0)
					studentsA.add(sc.nextInt());
				else if (i == 1)
					studentsB.add(sc.nextInt());
				else
					studentsC.add(sc.nextInt());
			}
		}
		
		Set<Integer> totalStudents = new HashSet<>(studentsA);
		totalStudents.addAll(studentsB);
		totalStudents.addAll(studentsC);
		
		System.out.printf("Total Students: %d", totalStudents.size());
		sc.close();
	}

}
