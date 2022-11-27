package Contest.CodeChief;

import java.util.Arrays;
import java.util.Scanner;

public class IntrestingArray {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i=0;i<T;i++){

            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int j=0;j<n;j++){
                arr[j] = scan.nextInt();
            }

            int[] arr1 = arr.clone();
            Arrays.sort(arr1);
            int count = 0;
            for(int j=0;j<n-1;j++){
                if(arr1[j]==arr1[j+1]){
                    count++;
                }
                else
                    count = 0;
                if(count==2)
                {
                    System.out.println(-1);
                    break;
                }
            }
            for(int num:arr1){
                System.out.print(num + " ");
            }

        }

    }

}
