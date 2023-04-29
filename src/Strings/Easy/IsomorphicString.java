package Strings.Easy;

import java.util.HashMap;

public class IsomorphicString {

    public static void main(String[] args) {

        Boolean result = areIsomorphic("pijthbsfy","fvladzpbf");
        System.out.println(result);

    }

    public static boolean areIsomorphic(String str1,String str2)
    {
        int len1,len2;
        len1 = str1.length();
        len2 = str2.length();

        if(len1==len2){

            HashMap<Character,Character> map = new HashMap<>();
            HashMap<Character,Character> revMap = new HashMap<>();

            for(int i=0;i<len1;i++){

                if(!map.containsKey(str1.charAt(i)) &&
                        !revMap.containsKey(str2.charAt(i)))
                {

                    map.put( str1.charAt(i) , str2.charAt(i) );
                    revMap.put( str2.charAt(i) , str1.charAt(i) );


                }
                else
                {
                    char mappedValue = map.get(str1.charAt(i));
                    char checkValue = str2.charAt(i);
                    char revcheckValue = revMap.get(map.get(str1.charAt(i)));

                    if(mappedValue!=checkValue ||
                            revcheckValue!=str1.charAt(i))
                        return false;

                }

            }

        }
        else{
            return false;
        }
        return true;
    }

}
