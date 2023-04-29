package Strings.Basic;

public class RemovingFirstLetterCapitalWord {

    static String firstAlphabet(String S) {

        String str = "";

        for(int i=0;i<S.length();i++){

            if(S.charAt(i)>='A' && S.charAt(i)<='Z' ){
                str += " "+ String.valueOf( S.charAt(++i) );
            }
            else{
                str += String.valueOf(S.charAt(i));
            }


        }

        return str;

    }

}
