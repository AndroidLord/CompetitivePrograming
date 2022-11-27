package Strings.Easy;

public class ParanthesisChecker {

    static String Symbol = "{([])}";

     boolean ispar(String x)
    {
        int check = x.length();
        int i = 0;
        int last = check -1;
        char[] str = x.toCharArray();

        if(check%2==0){
            while(i<(check/2)){
                if(str[i]==str[last]){
                    last--;
                    if(i==(check/2)-1){
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

}
