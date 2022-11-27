package Contest.CodeChief;

import java.util.Scanner;

public class TourOfKing {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){

        int N = scan.nextInt();
        int M = scan.nextInt();

        int nTotal = N*5;
        int mTotal = M*7;
        arr[i] = nTotal+mTotal;

        }
        for (int res:arr){
            System.out.println(res);
        }

    }

}
