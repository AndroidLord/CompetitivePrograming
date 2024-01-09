package Strings.Basic;

import java.util.ArrayList;

public class RemoveCommonCharactersAndConcatenate {

    // Mine, Not Working(as Exceeding Time Limit)
    public static String concatenatedString2(String s1,String s2)
    {
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            if(s2.contains( Character.toString(s1.charAt(i)) )){
                list.add(s1.charAt(i));
            }
        }

        String res = "";
        for(int i=0;i<s1.length();i++){
            if(!list.contains(s1.charAt(i))){
                res+=s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(!list.contains(s2.charAt(i))){
                res+=s2.charAt(i);
            }
        }
        return res;
    }




}
