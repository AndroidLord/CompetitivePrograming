package Arrays.Basic;

public class ReverseDigit {

    public static void main(String[] args) {
        long res = reverse_digit(121);
        System.out.println(res);
    }

    public static long reverse_digit(long n)
    {
        if(n==0)
            return 0;


        String str = String.valueOf(n);
        int len = str.length();

        for(int i=len-1,j=1;i>0;i--,j++){
            if(str.charAt(i)=='0')
                str = str.substring(0,i);
        }

        n = Long.parseLong(str);
        len = str.length();
        long rev = 0;

        for(int i=0;i<len;i++){
            long temp = n%10;
            rev = rev + temp;
            n = n/10;
            if(i!=len-1)
                rev = rev *10;
        }
        n = rev;
        return n;
    }

}
