package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountPairWithGivenSum {

//    static int getPairsCount1(int[] arr, int n, int k) {
//
//        HashMap<Integer,Integer>  set = new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(!set.containsKey(arr[i])){
//                set.put(arr[i],1);
//            }
//            else
//            {
//                set.put(arr[i], set.get(arr[i])+1 );
//            }
//        }
//
//        int size = set.size();
//        int count = 0;
//
//        if(size==1 && arr[0]==arr[1]){
//            int no = set.get(arr[0])-1;
//            int temp = 1;
//            while(no>0){
//                temp = no * temp;
//                no--;
//            }
//            return temp;
//        }
//
//
//        HashMap<Integer,Integer> rset = new HashMap<>();
//
//        for (int num:set.keySet()){
//            if(set.containsKey(k-num) &&
//                    !rset.containsKey(num)){
//
//                rset.put(k-num,num);
//                if(set.get(num)>set.get(k-num))
//                    count +=set.get(num);
//                else
//                    count +=set.get(k-num);
//
//            }
//
//
//    }
//        return count;
//}
//
    static int getPairsCount2(int[] arr, int n, int k) {

        HashMap<Integer,Integer>  set = new HashMap<>();
        int count = 0;

        for(int i=0;i<n;i++){
            if(!set.containsKey(arr[i]))
                set.put(arr[i],0);
            else
                set.put(arr[i],set.get(arr[i])+1);
        }

        for(int i=0;i<n;i++){
            if(set.containsKey(k-arr[i]))
                count++;
        }
        return count;
    }
//
//    static int getPairsCount(int[] arr, int n, int k) {
//
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//        for(int i=0;i<n;i++){
//            set1.add(arr[i]);
//        }
//        Arrays.sort(arr);
//        int count = 0;
//        for(int i=0;i<n;i++){
//            if(set1.contains(k-arr[i]) &&
//               !set2.contains(k-arr[i])){
//
//                set2.add(k-arr[i]);
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {

        int N = 4, k = 6;
        int arr[] = {1 ,5 ,7 ,1};

        int result = getPairsCount(arr,N,k);
        System.out.println(result);

    }
    // Working solution, with N2 time algorithm
    static int getPairsCount(int[] arr, int n, int k) {

        int pair = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)
                    pair++;
            }
        }
        return pair;
    }

}



