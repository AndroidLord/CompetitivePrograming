package Contest;

public class AppendCharactersToMakeSubsequence {

    public static void main(String[] args) {
        String s = "coaching", t = "coding";

        int result = appendCharacters(s,t);
        System.out.println(result);
    }

    public static int appendCharacters(String s, String t) {

        char[] charr = t.toCharArray();
        int count = 0;
        boolean out = false;
        int i=0;
        for (char check:charr){

            while(i<s.length()){

                char tsub = s.charAt(i);
                if(check==tsub){
                    count++;i++;
                    break;
                }
                else {
                    if (count!=0){

                        out = true;
                        break;
                    }
                }
                i++;

            }
            if(out==true)
                break;

        }

        if(count!=charr.length){
            String result = s+ t.substring(count,t.length());
            return t.length()-count;
        }

        return 0;
    }

}
