import java.util.*;
//conversion of decimal base to any base
public class DTAB {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a decimal number ");
        int n=sc.nextInt();
        System.out.println("Enter the base in which the decimal number should be converted");
        int b=sc.nextInt();
        int nconb=Conversion(n,b);
        display(nconb);

    }
    public static int Conversion(int n,int b)
    {
        int num=0;
        int c=0;
        int d;
        while(n!=0)
        {
            d=n%b;
            num= (int) (num+(d*(Math.pow(10,c))));
            c++;
            n=n/b;
        }
        return num;
    }
    public static void display(int num)
    {
        System.out.println("The converted number is"+num);
    }
}

