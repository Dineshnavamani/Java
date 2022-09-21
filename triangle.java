import java.util.*;

public class triangle {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter Limit : ");
        n = sc.nextInt();

        int space = n;
        
        for(int i = 0;i<n;i++){
            for(int k = space ;k>0;k--){
                System.out.print("  ");
            }
            space--;
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}