package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class CountInversion {

    public static void main(String[] args) {

         long N = 5, arr[] = {2, 4, 1, 3, 5};
         long result = inversionCount(arr,N);
        System.out.println(result);

    }

    static long inversionCount(long arr[], long N)
    {
        long[] narr = arr.clone();
        Arrays.sort(narr);

        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],i);
        }
        int ciCount = 0;
        for(int i=0;i<narr.length;i++){
            if(narr[i]!=arr[i]){
                // The false no
                long sNumber = arr[i];
                // Gives index of chosen in wrong pos to swap
                int sIndex = map.get(narr[i]);
                // correcting the Mistake
                arr[i] = narr[i];
                // swap complete
                arr[sIndex] = sNumber;

                ciCount++;
            }
        }
        if(ciCount!=0)
            return ciCount;

        return 0;    }

}
