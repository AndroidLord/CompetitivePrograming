package Arrays.Easy;

public class productArrayPuzzle {
// incomplete
    public static void main(String[] args) {

        int n = 5;
        int nums[] = {10, 3, 5, 6, 2};

        long[] result = productExceptSelf(nums,n);
        for (long temp:result){
            System.out.print(temp+", ");
        }
    }

    public static long[] productExceptSelf(int nums[], int n)
    {
        long[] P = new long[n];

        int totalMul = 1;
        for(int i=0;i<n;i++){
            totalMul *= nums[i];
        }

        for (int i=0;i<n;i++){
            int tempRes = totalMul/nums[i];
            P[i]=tempRes;
        }

        return P;
    }

}
