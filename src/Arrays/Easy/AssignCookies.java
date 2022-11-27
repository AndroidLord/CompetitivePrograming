package Arrays.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/description/
public class AssignCookies {

    // working, by me
    public int findContentChildren(int[] children, int[] cookie) {

        int n = children.length;
        int m = cookie.length;
        int satisfy = 0;

        Arrays.sort(children);
        Arrays.sort(cookie);

        if(n>m){
            n = m;
        }

        int i = 0, j = 0;

        while(i<n && j<m){
            if(children[i]<=cookie[j])
            {
                i++;j++;
                satisfy++;
            }
            else if(children[i]>cookie[j]){
                j++;
            }
        }
        return satisfy;
    }

}
