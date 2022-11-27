package Arrays.Basic;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;

        int[] nums2 = {1,2,3};
        int n = nums2.length;

        merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] arr = new int[n+m];

        while(i<m && j<n){
            // if nums2,j is greater than nums1,i
            if(nums1[i]<=nums2[j]){
                arr[k]= nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>=nums2[j]){
                arr[k]=nums2[j];
                j++;k++;
            }
        }
        if(i<m){
            for(int a=k;a<m+n;a++,i++){
                arr[a] = nums1[i];
            }
        }
        else if(j<n){

            for(int a=k;a<m+n;a++,j++){
                arr[a] = nums2[j];
            }
        }
        System.arraycopy(arr,0,nums1,0,n+m);
    }

}
