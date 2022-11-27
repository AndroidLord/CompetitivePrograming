package Strings.Medium;

public class SumOfTwoLargeNo {

    public static void main(String[] args) {
        String no1 = "040";
        String no2 = "751";

        String result = findSum(no1,no2);
        System.out.println(result);

    }

    static String findSum(String x, String y) {

        int n = x.length();
        int m = y.length();

        int i=n-1,j=m-1,carry = 0;
        String output = "";

        while(i>=0 && j>=0){

            int no1 = Character.getNumericValue(x.charAt(i));
            int no2 = Character.getNumericValue(y.charAt(j));

            int temp = no1 + no2;
            if(carry==1){temp+=1;carry=0;}
            if(temp>9)
            {
                carry=1;
                temp=temp%10;
                output=Integer.toString(temp)+output;

            }else
                output=Integer.toString(temp)+output;
            i--;j--;

        }


            if(n>m){
                int index = n-m;
                while(i>=0){
                    int no1 = Character.getNumericValue(x.charAt(i));
                    int temp=0;
                    if(carry==1)
                    {
                        temp = no1+1;
                        carry=0;

                    }
                    if(temp>9)
                    {
                        carry=1;
                        output=Integer.toString(temp)+output;
                    }else
                    {
                        if(temp==0) temp=no1;
                        output=Integer.toString(temp)+output;

                    }
                    i--;
                }
            }
            else if(n<m){

                int index = m-n;
                while(j>=0){
                    int no2 = Character.getNumericValue(y.charAt(j));
                    int temp=0;

                    if(carry==1)
                    {
                        temp = no2+1;
                        carry=0;}

                    if(temp>9)
                    {
                        carry=1;
                        output=Integer.toString(temp)+output;
                    }else
                    {
                        if(temp==0) temp=no2;
                        output=Integer.toString(temp)+output;

                    }
                    j--;
                }

            }
            if(carry==1){

                    String str = "1";
                    str += output;
                    return str;

            }

        return output;


    }

}
