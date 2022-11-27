package Arrays.Easy;

import java.util.HashMap;

public class NonRepeatingElement {
// Complete
    public static void main(String[] args) {

    }
    // (Method 1) Working, using HashMap
    public static int firstNonRepeating1(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }

        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1)
                return arr[i];
        }
        return 0;
    }



}
