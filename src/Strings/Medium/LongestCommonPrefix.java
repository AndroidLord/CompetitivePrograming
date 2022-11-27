package Strings.Medium;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] s = {"a","b"};
        String res = lcp(s,s.length);
        System.out.println(res);
    }

    // Method 1, working
    public static String lcp(String s[],int n)
    {
        if(n==1)
            return s[0];

        Arrays.sort(s);
        int len = s[0].length();

        int pos=0,i=1;
        while(pos<len){

            if(s[0].charAt(pos)!=s[i].charAt(pos))
            {
                break;
            }

            if(i == n - 1){
                i=0;
                pos++;
            }

            i++;

        }

        if(pos==0) return "";

        return s[0].substring(0,pos);


    }


    // Method 2, not working
    public static String lcp2(String s[],int n)
    {
        if(n==1)
            return s[0];

        Arrays.sort(s);
        int len = s[0].length();

        int pos=0,i=1,j=len-1,notInclude=0;
        while(pos<len){

            String s1 = s[0].substring(0,len-notInclude);
            String s2 = s[i].substring(0,len-notInclude);

            if(!s1.equals(s2)) {
                j--;notInclude++;
            }
            else if(s1.equals(s2) && i==n-1){break;}


            if(i == n - 1){
                i=0;
                pos++;
            }

            i++;

        }

        if(pos==0)
            return "-1";


        return s[0].substring(0,j+1);


    }



}
