package Easy;

import java.util.Arrays;

public class LeastPrimeFactor {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(leastPrimeFactor(6)));
    }

    public static int[] leastPrimeFactor(int n)
    {
        int[] arr = new int[n];
        arr[0]=1;
        int pos =1;

        for(int i=2;i<=n;i++){

            if(i==2 || i==3 || i==5)
            {
                arr[i-1]=i;
                continue;

            }

            arr[i-1] = leastPrime(i);

        }

        return arr;
    }



    static int leastPrime(int no){

        for(int i=2;i<=Math.sqrt(no);i++){

            if(no%i==0)
                return i;

        }

        return 2;
    }


}
