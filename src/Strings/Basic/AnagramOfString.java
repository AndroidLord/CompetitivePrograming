package Strings.Basic;

public class AnagramOfString {


    public static void main(String[] args) {

        String S1 = "basgadhbfgvhads";
        String S2 = "sjdhgvbjdsbhvbvd";


        System.out.println(remAnagrams(S1,S2));

    }


    public static int remAnagrams(String s,String s1)
    {
        int n = s.length();
        int m = s1.length();

        int[] a = new int[27];
        int[] a1 = new int[27];

        for(int i=0;i<n;i++) a[s.charAt(i) - 'a']++;
        for(int i=0;i<m;i++) a1[s1.charAt(i) - 'a']++;

        int count=0;

        for(int i=0;i<n;i++){

            char cur = s.charAt(i);
            int pos = cur-'a';

            if(a[pos]>0 && a1[pos]>0){

                count++;
                a[pos]--;
                a1[pos]--;

            }

        }

        int d1 = n-count;
        int d2 = m-count;;
        if(count>=m && d1!=0){
            return d1;
        }


        return d2;
    }

}
