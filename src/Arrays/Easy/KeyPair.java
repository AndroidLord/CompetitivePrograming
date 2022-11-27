package Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class KeyPair {

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        int i=0,j=1;
        while(i<n-1 && j<n){

            int first = arr[i];
            int second = arr[j++];

            int sum = first + second;
            if(sum == x)
                return true;

            if(j==n && i!=n-2)
            {
                i++;
                j=i+1;

            }

        }


        return false;
    }

    static boolean hasArrayTwoCandidates2(int arr[], int n, int x){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
            map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i]++));
        }
        for (int i=0;i<n;i++){
            if(map.containsKey(x-arr[i]) && arr[i]!=(x-arr[i]) || map.get(arr[i])>1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 5, X = 4;
        int[] arr = {1, 2, 3, 4, 5};

        boolean result = hasArrayTwoCandidates2(arr, N, X);
        System.out.println(result);
    }




}
