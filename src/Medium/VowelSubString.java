package Medium;
// HackerRank
public class VowelSubString {
// incomplete

    public static void main(String[] args) {
//        String s = "qwdftr";
//        int n = 2;
//
//        String result = findSubstring(s,n);
//        System.out.println(result);

//        int mask = 0x000F;
//        int value =0x2222;
//        System.out.println(mask & value);

        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        }
        catch (NumberFormatException e){
            System.out.println("bad number");
        }
    }

    public static String findSubstring(String s, int k) {
        // Write your code here

        int size = s.length();
        int vCount = 0;
        String result = "";

        String kSubString;
        for (int i=0;i<k;i++){
            kSubString = s.substring(i,i+k);

            int tvCount = 0;


                char checker = s.charAt(i);

                if(checker=='a' || checker=='e' || checker=='i' ||
                        checker=='o' || checker=='u'){
                    tvCount++;
                }
                if (tvCount>vCount && i==k-1){
                    vCount = tvCount;
                    result = kSubString;
                }


        }

        for (int i=k;i<size-k+1;i++){
            char checker = s.charAt(i);

            if(checker=='a' || checker=='e' || checker=='i' ||
               checker=='o' || checker=='u')
            {

            }
        }

        if(!result.equals("")){
            return result;
        }

        return "Not found";
    }

    public static String findSubstring2(String s, int k) {
        // Write your code here

        int size = s.length();
        int vCount = 0;
        String result = "";

        for (int i=0;i<size-k+1;i++){
            String kSubString = s.substring(i,i+k);

            int tvCount = 0;
            for(int j=i;j<i+k;j++){

            char checker = s.charAt(j);

            if(checker=='a' || checker=='e' || checker=='i' ||
               checker=='o' || checker=='u'){
                tvCount++;
            }
            if (tvCount>vCount && j==i+k-1){
                vCount = tvCount;
                result = kSubString;
            }

            }
        }
        if(!result.equals("")){
            return result;
        }

        return "Not found";
    }

}
