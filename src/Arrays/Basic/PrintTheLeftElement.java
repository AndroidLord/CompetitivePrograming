package Arrays.Basic;

import java.util.Arrays;

public class PrintTheLeftElement {

    public long leftElement(long arr[], long n)
    {
        Arrays.sort(arr);
        int high = arr.length-1,low =0;
        while(high>low){
            high--;
            if(high>low){
                low++;
            }
        }
        return arr[high];
    }
//https://practice.geeksforgeeks.org/problems/print-the-left-element2009/1?page=1&difficulty[]=-2&status[]=unsolved&category[]=Arrays&sortBy=submissions
}
