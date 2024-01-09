package Medium;

import java.util.ArrayList;

public class WinCircularGame {

    public static void main(String[] args) {

        System.out.println(findTheWinner(6,5));


    }


    public static int findTheWinner(int n, int k) {


        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){

            list.add(i);

        }
        int i=0;
        while(list.size()!=1){

            int shift = k-1+i;

            if(shift>=n)
               shift=shift%n;

            list.remove(shift);

            i=shift;

            n = n-1;
            if(i>n)
                i=0;
        }


        return list.get(0);
    }



}
