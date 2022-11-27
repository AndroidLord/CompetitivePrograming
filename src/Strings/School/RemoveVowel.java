package Strings.School;

public class RemoveVowel {

    // Remove the vowel, within the time constraint

    String name = "Shubham";

    String removeVowels(String S) {
        // code here
        String str = "";

        for(int i=0;i<S.length();i++){
            char temp = S.charAt(i);
            if(temp=='a' ||
                    temp=='e' ||
                    temp=='i' ||
                    temp=='o' ||
                    temp=='u')
                continue;

            str +=temp;
        }
        return str;
    }

    void demo(String S){

    }



}
