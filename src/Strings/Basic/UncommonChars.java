package Strings.Basic;

import java.util.Arrays;
import java.util.HashMap;

public class UncommonChars {


    public static void main(String[] args) {

        String s = "geeksforgeeks";
        String s1 = "geeksquiz";

        System.out.println(uncommonChar(s,s1));

    }

    static String uncommonChar(String s, String s1)
    {
        HashMap<Character,Integer> map = new HashMap<>();

        int n = s.length();
        int m = s1.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(int i=0;i<m;i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String str = "";

        for(char ch:map.keySet()){

            if(map.get(ch)==1){

                str += ch;


            }

        }

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        return ch.toString();

    }


}
