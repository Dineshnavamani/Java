import java.util.Scanner;
public class patternnum  
{   
public static void main(String args[])   
{ 
try
{
Scanner s = new Scanner(System.in);
System.out.print("Enter number of rows :");
int row = s.nextInt();  
int i, j; 
int num=1;    
for(i=0; i<rows; i++)   
{   
for(j=0; j<=i; j++)   
{     
System.out.print(num*num + " "); 
  num++;  
}   
System.out.println();   
} 
}
catch(Exception e){
System.out.println("invalid input");   
}  
}}
