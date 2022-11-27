package Arrays.Easy;

public class WaveArray {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2,4,7,8,9};

        convertToWave(n,arr);
        PrintArray.print(arr);
    }

    // My solution (Method1)
    static void swap(int[] a,int num1,int num2){
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
        return;
    }

    public static void convertToWave(int n, int[] a) {

        int first = 0;
        int second = 1;


        int mid = n/2;
        for(int i=0;i<mid;i++){
            swap(a,first,second);
            first +=2;
            second +=2;
        }

    }

    // found Optimized better solution, Yay (Method2)


}
