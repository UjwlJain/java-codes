import java.util.Scanner;
public class EOComposite
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n,i,c=0,num=0;
        System.out.println("Enter the number:");
        n=s.nextInt();
        s.close();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;

        }
        if(c>2)
        num=n;
        else
        System.out.println("It is not a Composite number");
        switch(num %2)
        {
            case 0 : 
            System.out.println("It is an even composite number. ");
            break;
            case 1:
            System.out.println("It is an odd composite number.");
            break;
            
        }
        
    }
}