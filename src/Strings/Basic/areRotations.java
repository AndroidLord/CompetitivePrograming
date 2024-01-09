package Strings.Basic;

public class areRotations {

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        System.out.println(areRotations(s,s2));

    }

    public static boolean areRotations(String s1, String s2 )
    {
        int n = s1.length();
        int m = s2.length();

        if(n!=m) return false;

        for(int i=0;i<n;i++){

            String fp = s1.substring(0,i+1);
            String sp = s1.substring(i+1,n);

            String str = sp+fp;

            if(s2.equals(str)) return true;

        }
        return false;
    }
}
