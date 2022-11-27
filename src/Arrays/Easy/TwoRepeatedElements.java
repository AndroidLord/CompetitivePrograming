package Arrays.Easy;

import java.util.HashMap;

public class TwoRepeatedElements {

    public static void main(String[] args) {

        int N = 4;
        int array[] = {1,2,1,3,4,3};
        int[] res = twoRepeated(array,N);
        for (int prin:res){
            System.out.print(prin+", ");
        }
    }

    public static int[] twoRepeated2(int arr[], int N)
    {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        for(int i=0;i<N;i++){

            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1 );

            else
                map.put(arr[i],1);

            if(map.get(arr[i])==2 && count<2)
                res[count++] = arr[i];
        }

        return res;
    }

    public static int[] twoRepeated(int arr[], int N)
    {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<N+2;i++){

            if(map.containsKey(arr[i]) )
            {
                map.put(arr[i], map.get(arr[i])+1 );

            }

            else
                map.put(arr[i],1);

        }

        int count = 0;
        for(int prin:map.keySet())
        {
            if(map.get(prin)==2 && count<2)
                res[count++] =prin;

            if(count==2)
                break;
        }

        return res;
    }


}
