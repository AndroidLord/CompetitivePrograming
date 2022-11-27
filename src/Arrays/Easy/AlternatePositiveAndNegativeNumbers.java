package Arrays.Easy;

import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {

    public static void main(String[] args) {

        int N = 10;
        int Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        rearrange(Arr,N);

        for(int each:Arr){
            System.out.print(each+", ");
        }
    }

    static void rearrange(int arr[], int N) {
        // Positive & Negative search & fill
        ArrayList<Integer> plist = new ArrayList<Integer>();
        ArrayList<Integer> nlist = new ArrayList<Integer>();

        for(int i=0;i<N;i++){
            if(arr[i]>=0)
                plist.add(arr[i]);
            else
                nlist.add(arr[i]);
        }

        // Alternating No by Inserting
        int p = 0,n=0;

        for(int i=0;i<N;i++){
           if (i%2==0 && p< plist.size() || n>=nlist.size()){
               arr[i] = plist.get(p++);
           }
           else if (n< nlist.size() || p>= plist.size())
               arr[i] = nlist.get(n++);
        }

    }

}
