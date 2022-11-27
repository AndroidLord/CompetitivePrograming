package Arrays.Basic;

public class AdditionOfArray {

    public static int addArray(int[] arr){
        int sum=0;
        for (int add : arr){
            sum += add;
        }
        return sum;
    }

}
