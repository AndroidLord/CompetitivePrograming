package Basic;

public class FullPrime {

    public static void main(String[] args) {
      int res =  fullPrime(37);
        System.out.println(res);
    }

    static int fullPrime(int N){

        for(int i=2;i<=Math.sqrt(N);i++){

            if(N%i==0){
                return 0;
            }

        }

        while(N!=0){

            int nu = N%10;

            if(nu!=2 && nu!=3 && nu!=5 && nu!=7)
                return 0;

            N = N/10;

        }
        return 1;
    }


}
