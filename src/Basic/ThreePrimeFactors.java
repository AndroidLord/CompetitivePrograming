package Basic;

public class ThreePrimeFactors {

    public static void main(String[] args) {

       int res = hasThreePrimeFac(9L);
        System.out.println(res);

    }




    static int hasThreePrimeFac(Long N) {

        int count=0;

        for(long i=1;i<=N;i++){

            if(N%i==0){
                count++;
            }

            if(count>3)
                return 0;
        }

        if(count==3)
            return 1;

        return 0;


    }

}
