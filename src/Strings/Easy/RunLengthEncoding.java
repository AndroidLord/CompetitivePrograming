package Strings.Easy;

public class RunLengthEncoding {

    public static void main(String[] args) {

        String str = "aaaabbbccc";

        String result = encode(str);
        System.out.println(result);


    }

    static String encode(String str)
    {

        String ans = "";

        int count = 0;
        char ch = str.charAt(0);

        for(int i=0;i<=str.length();i++){

            if(i==str.length()){


                ans+=Character.toString(ch)+count;
                break;
            }

            char cur = str.charAt(i);

            if(cur==ch){
                count++;
            }
            else{
                ans+=Character.toString(ch)+count;
                ch = cur;
                count=1;
            }

        }
        return ans;
    }

}
