import java.util.Scanner;
class Tax
  {
	public static void main(String args[])
	{
	double t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	double i=sc.nextDouble();
	t=incomeTax(i);
	System.out.println("Income tax amount is "+t);
	}
static double incomeTax(double i)
{
	double tax;	
	if(i<=150000)
	{
	    tax=0;
	}
		
	else if(i>=150001 && i<=300000)
	{
	    	tax=i/100*10;
	}
	
	else if(i>=300001 && i<=500000)
	{
	    tax=i/100*20;
	}
		
	else
	{
	    tax=i/100*30;
	}
		
	return tax;
 
}
}
