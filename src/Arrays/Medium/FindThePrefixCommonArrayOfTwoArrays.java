package Arrays.Medium;

import java.util.HashMap;

public class FindThePrefixCommonArrayOfTwoArrays {


    // working, mine, LeetCode
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int n = A.length;
        int[] arr = new int[n];

        for(int i =0;i<n;i++){

            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);

            int count = 0;
            for(int num: map.values()){
                if(num>1){
                    count++;
                }
            }
            arr[i] = count;

        }

        return arr;
    }

}
