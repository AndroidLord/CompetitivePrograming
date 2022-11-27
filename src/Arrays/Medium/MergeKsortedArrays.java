package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MergeKsortedArrays {

    public static void main(String[] args) {

        int K = 3;
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer> list= mergeKArrays1(arr,K);

        for (int num:list){
            System.out.print(num+", ");
        }

    }

    // Method 1, using while loop
    public static ArrayList<Integer> mergeKArrays1(int[][] arr,int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int row=0;
        int col=0;
        while(row<k){
            list.add(arr[row][col++]);
            if(col==k){
                col=0;
                row++;
            }
        }
        Collections.sort(list);

        return list;
    }


}
