package Basic;

public class TwistedPrimeNumber {


    // working, mine
    int isTwistedPrime(int N) {

        if(isPrime(N)){
            int rev = 0;
            while(N!=0){

                int no = N%10;
                N=N/10;
                rev = rev*10 + no;

            }
            if(isPrime(rev))
                return 1;



        }
        return 0;

    }

    boolean isPrime(int check){

        if(check==2|| check==3|| check==5)
            return true;

        for(int i=2;i<=Math.sqrt(check);i++){
            if(check%i==0)
                return false;
        }

        return true;
    }


}
