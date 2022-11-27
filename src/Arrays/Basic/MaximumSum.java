package Arrays.Basic;

public class MaximumSum {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(nums);
        System.out.println(result);
    }


    public static int maxSubArray(int[] arr){

        int maxsum = arr[0];
        int size = arr.length;
        if (size>1){

            for(int i=0;i<size;i++){

                int temp = arr[i];

                for(int j=i+1;j<size;j++){
                    temp = temp + arr[j];

                    if(temp>maxsum){
                        maxsum = temp;
                    }
                    if(arr[size-1]>maxsum)
                        maxsum = arr[size-1];

                }
                if(arr[i]>maxsum)
                    maxsum=arr[i];
            }

        }


        return maxsum;
    }


}
