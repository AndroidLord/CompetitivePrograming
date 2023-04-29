package Strings.Basic;

import java.util.HashMap;

public class StringReversal {

    // working, mine
    public String reverseString(String s)
    {

        HashMap<Character,Integer> map = new HashMap<>();
        String str = "";

        // every value > 1 is removed along with space
        for(int i=s.length()-1;i>=0;i--){
            if(map.containsKey(s.charAt(i))){
                // alreadry
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                // new value
                if(s.charAt(i)!=' ')
                    str +=s.charAt(i);
                map.put(s.charAt(i),1);
            }
        }


        return str;
    }


}
