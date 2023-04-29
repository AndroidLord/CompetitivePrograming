package Strings.Basic;

public class PenalityShootout {

    public static void main(String[] args) {



    }

    public int penaltyScore(String S)
    {
        int pgoal = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='2'){

                if(i+1!=S.length() && S.charAt(i+1)=='1'){
                    pgoal++;
                    i++;
                }
            }
        }
        return pgoal;
    }

}
