package Strings.Medium;

public class ValidCompressionString {


    public static void main(String[] args) {

       String S = "GEEKSFORGEEKk",
        T = "G7G3S";

      int res = checkCompressed(S,T);

        System.out.println(res);

    }
    static int checkCompressed(String s, String t) {

        int count = 0;

        for(int i=0;i<t.length();i++){

            char cur = t.charAt(i);

            if(cur>='A' && cur<='Z'){

                char check = s.charAt(count);
                if(check!=cur){
                    return 0;
                }

                continue;
            }
            int no=cur-'0';

            while(i<t.length() &&
                    t.charAt(i+1)>='0' &&
                    t.charAt(i+1)<='9'){
                i++;

                no = no*10;
                no = no + t.charAt(i) -'0';

            }

            count += no+1;
        }
        return 1;
    }

}
