import java.util.*;

public class denomination {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int bal=0,d,n;
        int count = 1;

        while(count <=4){    
            System.out.println("Enter " + count + " Denomination : ");
            d = sc.nextInt();
        
            if(d == 500 || d == 2000 || d == 200 || d == 100){
                System.out.println("Enter "+ count + " Denomination No. Of Notes : ");
                n = sc.nextInt();
                bal = bal + d*n ;
                count++;
            }
            else{
                System.out.println("Enter a Valid Denomination. ");
                continue;
            }
        }
        System.out.println("Total Available Balance in ATM : " + bal);
    }
}
