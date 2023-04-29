package Strings.Basic;

public class TraingleGrowingDownward {
    // https://practice.geeksforgeeks.org/problems/triangle-growing-downwards2344/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Strings&category[]=Stack&sortBy=accuracy
    // mine, working, but super not good approach
    static void printTriangleDownwards(String str){

        for(int i=0;i<str.length();i++){


            for(int j=str.length()-i-2;j>=0;j--){
                // for dots
                System.out.print(".");

            }
            for(int j=0;j<=i;j++){
                // for making words
                System.out.print(str.charAt(j));

            }
            System.out.println("");
        }

    }

    // awesome solution, not mine
    static void printTriangleDownwards2(String str){

        String s="";

        for(int i=0;i<str.length();i++){

            s+='.';

        }

        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<str.length();i++){

            sb.append(str.charAt(i));

            sb.delete(0,1);

            System.out.println(sb);
        }
    }

    // awesome solution, not mine
    static void printTriangleDownwards3(String str){

        int n = str.length();
        for(int i=1; i<=n; i++) {
            for(int k=n-i; k>0; k--) {
                System.out.print('.');
            }
            System.out.println(str.substring(0,i));
        }


    }
}
