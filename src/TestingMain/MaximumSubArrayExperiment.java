package TestingMain;

import Arrays.Basic.AdditionOfArray;

public class MaximumSubArrayExperiment {



    public static void main(String[] args) {

        //int temp[] = {-1,0,-2};
         int temp[] = {-2,1,-3,4,-1,2,1,-5,4};
       // int temp[] = {8,-19,5,-4,20};
        System.out.println(maxSubArray(temp));


    }

    // Working, Beat 99% on my own
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int tmax = max;
        int left = 0, right = 1;
        int n = nums.length;

        while(right<n)
        {
            int cur = nums[right];
            tmax +=cur;
            int tempMax = Math.max(tmax,cur);


            if(tempMax==cur){
                // The cur val is greater than prev successive sum
                max = Math.max(max,cur);
                left = right;
                tmax = nums[left];
            }
            else
                max = Math.max(max,tmax);

            right++;
        }

        return max;
    }

    public static int maxSubArray2(int[] arr){

        int maxsum = arr[0];
        int size = arr.length;
        if (size>1){

            for(int i=0;i<size;i++){

                int temp = arr[i];

                for(int j=i+1;j<size;j++){

                    if(temp>maxsum)
                        maxsum = temp;

                 temp = temp + arr[j];




                }
                if(arr[size-1]>maxsum)
                    maxsum = arr[size-1];
            }

        }


        return maxsum;
    }


}
