package Strings.Easy;

import java.util.HashMap;

public class GameWithString {

    public static void main(String[] args) {

    }

    // wrong
    static int minValue(String s, int k){

        HashMap<Character,Integer> map = new HashMap<>();

        s = s.substring(0,s.length()-k);

        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i),1);
        }

        int res = 0;
        for(int num:map.values()){

            res = res+num*num;

        }
        return res;
    }


}
