package Contest.CodeChief;

import java.util.Scanner;

public class MakeMoney {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i=0;i<T;i++){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int c = scan.nextInt();

            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = scan.nextInt();
            }

            int tcost = 0;
            if(x==c){
                int sum = 0;
                for(int k=0;k<n;k++){
                    sum +=a[k];
                }
                System.out.println(sum);
                continue;
            }

            for(int k=0;k<n;k++){
                if(a[k]<x){
                    a[k] = x;
                    tcost +=  c;
                }
                if(tcost>=x)
                    break;
            }
            int sum = 0;
            for(int b=0;b<n;b++){
                sum = sum + a[b];
            }
            System.out.println(sum-tcost);

        }
    }

}
