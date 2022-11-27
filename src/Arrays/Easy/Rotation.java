package Arrays.Easy;

import java.util.Arrays;

public class Rotation {
// completed
    public static void main(String[] args) {



    }

    // Method 1 - Completed by self
    int findKRotation(int arr[], int n) {

        int[] narr = new int[n];
        for(int i=0;i<n;i++){
            narr[i] = arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[0]==narr[j])
                break;
            count++;
        }
        return count;

    }

    // Method 2 - completed by self
    int findKRotation2(int arr[], int n) {


        int count =1;
        for(int i=0;i<n-1;i++){

            if(arr[i]>arr[i+1])
                break;

            else if(arr[i]<arr[i+1])
                count++;
        }
        if(count==n)
            return 0;
        return count;

    }

}
