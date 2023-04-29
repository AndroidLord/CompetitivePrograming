package Strings.Basic;

public class RemoveCharacter {

    // working, mine
    static String removeChars(String string1, String string2){

        String str = "";

        for(int i=0;i<string1.length();i++){

            char ch = string1.charAt(i);

            if( !string2.contains(String.valueOf(ch)) ){
                str += ch;
            }

        }
        return str;

    }

}
