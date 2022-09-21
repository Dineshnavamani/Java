import java.util.*;
 class username
 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String inp;
        System.out.println("Enter a UserName : ");
        inp = sc.nextLine();

        System.out.println("Enter username again : ");
        String x = sc.nextLine();

        if(inp.equals(x)){
            System.out.println("The UserName is Valid.");
        }
        else{
            System.out.println("Enter a Valid Username.");
        }
    }
