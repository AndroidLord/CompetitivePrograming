package Arrays.School;

import java.util.Arrays;

public class PartyOfCouples {

    // working
    //https://practice.geeksforgeeks.org/problems/alone-in-couple5507/1?page=1&difficulty[]=-2&status[]=unsolved&curated[]=1&sortBy=submissions
    static int findSingle(int N, int arr[]){

        Arrays.sort(arr);

        for(int i=0;i<N-1;i+=2){
            if(arr[i]!=arr[i+1])
                return arr[i];
        }

        return arr[N-1];
    }

}
