package Recursion;

import Arrays.Easy.PrintArray;

public class MaxNo {

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {5 ,1079 ,950 ,901 ,899 ,801 ,750 ,650 ,10 ,1};


        System.out.println(findMaximum(arr,n));

    }

    static int max = 0;
    static void search(int[] arr,int n){
        if(n<0)
            return;

        if(arr[n]>max)
            max = arr[n];

        search(arr,n-1);

    }

    static int findMaximum(int[] arr, int n) {

        search(arr,n-1);

        return max;

    }

}