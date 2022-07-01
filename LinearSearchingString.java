public class LinearSearchingString
{
 public static void main(String[] args)
 {
     String[] arr={"aahna","meena","bulbul","govind","angad"};
     String target= "aahna";
     String call = LSS(arr,target);
     if(call==null)
     {
         System.out.println("Search Element Not Found");
     }
     else
     {
         System.out.println("Search Element Found"+" "+call);
     }
 }
 static String LSS(String[] arr,String target)
    {
       for(int i=0; i<arr.length;i++)
       {
           if(arr[i].equals(target))
           {
               return target;
           }
       }
       return null;
    }
}
