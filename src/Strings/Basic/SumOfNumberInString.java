package Strings.Basic;

public class SumOfNumberInString {


    //working, mine
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {

        long sum = 0;
        int n = str.length();

        for(int i=0;i<n;i++){

            if( str.charAt(i) >= '0' && str.charAt(i) <= '9'){

                long temp = str.charAt(i) -'0';

                for(int j=i+1;j<n;j++){
                    if( str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                        temp = temp * 10 +  (str.charAt(j) - '0');
                        i++;
                    }
                    else{
                        break;
                    }
                }
                sum = sum + temp;
            }

        }

        return sum;
    }

}
