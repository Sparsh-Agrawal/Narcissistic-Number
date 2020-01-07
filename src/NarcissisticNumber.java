import java.util.Scanner;

public class NarcissisticNumber
{
    static int numOfDigits(int n)
    {
        if(n==0)
            return 0;
        else
            return 1+numOfDigits(n/10);
    }

    static boolean check(int n)
    {
        int c=numOfDigits(n);
        int s=0;
        int a=n;
        while(a>0)
        {
            s+=Math.pow(a%10,c);
            a/=10;
        }
        return (n==s);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int k=sc.nextInt();
        int a=0;
        int c=0;
        while(true)
        {
            if(c==k)
                break;
            else
            {
                if(check(a))
                {
                    System.out.println(a);
                    c++;
                }
            }
            a++;
        }
    }
}