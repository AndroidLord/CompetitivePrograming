package Arrays.Basic;

import java.util.HashMap;

public class MinDistanceBetweenTwoNo {

    public static void main(String[] args) {

        int N = 4;
        int A[] = {1,2,3,2};
        int x = 1, y = 2;

        int result = minDist(A,N,x,y);
        System.out.println(result);

    }

    static  int minDist(int arr[], int n, int x, int y) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],i);
        }
        if(map.containsKey(x) && map.containsKey(y)){
            int num = map.get(y) - map.get(x);
            if(num<0)
                return num*-1;
            return num;
        }

        return -1;
    }

}
