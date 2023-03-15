package model.entities;

public class Sec08_student 
{
	public String name; 
	public double firstGrade; 
	public double secondGrade;
	public double thirdGrade;
	
	public double FinalGrade()
	{
		return firstGrade + secondGrade + thirdGrade; 
	}
	
	public String toString()
	{
		double finalGrade = FinalGrade();
		if (finalGrade >= 60.0)
		{
			return "FINAL GRADE = " + 
					finalGrade + 
					"\nPASS\n";			
		}
		else
		{
			return "FINAL GRADE = " + 
					String.format("%.2f", finalGrade) + 
					"\nFAILED\n" + 
					"MISSING " + 
					String.format("%.2f", 60.0-finalGrade) + 
					" POINTS\n";
		}

	}
}
