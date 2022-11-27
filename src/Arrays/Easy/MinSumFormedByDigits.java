package Arrays.Easy;

import java.util.Arrays;
// GFG
public class MinSumFormedByDigits {
// Complete
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {6, 8, 4, 5, 2, 3};

        long result = minSum(arr,N);
        System.out.println(result);

      // https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1?page=3&difficulty[]=0&status[]=unsolved&category[]=Arrays&sortBy=submissions

    }
    // Method 1
    public static long minSum(int arr[], int n)
    {
        String first = "",second="";
        Arrays.sort(arr);
        if(n==1)
            return arr[0];
        for(int i=0;i<n;i++){
            if(i%2==0)
                first +=arr[i];
            else
                second +=arr[i];
        }
        return Long.parseLong(first)+
                Long.parseLong(second);

    }

    String solve(int[] arr, int n) {
        Arrays.sort(arr);
        int fNo = 0;
        int sNo = 0;

        for(int i=0;i<n;i++){
            if(i%2==0)
            {
                fNo = fNo*10+arr[i];
            }
            else
            {
                sNo = sNo*10+arr[i];
            }
        }

        String str = Integer.toString(fNo+sNo);

        return str;
    }

}
