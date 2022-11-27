package Arrays.Easy;

import java.util.Arrays;

public class MissingNo {

    static int MissingNumber(int array[], int n) {
        Arrays.sort(array);

        int first = 1;
        int size = array.length;
        for(int i=0;i<n;i++){

            if(array[i]!=first && i<n-1)
                return first;
            else if(array[size-1] != n)
                return n;

            first++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 5;
        int A[] = {1,2,3,5};

        int missNo = MissingNumber(A,N);
        System.out.println(missNo);
    }

}
