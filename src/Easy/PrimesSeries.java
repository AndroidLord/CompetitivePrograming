package Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class PrimesSeries {

    public static void main(String[] args) {

        String res = isSumOfTwo(4);
        System.out.println(res);

    }

    // Method 1

    static String isSumOfTwo(int N){

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=2;i<=N-2;i++){

            if(isPrime(i)){
                count++;
                list.add(i);
                map.put(i,1);

            }

        }

        for(int i=0;i<count;i++){
            int sub = N-list.get(i);
            if( map.containsKey(sub) ){

                return "Yes";

            }

        }
        return "No";

    }

    static boolean isPrime(int check) {

        if (check < 2)
            return false;

        if (check == 2 || check == 3 || check == 5)
            return true;

        for (int i = 2; i <= Math.sqrt(check); i++) {
            if (check % i == 0)
                return false;
        }

        return true;
    }


    // Method 1 End



    static String isSumOfTwo2(int n){

        int lim = (int) Math.sqrt(n);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=1;i<=n;i++){

            

            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0){

                    map.put(i,0);

                }
            }




        }

        for(int num: map.keySet()){
            if(map.containsKey(n-num))
                return "Yes";
        }

        return "No";
    }


}
