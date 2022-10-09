public class floor {
    public static void main(String[] args)
    {
        int[]arr={2,3,5,9,14,16,18};
        int target= 10;
        int ans= floor2(arr,target);
        System.out.println("The target element is"+ans);
    }
    static int floor2(int[]arr,int target)
    {
        int start= 0;
        int end= arr.length-1;
        if(target>arr[arr.length-1])
        {
            return -1;
        }

        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        } return(end);
    }
}

