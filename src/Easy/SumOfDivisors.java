package Easy;

public class SumOfDivisors {

    public static void main(String[] args) {
     int res =   sumOfDivisors(10);
        System.out.println(res);
    }

    static int sumOfDivisors(int n){

        if(n<2)
            return n;

        int sum=0;

        for(int i=1;i<=n;i++){

            if(n%i==0){
                int js = 0;
                for(int j=1;j<=i;j++){

                    if(i%j==0)
                        js+=j;

                }
                sum+=js;
            }
        }

        return sum;


    }

}
