package Arrays.Basic;

public class AddingToA_Target {



    public static void main(String[] args) {

        int[] arr = {3,2,4};
        int target = 6;

        int[] result = twoSum(arr,target);
        System.out.println(result);

    }

    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int i = 0;

        for(int j=1;i<size;j++){

            int sum = nums[i] + nums[j];

            if(sum == target){
                int[] arr = {i,j};
                return arr;
            }


            if(j==size-1 && i!=size-1)
            {
                i++;
                j=i;
            }
        }

        int[] temp = {-1};
        return temp;
    }

}
