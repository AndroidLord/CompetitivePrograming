package Easy;

import java.util.ArrayList;

public class KthPrimeFactor {

    public static void main(String[] args) {

        int res = kthPrime(81,4);
        System.out.println(res);
    }


    static int kthPrime(int n, int k){

        int count=0;

        ArrayList<Integer> list = new ArrayList<>();
        // list.add(-1);

        int i=1;
        while(n>1){

            if(n%i==0){

                if(isPrime(i))
                {

                    n=n/i;
                    list.add(i);
                    i--;

                }

            }i++;

        }



        if( k>list.size() )
            return -1;

        return list.get(k-1);
    }

    static boolean isPrime(int check){

        if(check<2)
            return false;

        if(check==2|| check==3|| check==5)
            return true;

        for(int i=2;i<=Math.sqrt(check);i++){
            if(check%i==0)
                return false;
        }

        return true;
    }


}
