package Strings.Medium;

import java.util.HashMap;

public class RemoveAndReverse {

    public static void main(String[] args) {
        String S = "badaa";

        String result = removeReverse(S);
        System.out.println(result);
    }

    static String removeReverse(String s)
    {

        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        int high = len -1,low=0;
        boolean rev = false;
        String str = "";
        while(high>=low){
            if(!rev)
                if(map.get(s.charAt(low))>1)
                {
                    rev = true;
                    map.put(s.charAt(low),map.get(s.charAt(low))-1);
                    s = s.substring(0,low) + s.substring(low,s.length());
                    low=0;
                }
                else{
                    str += s.charAt(low);
                    low++;

                }
            else{//rev=1
                if(map.get(s.charAt(high))>1){
                    rev=false;
                    map.put(s.charAt(high),map.get(s.charAt(high))-1);
                    s = s.substring(0,high) + s.substring(high,s.length()-1);
                    high=s.length()-1;
                }
                else{
                    str +=s.charAt(high);
                    high--;
                }
            }
        }
        return str;

    }

}
