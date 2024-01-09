package Strings.Medium;

public class LongestCommanSubstring {


    public static void main(String[] args) {
        String S1 = "ABCDGH", S2 = "ACDGHR";

        int n = 6, m = 6;

        int res = longestCommonSubstr(S1,S2,n,m);

        System.out.println(res);
    }

    // Not Working
    static int longestCommonSubstr10(String s, String str, int n, int m){

        int mcount = 0;
        int count = 0;
        int base=0,end=1;

        for(int i=0;i<n-1;i++){

            String sub = s.substring(base,i+1);

            if(str.contains(sub)){
                count++;

                if(count>mcount){
                    mcount = count;
                }

            }
            else{
                count = 0;
                base++;

                String sub2 = s.substring(base,i+1);
                if(str.contains(sub2)){
                    count = mcount-1;
                }

            }

        }
        return mcount;
    }

    // Best Solution, not mine
    static  int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        int max=0;
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                char c1=S1.charAt(i-1);
                char c2=S2.charAt(j-1);
                if(c1!=c2){
                    dp[i][j]=0;
                }
                else
                    dp[i][j]=dp[i-1][j-1]+1;
                if(max<dp[i][j]){
                    max=dp[i][j];
                }
            }
        }
        return max;
    }

    // Working, mine, worst case but works for all case
    int longestCommonSubstr2(String s, String str, int n, int m){

        // int mcount = 0;
        // int count = 0;
        // int base=0;

        // for(int i=0;i<n-1;i++){

        //     String sub = s.substring(base,i+1);

        //     if(str.contains(sub)){
        //         count++;

        //         if(count>mcount){
        //             mcount = count;
        //         }

        //     }
        //     else{
        //         count = 0;
        //         base++;

        //         String sub2 = s.substring(base,i+1);
        //         if(str.contains(sub2)){
        //             count = mcount-1;
        //         }

        //     }

        // }
        // return mcount;

        int count = 0;

        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){

                String res = s.substring(i,j+1);
                int cnt = j+1-i;
                if( str.contains(res) ){

                    if(cnt>count){
                        count = cnt;
                    }

                }

            }

        }
        return count;

    }

}
