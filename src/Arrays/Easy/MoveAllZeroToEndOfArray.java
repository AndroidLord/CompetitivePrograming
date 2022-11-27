package Arrays.Easy;

import java.util.Arrays;

public class MoveAllZeroToEndOfArray {

    public static void main(String[] args) {

        int N = 5;
        int arr[] = {3, 5, 0, 0, 4};

        pushZerosToEnd(arr,N);
        System.out.println(Arrays.toString(arr));;
    }

    static void pushZerosToEnd(int[] arr, int n) {

        Arrays.sort(arr);

        int len = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                count++;
        }
        len -=count;
        int j=0;
        for(int i=count;i<n;i++){
            swap(arr,i,j);
            j++;
        }}
        static void swap(int[] arr,int a,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

    void pushZerosToEnd1(int[] arr, int n) {
        int i=0,j=0;
        while(i<n-1 && j<n-1){
            if(arr[i]==0 && j<n-1){
                j++;
                if(arr[j]!=0){
                    swap1(arr,i,j);
                    i++;
                }
            }
            else
            {
                i++;j++;
            }

        }

    }
    static void swap1(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void pushZerosToEnd2(int[] arr, int n) {
        int i=0,j=0;
        while(i<n-1 && j<n-1){
            if(arr[i]==0 && j<n-1){
                j++;
                if(arr[j]!=0){
                    swap(arr,i,j);
                    i++;
                }
            }
            else
            {
                i++;j++;
            }

        }

    }

    //https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Arrays&sortBy=submissions

}
