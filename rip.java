import java.io.*;
import java.util.*;
class rip
{
  public static void main(String args[])
  {
  int n,i,j,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of.rows");
  n=sc.nextInt();
  c=1;
  for(i=0;i<n;i++)
  {
    for(j=1;j<=i;j++)
    {
      System.out.print(c+" ");
      c++;
    }


    System.out.println();
  }
  }
}