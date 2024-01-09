package Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrimeFactors {

    public static void main(String[] args) {

       int[] res = AllPrimeFactors(100);
        System.out.println(Arrays.toString(res));

    }

    public static int[] AllPrimeFactors(int n)
    {

        ArrayList<Integer> list = new ArrayList<>();


        // found factor
        for(int i=2;i<=n;i++){

            if(n%i==0)
            {
                list.add(i);

            }

        }

        int pos = list.size();
        // defining factor
        for(int i=0;i<pos;i++){

            if(list.get(i)>=4)
                for(int j=2 ; j<list.get(i) ; j++){
                    int no = list.get(i);
                    if( no%j==0 )
                    {
                        list.set(i,0);
                        break;
                    }

                }

        }
        list.removeAll(Collections.singleton(0));
        int[] array = new int[list.size()];
        pos=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=0)
            array[pos++] = list.get(i);
        }
        return array;

    }



}
