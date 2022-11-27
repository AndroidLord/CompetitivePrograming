package Arrays.Basic;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1,9};
        int[] arr = new int[digits.length];
        arr = plusOne(digits);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }

    // Method 1, mine
    public static int[] plusOne1(int[] digits) {

        int pointer = digits.length-1;

        if(digits[pointer]==9){
            while(digits[pointer]==9){
                digits[pointer]=0;
                pointer-=1;
                if(pointer==-1){
                    int[] arr = new int[digits.length+1];
                    arr[0]=1;
                    for(int i=0;i<digits.length;i++)
                    {
                        arr[i+1] = digits[i];
                    }
                    return arr;

                }
                if(digits[pointer]!=9){
                    digits[pointer]=digits[pointer]+1;
                    break;
                }

            }
        }
        else{
            digits[pointer] = digits[pointer]+1;
        }
        return digits;
    }

    // Method 2, not mine
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum < 10) {
                digits[i] = sum;
                carry = 0;
                break;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }
}
