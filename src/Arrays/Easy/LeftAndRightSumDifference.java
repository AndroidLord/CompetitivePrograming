package Arrays.Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftAndRightSumDifference {

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] res = leftRigthDifference3(nums);
        System.out.println(Arrays.toString(res));
    }

    // working, mine
    //https://leetcode.com/contest/weekly-contest-334/problems/left-and-right-sum-differences/
    public static int[] leftRigthDifference(int[] nums) {

        int n = nums.length;

        if(n==1)
        {nums[0] = 0;
            return nums;}

        int[] lsum = new int[n];
        int[] rsum = new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            lsum[i]=sum;
            sum = sum + nums[i];
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            rsum[i] = sum;
            sum +=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i] = Math.abs(lsum[i]-rsum[i]);
        }
        return nums;
    }

    // working, not mine
    public static int[] leftRigthDifference2(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int rsum = 0;
        for(int num : nums) rsum += num;

        int lsum = 0;
        for(int i = 0;i < n;i++){
            rsum -= nums[i];

            ans[i] = Math.abs(lsum - rsum);

            lsum += nums[i];
        }
        return ans;
    }

    //
    public static int[] leftRigthDifference3(int[] nums) {
        int n = nums.length,
                prefix = 0,
                suffix = IntStream.of(nums).sum();
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            suffix -= nums[i];
            ans[i] = Math.abs(prefix - suffix);
            prefix += nums[i];
        }
        return ans;
    }

}
