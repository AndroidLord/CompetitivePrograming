package Easy;

public class ProductsOfPrimeFactor {

    public static void main(String[] args) {
        long res = primeProduct(24);
        System.out.println(res);
    }

    static long primeProduct(int N)
    {
        long pro =0;
        for(int i=1;i<=N;i++){

            if(N%i==0)
            {
                if (isPrime(i)){

                    if(pro==0) pro = i;

                    else pro*=i;

                }

            }

        }


        return pro;
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
