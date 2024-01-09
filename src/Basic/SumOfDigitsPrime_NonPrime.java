package Basic;

public class SumOfDigitsPrime_NonPrime {


    public static void main(String[] args) {

        int res =digitPrime(102520060);
        System.out.println(res);

    }

    static int digitPrime(int n){

        int sum=0;

        while(n>=10){

            int no = n%10;
            n=n/10;

            sum+=no;

            if(n<10){

                 no = n%10;
                n=n/10;

                sum+=no;
                n=sum;
                sum=0;
            }

                //n=sum;



        }

        if(isPrime(n))
            return 1;

        return 0;
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
