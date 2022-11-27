package Arrays.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

// Completed
public class RemoveDuplicateElementFromArray {
    // without using HASHMAP
    // did this using HashSet though

    public static void main(String[] args) {

        int n = 4;
        int[] arr = {1, 2, 2, 3};

        int result = remove_duplicate3(arr,n);
        for (int i=0;i<result;i++){
            System.out.print(arr[i]+", ");
        }
    }
    // (Method 1)Done Using Set
    static int remove_duplicate(int arr[],int n){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int j=0;

        int[] newArray = new int[set.size()];
        for (Integer integer : set) {
            newArray[j] = (int) integer;
            j++;
        }
        Arrays.sort(newArray);
        for (int i=0;i< set.size();i++){
            arr[i] = newArray[i];
        }

        return set.size();
    }

    // (Method 2)Using the fact that the Array is sorted and next contiguous element be next to the original one
    static int remove_duplicate2(int arr[],int n){

        int i=0,j=1,a=0;
        int[] newArray = new int[n];
        int TotalCount = 0;
        while(i<n){
            newArray[a++] = arr[i];
            if (j<n)
            if(arr[i]==arr[j]){
                int rep = arr[i];
                int count = 0;
                for (int k=j;k<n;k++){
                    if(rep==arr[k]){
                        count++;
                    }
                    else
                        break;
                }
                i += count;
                j = i+1;
                TotalCount +=count;
            }
            i++;
            j++;
        }

        for (int b=0;b< newArray.length;b++){
            arr[b] = newArray[b];
        }

        return newArray.length-TotalCount;
    }

    // (Method 3) GFG solution for this
    static int remove_duplicate3(int arr[],int n){
        int i=0;
        for(int j=1; j<n; j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
