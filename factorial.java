import java.util.*;
//permutations program using Functions
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n and r");
        int n= sc.nextInt();
        int r= sc.nextInt();

        int nfact= fact(n);
        int rfact= fact(n-r);

        int npr= nfact/rfact;

        display(n,r,npr);


    }
    public static int fact(int x)
    {
        int y=1;
        for(int i=1;i<=x;i++)
        {
            y=y*i;
        }
        return y;
    }

    public static void display(int n,int r,int npr)
    {
        System.out.println(n+"P"+r+"="+npr);
    }
}
