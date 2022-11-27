package Arrays.Easy;

import java.util.ArrayList;
import java.util.Stack;

public class LeaderInArray {

    static ArrayList<Integer> leaders2(int arr[], int n){

        ArrayList<Integer> list = new ArrayList<>();
        int leader;
        for(int i=0;i<n;i++){
            leader = arr[i];

            for(int j=i+1;j<n;j++){

                if(leader<arr[j])
                    break;

                else if(j==n-1)
                    list.add(leader);
            }
            if(i==n-1){
                list.add(arr[i]);
            }
        }
        return list;
    }

    static ArrayList<Integer> leaders3(int arr[],int n){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0,j=1;i<n;j++){
            int leader = arr[i];

            if(arr[j]>leader)
            {
                i=j;


            }
            if(j==n-1 && i!=n-1)
            {
                list.add(leader);
                j = i;
                i++;
            }

            else if(i==n-1)
            {
                list.add(arr[i]);
                break;
            }

        }
        return list;
    }

    static ArrayList<Integer> leaders4(int arr[], int n){

        ArrayList<Integer> ans=new ArrayList<Integer>();



        Stack<Integer> s=new Stack<Integer>();



        for(int i=n-1;i>=0;i--) {

            if(s.isEmpty())

                s.add(-1);



            if(arr[i] >=s.peek())

                s.add(arr[i]);

        }

        while(s.size()>1)

            ans.add(s.pop());



        return ans;
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0,j=1;i<n;j++){
            int leader = arr[i];

            if(arr[j]>leader)
            {
                if(i==0)
                {i=1;j=1;}
                else{
                    j=i;
                    i++;}

            }
            else if(j==n-1 && i!=n-1)
            {
                list.add(leader);
                j = i;
                i++;
            }

            if(i==n-1)
                {list.add(arr[i]);
                break;}

        }
        return list;
    }



    public static void main(String[] args) {
        int n = 6;
        int A[] = {16,17,4,3,5,2};

        System.out.println(leaders4(A,n));
    }

}
