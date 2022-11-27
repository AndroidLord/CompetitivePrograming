package Arrays.Easy;

import java.util.HashMap;

public class ProductPair {

    public static void main(String[] args) {
        int N = 4, X = 400;
        int arr[] = {10, 20, 9, 40};

        boolean res = isProduct(arr,N,X);
        System.out.println(res);
    }

    static boolean isProduct(int[] arr, int n, long x) {

        HashMap<Double, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Double value = (double) arr[i];
            map.put(value,i);
        }
        for(int i=0;i<n;i++){
            Double sN0 = Double.valueOf((x/arr[i]));

            if(map.containsKey(sN0) && map.get(sN0)!=i)
                return true;


        }

        return false;
    }

}
