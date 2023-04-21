package Arrays.Basic;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInGroups {
    /*Incomplete*/
    static void reverseInGroups2(ArrayList<Integer> arr, int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = new int[n];
        int count=0;

        for(int i=0;i<n;i++){

            list.add(arr.get(i));

            if((i+1)%k==0 && i!=0 || (n-i-1)<k && i==n-1)
            {
                Collections.reverse(list);
                int j=0;
                while(j<k && (n-i-1)<k && i==n-1){
                    temp[count]=list.get(0);
                    list.remove(0);
                    count+=1;j++;
                }
            }
        }

        for(int a=0;a<n;a++){
            arr.set(a,temp[a]);
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int arr[] = {1,2,3,4,5,6,7};
        for(int e: arr){
            list1.add(e);
        }


        reverseInGroups(list1, list1.size(), 3);
        System.out.println(list1);
    }


    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        if(k==1)
            return;

        int first = 0,last = k - 1;
        int count =0;
        int pos = 0;
        while(last>first){

            int temp = arr.get(first);
            arr.set(first,arr.get(last));
            arr.set(last,temp);

            first++;
            last--;
            if(count==0)
            {
                pos=k;
                count++;
            }
            if(first>=last && pos<n){



                    first = pos;
                    if(pos+k-2<n)
                    {
                        last = pos + k-2;

                    }
                    else{
                        last = n - 1;
                    }
                    pos +=k;

            }
        }

    }


}
