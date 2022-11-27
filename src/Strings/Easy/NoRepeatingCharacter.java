package Strings.Easy;

import java.util.HashMap;

public class NoRepeatingCharacter {

    public static void main(String[] args) {

    }



    static char nonRepeatingCharacter(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char charPos = s.charAt(i);

            if(map.containsKey(charPos))
                map.put(charPos,map.get(charPos)+1);

            else
                map.put(charPos,1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return s.charAt(i);
        }

        return '$';
    }

}
