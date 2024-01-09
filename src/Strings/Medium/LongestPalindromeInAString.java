package Strings.Medium;

public class LongestPalindromeInAString {


    public static void main(String[] args) {

        String S = "aaaabbaa";
        String s2 ="rfkqyuqfjkxy";
       String res = longestPalin(S);

//       StringBuilder builder = new StringBuilder("aab");
//       String rev = builder.reverse().toString();
//        System.out.println(rev);

        System.out.println(res);
    }

    static String longestPalin10(String s){
        // code here
        int mcount = 0;
        String res ="";

        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){

                String substr = s.substring(i,j+1);

                StringBuilder sbuilder = new StringBuilder(substr);

                int count = j-i+1;

                if(count*2>s.length())
                    break;

                String ns = substr.concat(sbuilder.reverse().toString());
                if(s.contains( ns )){
                    if(count*2>mcount){
                        mcount = count*2;
                        res = ns;
                    }
                }
            }

        }
        return res;

    }

    static String longestPalin(String s){
        // code here
        int mcount = 1;
        String res =Character.toString(s.charAt(0));

        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<s.length();j++){

                int count = j-i+1;

                if(count*2>s.length())
                    break;

                String ns ="";

                if(count%2==1){
                    // odd
                    String substr = s.substring(i,j);
                    StringBuilder sbuilder = new StringBuilder(substr);
                    ns = substr.concat(sbuilder.reverse().toString().substring(1,sbuilder.length()));


                }
                else{
                    String substr = s.substring(i,j+1);
                    StringBuilder sbuilder = new StringBuilder(substr);

                    ns = substr.concat(sbuilder.reverse().toString());

                     }

                 if(s.contains( ns )){
                    if(count*2>mcount){
                        mcount = count*2;
                        res = ns;
                    }
                }
            }

        }
        return res;

    }




}
