package Strings.School;

public class ImplementStrStr {

    // used for checking if string 2 is present in string1

    public static void main(String[] args) {
        int result = strstr("ababaaaaaa"," abaa");
        System.out.println(result);
    }

    static int strstr(String s, String x)
    {
        if(s.contains(x))
        {
            int len = x.length();
            int n = s.length();

            for(int i=0;i<n-len+1;i++){
                String str = s.substring(i,i+3);
                if(str.equals(x))
                    return i;
            }
        }
        return -1;
    }

}
