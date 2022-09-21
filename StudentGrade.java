import java.util.Scanner;

public class StudentGrade {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int python, cprogramming, mathematics, physics; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Four Subjects Marks : ");
		python = sc.nextInt();	
		cprogramming = sc.nextInt();	
		mathematics = sc.nextInt();	
		physics = sc.nextInt();		
		
		total = python + cprogramming + mathematics + physics ;
	    Percentage = (total / 400) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 75)
	    {
			System.out.println("\n distinction");
		}
		else if(Percentage >= 60 )
	    {
			System.out.println("\n first distinction");
		}
		else if(Percentage >=50)
	    {
			System.out.println("\n second distinction");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n third distinction");
            }
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}