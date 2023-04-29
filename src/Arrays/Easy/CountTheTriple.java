package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class CountTheTriple {

    int countTriplet(int arr[], int n) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int count = 0;

        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){

                if(map.containsKey(arr[i]+arr[j])){
                    count++;
                }
            }

        }
        return count;

    }

}
