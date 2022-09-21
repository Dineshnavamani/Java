import java.util.*;

public class factor{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		
		int count = 0,isFound = 0;
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		
			for(int i = 1;i<=num; i++){
				if(num%i == 0){
					count++;
				}
				if(n == count && isFound == 0 ){
					System.out.format("%dth Factor of %d : %d \n" , +n,+num,+i );
					isFound = 1;
				}
			}
			System.out.println("No .of Factors : " + count);
	}
}
