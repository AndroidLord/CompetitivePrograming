package Arrays.Medium;

import java.util.Arrays;
public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = {2,3,1};
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] nums) {


        int[] arr = nums.clone();
        Arrays.sort(arr);

        int n = arr.length;

        if(n==1) return;

        for(int i=n-1;i>0;i--){

        if(i==1 && nums[i]>nums[0]){
            // Take a number greater the first ele from the num in the sorted array num
            nums[0] = nums[i];
            int pos=1;
            for(int j=0;j<n;j++){
                if(pos==n)
                    return;
                if(arr[j]==nums[0])
                    j++;
                nums[pos++] = arr[j];
            }

        }
        else if(nums[i]>nums[i-1]){
            int temp = nums[i];
            nums[i]=nums[i-1];
            nums[i-1] = temp;
            return;
        }

        }

        Arrays.sort(nums);
        return;
    }


}
