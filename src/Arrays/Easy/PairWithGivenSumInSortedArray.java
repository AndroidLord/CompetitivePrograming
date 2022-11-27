package Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;

// GFG
public class PairWithGivenSumInSortedArray {
// Complete
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int result = Countpair1(arr,n,8);
        System.out.println(result);
    }

    // Method 1, Using HashMap
    static int Countpair1(int arr[], int n, int k)
    {
        int pCount = 0;
        // Insertion in HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        // Checking HashMap for Value
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i]) &&
                    map.get(k-arr[i])!=i){
                pCount++;
            }
        }
        if (pCount!=0)
            return pCount/2;

        return -1;
    }

    // Method 2, Two Pointer approach(Not Mine)
    int Countpair2(int arr[], int n, int sum){

        // Complete the function
        int ans=0;
        int l=0,h=n-1;

        while(l<h){

            if(arr[l]+arr[h]==sum){
                ++ans;
                ++l;--h;
            }
            else if(arr[l]+arr[h]>sum){
                --h;
            }
            else{
                ++l;
            }


        }




        if(ans==0){
            ans=-1;
        }
        return ans;

    }


    // Method 3, Using HashSet(Not Mine)
    static int Countpair3(int a[], int n, int sum) {



        HashSet<Integer> s = new HashSet <>();

        int count = 0;

        for(int i = 0; i < n; i++) {

            if(s.contains(sum - a[i])) {

                count++;

            }

            s.add(a[i]);

        }

        if(count > 0) {

            return count;

        } else {

            return -1;

        }

    }

    // Method 4, Using Binary Search(Not Mine)
    static int Countpair4(int a[], int n, int sum)
    {
        // Complete the function
        int i = 0, resCount = 0, limit;
        if(sum % 2 == 0) {
            limit = sum / 2;
        }
        else {
            limit = sum / 2 + 1;
        }
        while(a[i] < limit) {
            int complement = sum - a[i];
            if(findComplementUsingBinarySearch(a, 0, n - 1, complement)) {
                ++resCount;
            }
            ++i;
        }
        return (resCount == 0 ? -1 : resCount);
    }

    // Method 4, Auxiliary function
    static boolean findComplementUsingBinarySearch(int arr[], int low, int high, int searchElement) {
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(arr[mid] == searchElement) {
                    return true;
                }
                else if(arr[mid] > searchElement) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return false;
        }




}
