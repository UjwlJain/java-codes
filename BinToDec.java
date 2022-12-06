import java.util.*;
public class BinToDec
 {
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int b,c=0; 
    double s=0, d=0;
    System.out.println("Enter a number ");
    b=sc.nextInt();
    int n=b;
    while(n!=0)
    {
       d=n%10;
       s=s+(d*Math.pow(2,c));
       n=n/10;
       c++;
    }
    System.out.println("Decimal number = "+s);
    sc.close();
  } 
}
