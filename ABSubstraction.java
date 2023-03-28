import java.util.*;
public class ABSubstraction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to be added");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter the base of the numbers");
        int b = sc.nextInt();
        int difference = Substraction(n1,n2,b);
        display(difference);

    }

    public static int Substraction(int n1, int n2, int b)
    {
       int d1,d2,c=0,main_difference=0,p=1,d;
        while(n2>0)
        {
            d1=n1%10;
            d2=n2%10;

            d2=d2+c;
            if(d2>=d1)
            {
                c=0;
                d=d2-d1;
            }
            else
            {
                c=-1;
                d=d2+b-d1;
            }
             main_difference=main_difference+d*p;
             p=p*10;
             n1=n1/10;
             n2=n2/10;

        }
        return main_difference;
    }
    public static void display(int main_difference)
    {
        System.out.println("The difference of the two numbers is"+main_difference);
    }
}
