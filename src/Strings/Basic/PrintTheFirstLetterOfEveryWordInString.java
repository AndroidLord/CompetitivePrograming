package Strings.Basic;

public class PrintTheFirstLetterOfEveryWordInString {

    public static void main(String[] args) {

        String S = "geeks for geeks";

        String result = firstAlphabet(S);
        System.out.println(result);

    }

    static String firstAlphabet(String S) {

        String str = "";

        for(int i=0;i<S.length();i++){

            if(i==0)
                str = String.valueOf(S.charAt(i));

            if(S.charAt(i)==' '){
                str += String.valueOf(S.charAt(++i));
            }

        }

        return str;

    }

}
