package Contest;

public class FindThePivotInteger {
// submitted in contest
    public static void main(String[] args) {
        int result = pivotInteger(8);
        System.out.println(result);
    }

    public static int pivotInteger(int n) {

        int low = 0;
        int high = n;

        int lowAddition=0 ,highAddition=n;
        while(low<high){

            if(lowAddition<=highAddition)
            {
                lowAddition += (low+1);
                low++;
            }

            if(lowAddition>highAddition){
                highAddition += (high-1);
                high--;
            }
            if(lowAddition==highAddition && low==high)
            {
                return low;

            }



        }


        return -1;
    }

}
