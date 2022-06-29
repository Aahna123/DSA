import java.util.Scanner;

public class LinearSearchinString {
    public static void main(String args[])
    {
        int n,flag=0,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Limit");
        n=sc.nextInt();
        String[] arr=new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the word in the array in UPPERCASE");
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter the Word to be Searched");
        String se=sc.nextLine();
        for(i=0;i<n;i++)
        {
           if(arr[i].equals(se))
           {
               flag=1;
               break;
           }
        }
        if(flag==1)
        {
            System.out.println("Search Element Found");
        }
        else{
            System.out.println("Search element not found!");
        }
    }
}
