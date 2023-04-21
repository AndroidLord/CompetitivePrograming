package Strings.Easy;

public class ExtractTheNumberFromString {

    public static void main(String[] args) {

        String sentence="This is alpha 9057";

        long result = ExtractNumber(sentence);
        
        System.out.println("Extracted No. "+result);

    }

    // Exceed the time limits
    static long ExtractNumber(String s){

        String res = "";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>46 && s.charAt(i)<58){
                boolean leave = false;
                String tempResult = "";
                while(s.charAt(i)!=' '){

                    if(s.charAt(i)=='9')
                    leave = true;


                    tempResult += s.charAt(i);
                    i++;

                    if(i==s.length())
                        break;
                }

                if(leave)
                    continue;

                if(res.equals(""))
                    res = tempResult;
                else
                {
                    long nres = Long.parseLong(res);
                    long ntres = Long.parseLong(tempResult);

                    if(ntres>nres)
                    {
                        nres = ntres;
                        res = String.valueOf(nres);
                    }
                    else
                        res = String.valueOf(nres);

                }

            }

        }

        if(res.equals(""))
            return -1;

        return Long.parseLong(res);
    }

    static long ExtractNumber2(String s){

        int stringLength = s.length();
        String res = "",tempRes = "";
        boolean leave = false;

        for(int i=0;i<stringLength;i++){
            char current = s.charAt(i);
            if(current>46 && current<58){
                tempRes = tempRes + current;

                if(current=='9')
                    leave = true;

                // checking for last, if digit is there
                if(i==stringLength-1){
                    if(leave)//leave is true
                    {
                        if(res.equals(""))
                            return -1;

                        return Long.parseLong(res);
                    }
                    else
                    {
                        long secNum = Long.parseLong(tempRes);
                        if(res.equals(""))
                        {
                            if(leave)
                            return -1;

                            else
                            return secNum;
                        }
                        long firstNum = Long.parseLong(res);
                        if(secNum>firstNum)
                            return secNum;
                        else
                            return firstNum;
                    }
                }

            }
            else if(current==' '){

                if(leave==false) {
                    if(res.equals(""))
                        res = tempRes;
                    else
                    {
                        long secNum = Long.parseLong(tempRes);
                        long firstNum = Long.parseLong(res);

                        if(secNum>firstNum)
                            res = tempRes;

                    }
                    tempRes = "";
                }

                leave = false;
            }

        }

        if(res.equals(""))
            return -1;
        return Long.parseLong(res);
    }

}
