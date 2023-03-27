import java.util.*;
//conversion of any to any base
public class ABTAB {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of any base ");
        int n=sc.nextInt();
        System.out.println("Enter the base of the number");
        int b=sc.nextInt();
        System.out.println("Enter the base in which the number will be converted ");
        int b1=sc.nextInt();
        int dec=AnybasetoDecimal(n,b);
        int con=DecimLtoAnybase(dec,b1);
        display(con);

    }
    public static int AnybasetoDecimal(int n,int b)
    {
        int num=0;
        int c=0;
        int d;
        while(n!=0)
        {
            d=n%10;
            num= (int) (num+(d*(Math.pow(b,c))));
            c++;
            n=n/10;
        }
        return num;
    }
    public static int DecimLtoAnybase(int n,int b1)
    {
        int num=0;
        int c=0;
        int d;
        while(n!=0)
        {
            d=n%b1;
            num= (int) (num+(d*(Math.pow(10,c))));
            c++;
            n=n/b1;
        }
        return num;
    }
    public static void display(int num)
    {
        System.out.println("The converted number is"+" "+num);
    }
}

