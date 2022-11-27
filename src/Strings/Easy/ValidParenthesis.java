package Strings.Easy;

import java.util.HashMap;

public class ValidParenthesis {

    public static void main(String[] args) {

        String s = "()[]{}";
        boolean res = isValid(s);
        System.out.println(res);
    }

    public static boolean isValid(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);

            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);

            if (s.charAt(i) == '}') {
                if (!map.containsKey('{')) {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (!map.containsKey('[')) {
                    return false;
                }
            }

            if (s.charAt(i) == ')') {
                if (!map.containsKey('(')) {
                    return false;
                }
            }

        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                if(map.containsKey('}')){
                    int first = map.get('{');
                    int second = map.get('}');
                    if(first!=second)return false;
                }
                else return false;
            }
            else if(s.charAt(i)=='('){
                if(map.containsKey(')')){
                    int first = map.get('(');
                    int second = map.get(')');
                    if(first!=second)return false;
                }
                else return false;
            }
            else if(s.charAt(i)=='['){
                if(map.containsKey(']')){
                    int first = map.get('[');
                    int second = map.get(']');
                    if(first!=second)return false;
                }
                else return false;
            }
        }

        return true;
    }

}
