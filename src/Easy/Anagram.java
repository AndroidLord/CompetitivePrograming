package Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Anagram {



    public static void main(String[] args) {

       String a = "b";
       String b = "d";
       boolean is = isAnagram(a,b);
        System.out.println(is);

    }

    // My Method (Method 1)
    public static boolean isAnagram(String a,String b)
    {
        int length = a.length();
        int length1 = b.length();

        if(length != length1)
            return false;

        int[] arr1 = new int[length];
        char[] char1 = a.toCharArray();

        int[] arr2 = new int[length];
        char[] char2 = b.toCharArray();

        for(int i=0;i<length;i++){
            arr1[i] = a.charAt(i);
            arr2[i] = b.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int j=0;j<length;j++){
            if(arr1[j]!=arr2[j])
                return false;
        }


        return true;

    }

    // Another Person Method (Method2)
    public static boolean isAnagram2(String a,String b)

    {

        int length = a.length();

        int length1 = b.length();



        if(length != length1)

            return false;





        int[] arr1 = new int[length];

        int[] arr2 = new int[length];





        for(int i=0;i<length;i++){

            arr1[i] = a.charAt(i);

            arr2[i] = b.charAt(i);

        }





        Arrays.sort(arr1);

        Arrays.sort(arr2);



        for(int j=0;j<length;j++){

            if(arr1[j]!=arr2[j])

                return false;

        }





        return true;



    }

    // Another Person Method (Method3)
    public static boolean isAnagram3(String a,String b)
    {

        if(a.length() != b.length()) return false;

        int[] a1 = new int[26];
        int[] b1 = new int[26];
        int len = a.length();

        for(int i=0;i<len;i++){
            a1[a.charAt(i) - 'a']++;
            b1[b.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(a1[i] != b1[i]) return false;
        }

        return true;

    }

    // Another Person Method (Method4)
    public static boolean isAnagram4(String a,String b)
    {

        if(a.length()!=b.length()){

            return false;

        }

        char []s1 = a.toCharArray();

        char []s2 = b.toCharArray();



        Arrays.sort(s1);

        Arrays.sort(s2);



        if(Arrays.equals(s1,s2)){

            return true;

        }

        return false;

    }



}
