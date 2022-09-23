import java.util.*;   
public class sumofnnum
{ 
    public static void main(String args[]) 
        throws ArrayIndexOutOfBoundsException 
    { 
        Scanner sc = new Scanner(System.in);      
        int n;
        System.out.println("Enter the Array Size ");
        n=sc.nextInt();                
        int arr[] = new int[n];     
        System.out.println("Enter more number of elements than the mentioned size ");       
        try { 

            for (int i = 0; i <= n; i++) 
            { 
                arr[i] = sc.nextInt(); 
            } 
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        { 
            System.out.println("Array Bounds Exceeded..."); 
            System.out.println("Try Again"); 
        } 
    } 
}
