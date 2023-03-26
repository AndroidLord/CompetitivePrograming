package Strings.School;

import java.util.HashMap;

public class AnotherMatrixGame {

    public static void main(String[] args) {

        String res = matrixGame("adgkbdhlceilcfjm");
        System.out.println(res);

    }

    static String matrixGame(String S){


        int n = (int)Math.sqrt(S.length());

        char[][] matrix = new char[n][n];
        int count = 0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                matrix[i][j] = S.charAt(count);
                count++;

            }
        }

        HashMap<Character,Integer> map = new HashMap<>();

        count = 0;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(!map.containsKey(matrix[i][j]))
                {
                    map.put(matrix[i][j],1);
                }
                else{
                    map.put(matrix[i][j],0);
                }
            }
        }
        String str = "";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map.get(S.charAt(count))==1){
                    str += S.charAt(count);
                }
                count++;
            }
        }

        return str;

    }

}
