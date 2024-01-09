package Easy;

public class SmallestNumber_SumOfDigits_Divisible10N {


    public static void main(String[] args) {

        String res = digitsNum(10);
        System.out.println(res);

    }

    public static String digitsNum(int N)
    {

        double result = Math.pow(10,N);

        long divident = (long) result;
        long psmall = divident+1;

        while(psmall%divident!=0 || sumTheDigits(psmall)!=N){
            psmall++;



        }

        return Long.toString(psmall);

    }

    public static long sumTheDigits(long number) {

        String numString = Long.toString(number);
        long sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }

        return sum;
    }


}
