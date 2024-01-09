package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SnakeAndLadder {

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> board = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){

            ArrayList<String> row = new ArrayList<>();

            for(int j=0;j<9;j++){

                row.add(sc.next());

            }
            row.add(sc.nextLine());
            Collections.sort(row,Collections.reverseOrder());
            board.add(row);
        }

        ArrayList<Integer> dice_input = new ArrayList<>();

        String val="";

        while((val=sc.next())!=null){
            dice_input.add(Integer.parseInt(val));
        }

        sc.close();

        int r=9,c=0,cur=0;
        for(int i=0;i<dice_input.size();i++){

           int step = dice_input.get(i);

           if(c+step>9){
               r++;
           }
           else{
               c+=step;
           }


            String cur_block = board.get(r).get(c);
           if(cur_block.charAt(0)=='S'){

            String no = cur_block.substring(cur_block.indexOf('('),cur_block.indexOf(')')+1);

            if(no.length()==1){

            }
            else if (no.length()==2){

            }
            else{
                // Answer
            }

           }
           else if (board.get(r).get(c).charAt(0)=='L'){

           }
           else{

           }

        }

    }


}
