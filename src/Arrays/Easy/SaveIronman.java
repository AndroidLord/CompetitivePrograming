package Arrays.Easy;

public class SaveIronman {
// completed
    public static void main(String[] args) {

        String str = "bb211234";
        boolean result = saveIronman(str);
        System.out.println(result);
    }

    public static boolean saveIronman (String s) {



        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'z' || ch>='1' && ch<='9')
                str.append(ch);

          }
        int size = str.length()/2;

        int front = 0;
        int back = str.length()-1;

        int count = 0;
        while(size!=count){

            String fcheck = String.valueOf(str.charAt(front++));
            String bcheck = String.valueOf(str.charAt(back--));

            if(fcheck.equalsIgnoreCase(bcheck))
                count++;
            else
                break;

        }
        if(size==count)
            return true;

        return false;
    }

}
