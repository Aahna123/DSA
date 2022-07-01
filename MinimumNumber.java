import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            arr[i]=in.nextInt();
        }
        int call= Min(arr,n);
        System.out.println("Minimum Element is:"+call);
    }
    static int Min(int[]arr,int n)
    {
        int minimum = arr[0];
        for(int i=0;i<n;i++)
        {
            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
