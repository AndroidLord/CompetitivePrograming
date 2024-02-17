package Arrays.Medium;

public class SortColors {

    // solved on my own
    public void sortColors(int[] nums) {

        int[] arr=new int[3];

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        for(int i=0;i<nums.length;i++){
            if(arr[0]>0){
                arr[0]--;
                nums[i]=0;
            }
            else if(arr[1]>0){
                arr[1]--;
                nums[i]=1;
            }
            else
                nums[i]=2;

        }

    }

}
