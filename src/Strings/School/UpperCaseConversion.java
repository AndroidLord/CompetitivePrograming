package Strings.School;
import java.lang.*;

public class UpperCaseConversion {

    static String name = "i love programming";

    public String transform(String s)
    {

      char[] temp = new char[s.length()];

      temp[0] = Character.toUpperCase(s.charAt(0));

        for(int i=1;i<s.length();i++){
            String t1 = String.valueOf(s.charAt(i));
            temp[i] = s.charAt(i);
            if(t1.equals(" ")){
                i++;
                temp[i] = Character.toUpperCase(s.charAt(i));

            }
        }

        return new String(temp);
    }

}
