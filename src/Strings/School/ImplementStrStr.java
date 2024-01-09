package Strings.School;

public class ImplementStrStr {

    // used for checking if string 2 is present in string1

    public static void main(String[] args) {
        int result = strstr("abcabcabcd","abcd");
        System.out.println(result);
    }

    static int strstr1(String s, String x)
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

    static int strstr2(String s, String x)
    {
        int len = x.length();
        int strlen = s.length();

        if(len>strlen)
        {
            return -1;
        }

        for(int i=0;i<=strlen-len;i++){
            String st = s.substring(i,i+len);
            if(x.contains(st))
            {
                return i;
            }
        }
        return -1;
    }


    static int strstr(String s, String x)
    {
        int n = s.length()
                , m = x.length();

        for(int i=0;i<n-m+1;i++){

            String ts = s.substring(i,i+m);

            if(ts.equals(x)){

                return i;

            }

        }
        return -1;

    }
}
