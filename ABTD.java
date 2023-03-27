import java.util.*;
//conversion of any to decimal
public class ABTD {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of any base ");
        int n=sc.nextInt();
        System.out.println("Enter the base of the number");
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
            d=n%10;
            num= (int) (num+(d*(Math.pow(b,c))));
            c++;
            n=n/10;
        }
        return num;
    }
    public static void display(int num)
    {
        System.out.println("The converted number is"+" "+num);
    }
}

