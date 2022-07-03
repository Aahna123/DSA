import java.util.Scanner;

public class MinimumNumberOfDigits {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter a number");
            arr[i]=in.nextInt();
        }
        int call = evennumber(arr,n);
        if(call==0)
        {
            System.out.println("No Number is even");
        }
        else {
            System.out.println("the number of even number of digits are"+" "+call);
        }
    }
    static int evennumber(int[]arr,int n)
    {
        int c1=0;
        for(int i=0;i<n;i++)
        {
           int d=0,c=0;
           int cpy=arr[i];
           while(cpy!=0)
           {
               d=cpy%10;
               c=c+1;
               cpy=cpy/10;
           }
           if(c%2==0)
           {
               c1=c1+1;
           }
        }
        int c11 = c1;
        return c11;
    }
}
