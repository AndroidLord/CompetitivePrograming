package Contest;

import java.util.Scanner;

public class ExpenseList {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int N = scan.nextInt();
            int X = scan.nextInt();

            int Tincome = (int) Math.pow(2,X);
            int rincome = Tincome/2;
            for(int j=2;j<=N;j++){
                rincome = rincome/2;
            }
            System.out.println(rincome);
        }
    }

}
