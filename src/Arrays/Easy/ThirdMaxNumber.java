package Arrays.Easy;

import java.util.Arrays;

public class ThirdMaxNumber {

    public static void main(String[] args) {

        int[] nums = {3,2,2,1};
        int res = thirdMax(nums);
        System.out.println(res);
    }
    // wrong
    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int res=0;
        if(nums.length<3)
            return nums[nums.length-1];
        else{
            int count=0;
            for(int i=nums.length-1;i>=0;i--){

                if(count==2)
                {
                    res = nums[i];
                    break;
                }

                if(nums[i]>nums[i-1]){
                    count++;
                }

            }
        }
        return res;
    }

}
