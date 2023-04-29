package Strings.Basic;

public class Modify {

    public static void main(String[] args) {

    }

    // working, mine
    String modify(String s){

        int n = s.length();
        String str = String.valueOf(s.charAt(0));

        for(int i=1;i<n;i++){

            if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
                // first letter being capital
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    str +=s.charAt(i);
                }
                else{
                    int diff = s.charAt(i) - 'a';
                    str += (char)('A' + (char)diff);
                }

            }
            else{

                // second letter being capital
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    str +=s.charAt(i);
                }
                else{
                    int diff = s.charAt(i) - 'A';
                    str += (char)('a' + (char)diff);
                }


            }

        }return str;
    }


    // working, not mine
    String modify2(String s){
        String str = "";
        char ch = s.charAt(0);
        if(Character.isLowerCase(ch)){
            str = s.toLowerCase();
        }else{
            str = s.toUpperCase();
        }
        return str;
    }


    String modify3(String s){
        char ch=s.charAt(0);
        return (Character.isLowerCase(ch))?s.toLowerCase():s.toUpperCase();
    }
}
