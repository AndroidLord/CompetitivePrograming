package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&difficulty[]=1&status[]=unsolved&category[]=Arrays&sortBy=submissions

    public static void main(String[] args) {

    }

    // Method 1, Using HashMap
    static int majorityElement1(int a[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<size;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else
                map.put(a[i],1);
        }
        int max = 0;
        for(int num:map.keySet()){
            if(map.get(num)>size/2){
            max = num;
            }
        }
        if(max!=0)
            return max;

        return -1;
    }

    // Method 2,
    static int majorityElement(int a[], int size)
    {

        if(size==1) return a[0];

        int compare = size/2,

                count=0;

        Arrays.sort(a);

        for(int i=0;i<size-1;i++){

            if(a[i]==a[i+1]) {

                count++;

                if(count>=compare) return a[i];

            }else{

                count = 0;

            }

        }

        return -1;
    }



}
