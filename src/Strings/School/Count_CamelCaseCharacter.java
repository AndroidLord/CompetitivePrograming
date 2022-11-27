package Strings.School;

public class Count_CamelCaseCharacter {

    static String S = "ckjkUUYII";

    //Method 1
    int countCamelCase1(String s)
    {
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }

    // Method2 - There are two more method to do this, that are not done by me afcourse

        int countCamelCase2(String s)
        {
            int count=0;
            String a=s.toLowerCase();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!=a.charAt(i))
                    count++;
            }
            return count;
        }


    // Method 3
    int countCamelCase3(String s)
    {
        int count=0;
        String a=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }


}

