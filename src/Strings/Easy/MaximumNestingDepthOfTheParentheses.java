package Strings.Easy;

public class MaximumNestingDepthOfTheParentheses {


    public static void main(String[] args) {

    }

    // working, its mine
    public static int maxDepth(String s) {

        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                count++;
                if(count>max){
                    max = count;
                }

            }
            else if(s.charAt(i)==')'){
                count--;

            }



        }

        return max;
    }


}
