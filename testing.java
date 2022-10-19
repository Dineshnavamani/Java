import java.util.Scanner;

 class DifferentPattern {

    public static void main(String[] args) {

        int pattern;
        int noOfTimes;
		 List l=new ArrayList();
                System.out.println("Enter the input");
                Scanner input=new Scanner(System.in);

                 String a =input.nextLine();
                 l.add(a);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number to print : ");
        pattern = scanner.nextInt();

        System.out.print("Enter number of times it should get printed : ");
        noOfTimes = scanner.nextInt();

        for(int i = 1; i <= noOfTimes; i++) {

            for(int j = 1; j <= i; j++) { 
                System.out.print(l[i]);
            }
            System.out.println();
            pattern++;
        }
    }
}
