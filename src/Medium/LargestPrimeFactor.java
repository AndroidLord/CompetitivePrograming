package Medium;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        long res = largestPrimeFactor(97);
        System.out.println(res);
    }

    static long largestPrimeFactor(int N) {

        long res=0;
        int lim = (int)Math.sqrt(N) * 2;
        for(int i=1;i<lim+1;i++){
            if(N%i==0)
            {

                //   int sec = N/i;
                //   if(sec>i){
                //       if()
                //   }
                //   else
                res = (long)i;



            }
        }
        return res;
    }


}
