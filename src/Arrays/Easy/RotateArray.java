package Arrays.Easy;

public class RotateArray {

    public static void main(String[] args) {
        int N = 5, D = 2;
        int arr[] = {1,2,3,4,5};

        rotateArr(arr,D,N);

        for (int res:arr)
        {
            System.out.print(res+" ");
        }
    }

    static void rotateArr(int arr[], int d, int n)
    {
        int[] narr = new int[n];
        int pos = 0;
        for(int i=d;i<n;i++){
            narr[pos++] = arr[i];
        }
        for(int i=0;i<d;i++){
            narr[pos++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = narr[i];
        }
    }


}
