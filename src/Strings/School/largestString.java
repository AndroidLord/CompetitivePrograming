package Strings.School;

public class largestString {

    int N = 5;
    String names[] = { "Geek", "Geeks", "Geeksfor",
            "GeeksforGeek", "GeeksforGeeks" };

    // Code for the
    String longest(String names[], int n) {
        int largest = names[0].length();
        int index=0;

        for(int i=1;i<n;i++){
            if(names[i].length()>largest) {
                largest = names[i].length();
                index=i;
            }
        }
        return names[index];
    }











}
