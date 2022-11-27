package Arrays.Easy;

import java.util.HashMap;

public class CountPairWithGivenSum {

    static int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer,Integer>  set = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!set.containsKey(arr[i])){
                set.put(arr[i],1);
            }
            else
            {
                set.put(arr[i], set.get(arr[i])+1 );
            }
        }

        int size = set.size();
        int count = 0;

        if(size==1 && arr[0]==arr[1]){
            int no = set.get(arr[0])-1;
            int temp = 1;
            while(no>0){
                temp = no * temp;
                no--;
            }
            return temp;
        }


        HashMap<Integer,Integer> rset = new HashMap<>();

        for (int num:set.keySet()){
            if(set.containsKey(k-num) &&
                    !rset.containsKey(num)){

                rset.put(k-num,num);
                if(set.get(num)>set.get(k-num))
                    count +=set.get(num);
                else
                    count +=set.get(k-num);

            }


    }
        return count;
}

    int getPairsCount2(int[] arr, int n, int k) {

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

    public static void main(String[] args) {

        int N = 4, k = 2;
        int arr[] = {1, 1, 1, 1};

        int result = getPairsCount(arr,N,k);
        System.out.println(result);

    }

}



