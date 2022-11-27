package Arrays.Medium;

import java.util.HashMap;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args) {

    }

    static int missingNumber(int arr[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>=0){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if(min>arr[i])
                    min = arr[i];
            }
        }
        if (!map.containsKey(0))
            return size+1;

        return min;
    }


}
