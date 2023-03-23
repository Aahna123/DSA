import java.util.*;
//to check frequency of a number
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and the digit for frequency calculation");
        int n=sc.nextInt();
        int dig=sc.nextInt();
        int nfreq= freq(n,dig);
        display(nfreq);
       // System.out.println("The frequency of the given number is"+nfreq);
    }
    public static int freq(int n,int dig)
    {
        int d,count=0;
        while(n!=0)
        {
            d=n%10;
            if(d==dig)
            {
                count=count+1;
            }
            n=n/10;
        }
        return count;
    }
    public static void display(int count)
   {
       System.out.println("The frequency of the given number is"+count);
   }
}

