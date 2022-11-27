package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TwoNumberWithOddOccurances {

    class Solution
    {
        // My Method 1, This solution isn't good as
        // It won't pass some Time constraint and thus slow~
        public int[] twoOddNum(int arr[], int n)
        {
            int[] retorn = new int[2];
            int no = 0;

            HashSet<Integer> evenlist = new HashSet<Integer>();
            ArrayList<Integer> cont = new ArrayList<>();

            for(int i=0; i<n && cont.size()<2 ;i++){

                int count = 0;


                if(!evenlist.contains(arr[i])){

                    for(int j=i;j<n;j++){

                        if(arr[i]==arr[j])
                        {

                            count++;

                        }


                    }

                    if(count%2==0)
                        evenlist.add(arr[i]);

                    else
                    {
                        retorn[no++] = arr[i];
                        cont.add(arr[i]);
                    }
                }

            }

            if(retorn[0]<retorn[1])
            {
                int temp = retorn[0];
                retorn[0] = retorn[1];
                retorn[1] = temp;
            }

            return retorn;


        }

        public int[] twoOddNum2(int arr[], int n)
        {
            HashMap<Integer,Integer> countMap = new HashMap<>();

            for(int i=0;i<n;i++){


                    if(!countMap.containsKey(arr[i])){
                        countMap.put(arr[i],1);
                    }
                    else{//           Key      Value
                        countMap.put(arr[i], (countMap.get(arr[i])+1) );
                    }


            }
            // max, min
            int max = 0, min = 0;
            for(int temp:countMap.keySet()){
                if(temp%2!=0){
                    if(countMap.get(temp)>max){
                        min = max;
                        max = temp;
                    }
                    else
                        min = temp;
                }
            }
            int[] result = {max,min};
            return result;

        }

    }

}
