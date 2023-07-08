package Strings.Basic;

public class ExtractMaximum {


    static int extractMaximum(String S)
    {
        int max = -1;

        int count = 0;
        int temp = 0;

        for(int i=0;i<S.length();i++){

            if(S.charAt(i)>='0' && S.charAt(i)<='9'){

                int no = S.charAt(i)-'0';

                if(count>0){
                    temp = temp*10 + no;
                }else{
                    temp = no;
                }
                if(temp>max){
                    max = temp;
                }
                count++;

            }
            else{
                count = 0;
            }

        }



        return max;
    }

}
