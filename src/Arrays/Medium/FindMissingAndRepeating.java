package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeating {

    public static void main(String[] args) {

    }

    // Method 1, Using HashMap not good but O(n).
    static int[] findTwoElement1(int arr[], int n) {

        int[] narr = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(i+1))
            {
                narr[1] = i+1;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==2)
            {
                narr[0]=arr[i];
                break;
            }
        }
        return narr;
    }

    // Method 2, not mine
    static int[] findTwoElement2(int arr[], int size) {

        int[]r=new int[2];

        int i;

        for (i = 0; i < size; i++) {

            int abs_val = Math.abs(arr[i]);

            if (arr[abs_val - 1] > 0)

                arr[abs_val - 1] = -arr[abs_val - 1];

            else

                r[0]=abs_val;

        }

        for (i = 0; i < size; i++) {

            if (arr[i] > 0)

                r[1]=i+1;

        }

        return r;

    }

}
