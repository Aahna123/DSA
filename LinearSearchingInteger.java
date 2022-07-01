public class LinearSearchingInteger
{
    public static void main(String[] Args)
    {
        int[] arr = {3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int target = 6;
        int call = LS(arr, n, target);
        if (call == -1) {
            System.out.println("Search Element Not Found");
        } else {
            System.out.println("Search Element Found" + " " + call);
        }
    }

    static int LS(int[] arr, int n, int target)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == target)
            {
                return target;
            }
        }
        return -1;
    }
}
