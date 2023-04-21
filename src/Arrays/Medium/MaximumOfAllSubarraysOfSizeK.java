package Arrays.Medium;

import java.util.ArrayList;

public class MaximumOfAllSubarraysOfSizeK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};

        ArrayList<Integer> res = max_of_subarrays(arr, arr.length, 3);
        System.out.println(res.toString());
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int max = arr[0];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i<k){
                if(i==k-1)
                {
                    list.add(max);
                    continue;
                }
                if(arr[i+1]>max)
                {
                    max = arr[i+1];
                }
            }
            else{
                if(arr[i]>max){
                    max = arr[i];

                }
                list.add(max);
            }
        }
        return list;

    }


}
