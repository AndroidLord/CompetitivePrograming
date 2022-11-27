package Recursion;

public class SearchingNo {

    static int index=-1;

    static void recur(int[] arr,int N,int x){

        if(N<0 && index>-1)
            return;

        if(N<0)
        {index = -1;
            return;}

        if(arr[N]==x)
        {index = N;}
        recur(arr,N-1,x);

    }

    public static void main(String[] args) {

        int arr[] = {51,54,99,32};
        recur(arr,3,100);
        System.out.println(index);

    }

}
