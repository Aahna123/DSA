import java.util.Scanner;

public class PrintDDA
{
    public static void main(String[] Args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit in row and column");
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter a number");
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

