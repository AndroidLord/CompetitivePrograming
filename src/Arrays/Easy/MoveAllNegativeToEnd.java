package Arrays.Easy;

public class MoveAllNegativeToEnd {

    public static void main(String[] args) {

    }

    // (Method 1) VERY INEFFICIENT
    public void segregateElements(int arr[], int n)
    {
        int parr[] = new int[n];
        int narr[] = new int[n];

        int pcount = 0,ncount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0)
            {
                parr[pcount++] = arr[i];
            }
            else
            {
                narr[ncount++] = arr[i];
            }
        }
        for(int i=pcount,j=0;i<(pcount+ncount);i++){
            parr[i] = narr[j++];
        }
        for(int i=0;i<n;i++){
            arr[i] = parr[i];
        }
    }

    /*
    * https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=1&difficulty[]
    * =0&status[]=unsolved&category[]=Arrays&sortBy=submissions
    * */

}
