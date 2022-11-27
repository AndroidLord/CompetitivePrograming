package Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class InsertionOfTwoArrays {
// completed, only Method1 though
    public static void main(String[] args) {

    }

    // Method 1(Completed, Working)
    public static int NumberofElementsInIntersection(int arr[], int b[], int n, int m){

       int count = 0;

       if(n>m){
           count = Intersection(arr,b);
       }
       else
       {
           count = Intersection(b,arr);
       }

        return count;
    }
    // part of Method 1
    public static int Intersection(int[] bigArray, int[] smallArray){

        int bigSize = bigArray.length;
        int smallSize = smallArray.length;
        int count = 0;

        HashSet<Integer> bigSet = new HashSet<>();

        // Filling all value of bigArray into bigSet, So that be can search the element later
        for (int i=0;i<bigSize;i++){
            bigSet.add(bigArray[i]);
        }

        // Filling up SmallArray int SmallSet
        HashSet<Integer> smallSet = new HashSet<>();
        for (int i=0;i<smallSize;i++){
            smallSet.add(smallArray[i]);
        }

       for(int small:smallSet){
           if(bigSet.contains(small))
               count++;
       }

        return count;
    }


    // Method 2(Not Working)
    public static int NumberofElementsInIntersection1(int arr[], int b[], int n, int m) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i]++));
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(b[i]))
            {
                int c = map.get(b[i]);
                if(c==1)
                    count++;
                else
                {

                    count = count + c;
                }
            }
        }
        return count;
    }


    // Method 3(Not Working)
    public static int NumberofElementsInIntersection2(int arr[], int b[], int n, int m){


        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<n;i++){
            if(list.containsKey(arr[i])){
                list.put(arr[i], list.get(arr[i])+1 );
            }
            else
                list.put(arr[i],1);
        }
        for (int i=0;i<m;i++){
            if(list.containsKey(b[i])){
                list.put(b[i], list.get(b[i])+1 );
            }
            else
                list.put(b[i],1);
        }
        int count = 0;
        for (int itr:list.keySet())
        {
            if(list.get(itr)>1)
                count++;
        }
        return count;
    }
}
