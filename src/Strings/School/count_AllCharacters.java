package Strings.School;

public class count_AllCharacters {

    static String name = "#GeeKs01fOr@gEEks07";

    class Sol
    {
        int[] count (String s)
        {
            int count_Lower=0,count_Upper=0,count_num=0,count_special=0;

            char ch = 'a';
            char ch2 = 'z';

            char ch3='A';
            char ch4='Z';

            char[] s3 = {'0','1','2','3','4','5','6','7','8','9'};

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>=(int)ch && s.charAt(i)<=(int)ch2)
                    count_Lower++;

                if(s.charAt(i)>=(int)ch3 && s.charAt(i)<=(int)ch4)
                    count_Upper++;

                int j=0;

                while(j<10){
                    if(s.charAt(i)==s3[j])
                    {
                        count_num++;
                        break;
                    }
                    j++;
                }




            }

            count_special = s.length()-count_Lower-count_Upper-count_num;
            int[] temp = {count_Upper,count_Lower,count_num,count_special};
            return temp;

        }
    }

}
