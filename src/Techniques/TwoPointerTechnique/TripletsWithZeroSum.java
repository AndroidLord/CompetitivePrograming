package Techniques.TwoPointerTechnique;

import java.util.Arrays;

public class TripletsWithZeroSum {

    public static void main(String[] args) {
        int n = 5, arr[] = {4 ,-16, 43, 4, 7, -36 ,18};
        boolean ans = new TripletsWithZeroSum().findTriplets(arr, arr.length);
        System.out.println(ans);
    }


    public boolean findTriplets(int arr[] , int n)
    {
        if(n>2){

            Arrays.sort(arr);

            for(int i=0;i<n;i++){
                int j =i+1,k=n-1;
                while(j<k){

                    if(i!=j && i!=k){

                        if(arr[i]+arr[j]+arr[k]==0)
                            return true;

                        else if((arr[i]+arr[j]+arr[k])>0)
                            k--;

                        else if((arr[i]+arr[j]+arr[k])<0)
                            j++;

                    }
                    else
                        j++;

                }

            }
        }

        return false;
    }


}
