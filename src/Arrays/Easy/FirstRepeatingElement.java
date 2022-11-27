package Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;

// completed
public class FirstRepeatingElement {

    public static int firstRepeated(int[] arr, int n) {

        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!set.containsKey(arr[i]))
            {
                set.put(arr[i],0);
            }
            else
            {
                set.put(arr[i],set.get(arr[i])+1);
            }
        }

        for(int j=0;j<n;j++){
            if(set.containsKey(arr[j]))
            {
                if(set.get(arr[j])>0)
                    return j+1;
            }
        }



            return -1;
    }

    public static int firstRepeated2(int[] arr, int n) {
        HashSet<Integer> sb=new HashSet<Integer>();

        int firstRepeat=-1;

        for(int i=n-1;i>=0;i--){

            if(sb.contains(arr[i])){

                firstRepeat=i+1;

            }else{

                sb.add(arr[i]);

            }

        }

        return firstRepeat;
    }

    public static void main(String[] args) {

        int n = 7;
        int arr[] = {1, 5, 3, 4, 3, 5, 6};

        int result = firstRepeated2(arr,n);
        System.out.println(result);

    }

}
