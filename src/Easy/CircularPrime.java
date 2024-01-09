package Easy;

public class CircularPrime {

    public static void main(String[] args) {
        int res = isCircularPrime(197);
        System.out.println(res);
    }

    public static int isCircularPrime(int n) {
        int original = n;

        int len = String.valueOf(n).length();
        int zero = 1;

        for (int i = 0; i < len - 1; i++) {
            zero *= 10;
        }

        for (int i = 0; i < len; i++) {

            int temp = n % 10;
            n = n / 10;
            temp = temp * zero;
            temp += n;
            n = temp;

            if (!isPrime(n))
                return 0;


        }


        return 1;
    }

    static boolean isPrime(int check) {

        if (check < 2)
            return false;

        if (check == 2 || check == 3 || check == 5)
            return true;

        for (int i = 2; i <= Math.sqrt(check); i++) {
            if (check % i == 0)
                return false;
        }

        return true;
    }




}
