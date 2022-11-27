package Contest.CodeChief;

import java.util.Scanner;

public class MinNoOfOnes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[T];

        for(int i=0;i<T;i++){

            int N = scan.nextInt();
            arr[i] = N/2;
        }
        for(int res:arr){
            System.out.println(res);
        }

    }

}
