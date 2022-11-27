package Medium;
// Question was from Hacker rank, Java Certification though
public class TypeCalculator {
// it needs debugging, a lot of it!!
    // incomplete
    public static void main(String[] args) {

        String s = "give me 10 dollars";
        typeCounter(s);

    }
    public static void typeCounter(String sentence) {

        int string = 0;
        int integer = 0;
        int doubble = 0;


        for(int i=0;i<sentence.length();i++){
            char var = sentence.charAt(i);

            if(var>='a' && var<='z'){
                string++;
                while(sentence.charAt(i)!=' ' ) {
                    if(i==sentence.length()-1)
                        break;
                    i++;

                }
                continue;
            }

            if(var>=0 || var<=9)
            {
                if(sentence.charAt(i+1) != '.' &&
                        sentence.charAt(i-1) != '.'){

                    integer++;
                    while(sentence.charAt(i)!=' '){
                        if(i==sentence.length()-1)
                            break;
                        i++;
                    }
                    continue;
                }
            }

            if(var == '.')
                doubble++;

        }
        System.out.println(string);
        System.out.println(integer);
        System.out.println(doubble);
        return;
    }

}
