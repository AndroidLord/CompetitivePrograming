package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// completed
public class Duplicate {

    public static ArrayList<Integer> duplicates(int arr[], int n) {

        HashMap<Integer,Integer> set = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!set.containsKey(arr[i])){
                set.put(arr[i],1);
            }
            else
            {
                set.put( arr[i] , set.get(arr[i]) + 1 );

            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int size = set.size();

        for(int key:set.keySet())
        {
            if(set.get(key)>1)
                list.add(key);
        }

       if(list.size()==0)
        {
            list.add(-1);
            return list;
        }
        return list;





    }


    public static void main(String[] args) {
        int N = 5;
        int[] a = {2,3,1,2,3};

        System.out.println(duplicates(a,N));

    }

}
