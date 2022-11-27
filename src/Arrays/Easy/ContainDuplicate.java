package Arrays.Easy;

import java.util.Arrays;

public class ContainDuplicate {

    public static void main(String[] args) {
     int[] arr = {2,14,18,22,22};
     boolean isDuplicate = containsDuplicate(arr);
        System.out.println(isDuplicate);

    }



    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){

        if(nums[i]==nums[i+1])
            return true;

        }


        return false;
    }

}
