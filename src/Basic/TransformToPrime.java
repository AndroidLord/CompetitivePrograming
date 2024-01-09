package Basic;

public class TransformToPrime {


    public static void main(String[] args) {

       int n=5;
       long arr[] = { 2, 4, 6, 8, 12 };

        long res = minNumber(arr,n);
        System.out.println(res);
    }


    static long minNumber(long arr[], int N)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++){

            sum +=arr[i];
        }

        if(isPrime(sum))
            return 0;

        int count = 0;
        int scopy = sum+1;
        while(!isPrime(scopy)){
            scopy++;
        }
        return (long)(scopy-sum);

    }

    static boolean isPrime(int check){

        if(check==2|| check==3|| check==5)
            return true;

        for(int i=2;i<=Math.sqrt(check);i++){
            if(check%i==0)
                return false;
        }

        return true;
    }

}
