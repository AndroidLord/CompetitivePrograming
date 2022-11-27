package Medium;
// Incomplete
public class JumpingNo {

    static long jumpingNums(long x) {

        long original = x;

        if(x>10){
            //For calculating the x length
            String num = Long.toString(x);
            int len = num.length();

            // we made an array of that
            int[] arr = new int[len];
            int i = 0;

            // making all the single digit as long x into an array arr
            while(x!=0){
                arr[i++] = (int)x%10;
                x = x/10;
            }

            int count = 0;
            for(int j=0;j<len-1;j++){

                if(Math.abs(arr[j]-arr[j+1])==1)
                    count++;

            }

            if(count == len-1)
                return original;

            else
            {
                int[] array = new int[len];
                int temp = 0;
                int checker = 0;
                for(int k=len-1;k>=0;k--){
                    array[temp++] = arr[k];
                }
                int current = 0;
                int next = 0;
                int l=0;
                while(checker<len-1){

                    current = array[l];
                    next = l+1;
                    if(current<9)
                    {
                        array[next] = current+1;

                    }
                    else
                        array[next] = 8;

                    checker=checker+1;
                    l = l+1;
                }
                String str = Integer.toString(array[0]);
                for(int s=1;s<array.length;s++)
                {
                   str += array[s];

                }

                long r = Long.parseLong(str);
                return r;

            }

        }

        return original;
    }

    public static void main(String[] args) {

        long result = jumpingNums(69);
        System.out.println(result);

    }

}
