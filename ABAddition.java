import java.util.*;
public class ABAddition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to be added");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter two base of the numbers");
        int b = sc.nextInt();
        int sum = Addition(n1,n2,b);
        display(sum);

    }

    public static int Addition(int n1, int n2, int b)
    {
        int p=0,d1,d2,sum=0,c=0,r=0,main_sum=0;
        while(n1 > 0 || n2 > 0||c>0)
        {
           d1=n1%10;
           d2=n2%10;
           sum=d1+d2+c;
           c=sum/b;
           r=sum%b;
           main_sum=(int)(main_sum+(r*(Math.pow(10,p))));
           p++;
           n1=n1/10;
           n2=n2/10;

        }
        return main_sum;
    }
    public static void display(int main_sum)
    {
        System.out.println("The sum of the two numbers is"+main_sum);
    }
}
