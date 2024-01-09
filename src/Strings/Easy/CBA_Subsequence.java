package Strings.Easy;

public class CBA_Subsequence {


    public static void main(String[] args) {


        String result = cbaSubsequence("aaaaab",6);

        System.out.println(result);

    }


    static String cbaSubsequence(String S, int N) {

        int[] alph = new int[26];

        for(int i=0;i<N;i++){

            int pos = S.charAt(i)-'a';

            alph[pos]++;

        }

        String res = "";
        for(int i=0;i<26;i++){

            res += Character.toString(('a' + i)).repeat(alph[i]);



        }


        return res;
    }

}
