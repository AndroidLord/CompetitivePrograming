package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;

public class SubArrayWithGivenSum {

    static int[] num = {1,7,3,2,5};

    //Function to find a continuous sub-array which adds up to a given number.
    // Used double loop but have faced a time problem in some case
     ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();


        int sum=0;

        for(int i=0;i<n-1;i++){
            int j=i+1;
            int temp=0;


                while(j<n){

                        temp +=arr[j];
                        if((arr[i]+temp)==s)
                        {

                            list.add(i+1);
                            list.add(j+1);
                            break;
                        }
                        j++;


                }

        }
        return list;
    }

    // used a single for loop but the faced the same problem as above of Time-exceeding limit
    ArrayList<Integer> subarraySum2(int[] arr, int n, int s){

         ArrayList<Integer> list = new ArrayList<>();

         for (int i=0,j=i+1,temp=0;
              i<n-1;
              j++){

             temp +=arr[j];

             if(arr[i]==s){
                 list.add(i+1);
                 list.add(i+1);
                 return list;
             }
             else if(arr[j]==s){
                 list.add(j+1);
                 list.add(j+1);
                 return list;
             }

             else if((arr[i]+temp)==s){
                 list.add(i+1);
                 list.add(j+1);
                 return list;
             }

             if(j==n-1){
                 i++;
                 j=i;
                 temp=0;
             }
         }


         list.add(-1);
         return list;
    }

    ArrayList<Integer> subarraySum3(int[] arr, int n, int s){
         ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0,j=i+1; i < n-1; i++) {
            int[] temp = new int[2];
            temp = subArray(arr,i,n,s);
        }


         return list;
    }

    int[] subArray(int[] array,int i,int j,int s){


         return array;
    }

}
