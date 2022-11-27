package TestingMain;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {



    public static void main(String[] args) {

        String a = "abb";
        char[] ch1 = a.toCharArray();
        char A = 'A';

        int temp = ch1[1];

        System.out.println(temp);

//        int[] a = {121, 131, 111};
//        int n = a.length;
//        System.out.println("1 for Palindrom\n0 for non\n");
//        int TF = palinArray(a,n);
//
//        System.out.println(TF);

    }

    public static int palinArray(int[] a, int n)
    {


        // for n array of palindron array
        for(int i=0;i<n;i++){

            // for the checking index at a particular index
            Stack<Character> stak = new Stack<>();
            PriorityQueue<Character> que = new PriorityQueue<Character>();
            //Using stack and queue to check for palindrom
            char[] temp = String.valueOf(a[i]).toCharArray();

            for(int j=0 ;j< temp.length ;j++){
                que.add(temp[j]);
                stak.push(temp[j]);
            }


            for(int k=0;k< temp.length;k++)
            {
                int queque = que.remove();
                int stakk = stak.pop();

                if(queque != stakk)
                    return 0;
            }

            stak.clear();
            que.clear();

        }

        return 1;
    }

}