package Strings.Basic;

public class SubstringsWithSameFirstAndLastCharacters {

    public static void main(String[] args) {

        String s = "aaaa";

        int result = countSubstringWithEqualEnds2(s);

        System.out.println(result);

    }


    static int countSubstringWithEqualEnds(String s) {


        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            int number = 0;
            number = ch - 'a';
            arr[number]++;

        }

        int count = 0;

        for(int i=0;i<26;i++){

            if(arr[i]>0)
            if(arr[i]%2==0){
                count += arr[i] + 1;
            }
            else{
                count += arr[i];
            }

        }
        return count;
    }

    static int countSubstringWithEqualEnds2(String s) {


        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            int number = 0;
            number = ch - 'a';
            arr[number]++;

        }

        int count = 0;

        for(int i=0;i<26;i++){



            if(arr[i]>0){

                int n = arr[i];

                if(n==1){
                    count += n;
                }
                else{
                    int com = (n*(n+1))/2;
                    count = count +  com;
                }

            }

        }
        return count;
    }

}
