public class LinearSearch {
    public static void main(String[] Args)
    {
        int[] nums= {4,3,9,13,15,16,18,19,20};
        int target= 19;
        int ans = LinearSearch1(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch1(int[] arr, int target )
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
