
 import java.util.Scanner;

   class Username {

        public static void main(String args[])

        {

            String username, password;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter username:");

            username = s.nextLine();

            System.out.print("Enter password:");

            password = s.nextLine();

            if(username.equals("saveetha@789") && password.equals("saveetha@789"))

            {

                System.out.println("username is valid");

            }

            else

            {

                System.out.println("username is invalid");

            }

        }

    }
