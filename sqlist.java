import java.util.Scanner;
class sqlist
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int ul,ll;
 System.out.print("Enter the lower limit: ");
 ll=sc.nextInt();

 System.out.print("Enter the upper limit: ");
 ul=sc.nextInt();
 if(ll>ul)
 {
   System.out.print("Enter the valid limits");
 }
 if(ll<0 ||ul<0 ||(ll<0 &&ul<0 ))
 {
     System.out.println("\nEnter the valid limits");
 }

 else
 {
 System.out.print("[");
 if(ll<ul){
 for(int j=ll;j<=ul;j++){
 System.out.print("("+j+","+(int)Math.pow(j,2)+")");
 if(j<ul)
 System.out.print(",");
 }
 }


 System.out.print("]");
 if(ul==ll)
 System.out.println("Both the limits are same");
}

 }
 }