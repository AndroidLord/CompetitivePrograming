package Easy;

public class SummedMatrix {

    static long sumMatrix(long n, long q) {

        if(q<2)
            return 0;

        else if(n>q)
        {
            return q-1;
        }
        else if(n==q)
            return 2*n - q - 1;

        else if(q>n && q>2*n)
            return 0;

        else
            return 2*n - q + 1;
    }

}
