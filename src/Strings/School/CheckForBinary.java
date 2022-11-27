package Strings.School;

public class CheckForBinary {

    public static void main(String[] args) {
        String str = "0111100110101100";
        boolean result =isBinary(str);
        System.out.println(result);
    }

    static boolean isBinary(String str)
    {
        for(int i=0;i<str.length();i++){

            char temp = str.charAt(i);
            if(temp=='1' || temp=='0'){
                continue;
            }
            return false;
        }
        return true;
    }

}
