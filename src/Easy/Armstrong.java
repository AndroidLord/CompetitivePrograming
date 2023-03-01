package Easy;

public class Armstrong {

    public static void main(String[] args) {
        String result = armstrongNumber(153);
        System.out.println(result);
    }

    static String armstrongNumber(int n){

        int sum = 0,original = n;
        for(int i=0;i<String.valueOf(original).length();i++){
            int temp = n%10;
            sum = sum + (temp*temp*temp);
            n = n/10;
        }
        if(sum==original)
            return "Yes";

        return "No";
    }

}
