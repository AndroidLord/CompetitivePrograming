package Strings.Easy;

import java.util.HashMap;

public class PangramChecking {

    public static void main(String[] args) {

        String S = "Bawds jog, flick quartz, vex nymph";
        boolean result = checkPangram(S);
        System.out.println(result);
    }

    // Method 1
    public static boolean checkPangram(String str){

        int tLength = str.length();

        if(tLength>=26){

            HashMap<Integer,Character> map = new HashMap<>();
            for(int i=0;i<26;i++){
                int no = 97+i;
                char temp = (char) no;
                map.put(no,temp);
            }

            str = str.toLowerCase();

            int count = 0;
            for(int i=0;i<tLength;i++){
                char cString = str.charAt(i);

                if(cString>96 && cString<123){
                    String check = String.valueOf(map.get(97+count));
                    if(!str.contains(check))
                        return false;
                    count++;
                    if(count==26)
                        return true;
                }

            }
            return true;
        }

        return false;

    }

    // Method 2


}
