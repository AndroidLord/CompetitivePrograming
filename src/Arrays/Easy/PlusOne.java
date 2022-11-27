package Arrays.Easy;

import java.math.BigInteger;
import java.util.ArrayList;

public class PlusOne {
// Incomplete,
    public static void main(String[] args) {
        int N = 3;
        int arr[] = {1, 2, 4};
        ArrayList<Integer> list = new ArrayList<>();

        for (int temp: arr){
            list.add(temp);
        }

        ArrayList<Integer> result = increment(list,N);

        for (int res:result){
            System.out.print(res+", ");
        }
    }

    static ArrayList<Integer> increment
            (ArrayList<Integer> arr , int N) {

        String str = "";
        for(int i=0;i<arr.size();i++){
            str += arr.get(i);
        }


        long res = Long.parseLong(str)+1;
        str = Long.toString(res);


        for (int i=0;i<N;i++){
            arr.remove(0);
        }

        for(int i=0;i<str.length();i++){
            arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return arr;
    }

}
