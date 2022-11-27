package Strings.School;

public class Check_ifTheyAreSame {

    // this checks eg- "gggg" is made up of only g or any other
    // if anyother than it returns false

    class Sol
    {
        Boolean check (String s)
        {
            char check = s.charAt(0);
            int count =1;
            for(int i=1;i<s.length();i++){

                if(s.charAt(i)==check)
                    count++;
            }

            if(count==s.length())
                return true;

            return false;
        }
    }

}
