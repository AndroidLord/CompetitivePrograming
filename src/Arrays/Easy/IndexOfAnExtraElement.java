package Arrays.Easy;

public class IndexOfAnExtraElement {

    public static void main(String[] args) {
        int N = 7;
        int A[] = {2,4,6,8,9,10,12};
        int B[] = {2,4,6,8,10,12};

        int result = findExtra(A,B,N);
        System.out.println(result);

    }

    public static int findExtra(int arr[], int b[], int n) {


        int low = 0;
        int high = n-1;
        int mid=0;
        while(low<high){

            mid = (low+high)/2;

            if(arr[mid]==b[mid])
                low = mid + 1;

            else
                high = mid-1;
        }
        return mid-1;
    }

    public int findExtra2(int arr[], int b[], int n) {
        int extra = 0;
        int m = n-1;
        if(arr[0]==b[0])
            for(int i=1;i<m;i++){
                if(b[i]!=arr[i]){
                    extra = i;
                    break;
                }
            }
        return extra;
    }

    int findExtra3(int arr1[],  int arr2[], int n)
    {
        // Initialize result
        int index = n-1;

        // left and right are end
        // points denoting the current range.
        int left = 0, right = n - 2;
        while (left <= right)
        {
            int mid = (left + right) / 2;

            // If middle element is same
            // of both arrays, it means
            // that extra element is after
            // mid so we update left to mid+1
            if (arr2[mid] == arr1[mid])
                left = mid + 1;

                // If middle element is different
                // of the arrays, it means that
                // the index we are searching for
                // is either mid, or before mid.
                // Hence we update right to mid-1.
            else
            {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than
        // left our search is complete.
        return index;
    }
}
