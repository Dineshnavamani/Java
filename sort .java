import java.util.Arrays;  
import java.util.Scanner;

 class sort
{  
   public static void main(String args[])   
   {  
      Scanner sc=new Scanner(System.in);
      int n;  
      System.out.println("Enter the number of elements ");
      n=sc.nextInt();    

      String country[]=new String[n];
      System.out.println("Enter the String ");
      Scanner sc1=new Scanner(System.in);    
      for(int i=0; i<n ;i++)
      {
          country[i]=sc1.nextLine();
      }
     
         for(int i = 0; i<n; i++)
         {  
             for (int j = i+1; j<n; j++) 
             {  
              
                if(country[i].compareTo(country[j])>0)   
                {  
                    
                    String temp = country[i];  
                    country[i] = country[j];  
                    country[j] = temp;  
                 }  
              }  
           }  
 
           System.out.println(Arrays.toString(country));  
       }  
}  