package Arrays.School;

public class CountDigits {

    static int evenlyDivides(int N){
        int count = 0;
        int temp = N;
        while(temp>0){

            int num = temp%10;
            temp = temp/10;

            if(num!=0)
            if(N%num==0)
                count++;

        }

        return count;
    }

    public static void main(String[] args) {
        int result  = evenlyDivides(24406);
        System.out.println(result);
    }

}
