import java.util.*;
public class Armstrong {
    int armstrong(int n)
    {
        int d=0, sum=0, k, num=n;
        while(n!=0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(num==sum)
        {
            k=1;
        }
        else
        {
            k=0;
        }
        return(k);
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,m=0;
        System.out.println("Enter the number:");
        n=input.nextInt();
        Armstrong ob= new Armstrong();
        m=ob.armstrong(n);
        if(m==1)
        System.out.println("It is an Armstrong number.");
        else
        System.out.println("It is not an Armstrong number");
        input.close();
    }
}
