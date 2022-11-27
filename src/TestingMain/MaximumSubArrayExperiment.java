package TestingMain;

import Arrays.Basic.AdditionOfArray;

public class MaximumSubArrayExperiment {



    public static void main(String[] args) {

        int temp[] = {-1,0,-2};
        System.out.println(maxSubArray(temp));


    }

    public static int maxSubArray(int[] arr){

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
