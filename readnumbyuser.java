import java.util.*;
class main
 {
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 float pos = 0,neg = 0,num=0,p=0,n=0;
 while(num!=-1)
 {
 System.out.print("enter the number:- ");
 num = input.nextInt();
 if(num>0)
 {
    pos++;
    p=p+num;
  }
 
 else if(num<0)
{
   neg++;
   n=n+num;
}
 }
 System.out.println("the no.of.negative values are "+neg);
 System.out.println("the no.of.positive values are "+pos);
 System.out.println("the sum of positive values "+p);
 System.out.println("the sum of negative values"+n);
 float p1=p/pos;
 float p2=n/neg;
 System.out.println("avg of positive numbers"+p1);
 System.out.println(" avg of negative numbers"+p2);
 }
}
