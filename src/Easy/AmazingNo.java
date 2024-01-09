package Easy;

public class AmazingNo {

    public static void main(String[] args) {
        long res =isAmazing(4);
        System.out.println(res);

    }

    static long isAmazing(long n){


        int count = 0;

        for(int i=2;i<n;i++){

            if(n%i==0)
                count++;

            if(count>1)
                return 0;

        }
        if(count==0)
            return 0;

        return 1;
    }

}
