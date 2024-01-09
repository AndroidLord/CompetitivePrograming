package Techniques;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5,1,1,1};

        System.out.println(timeRequiredToBuy(arr,0));

    }

    public static int timeRequiredToBuy2(int[] tickets, int k) {

        int count=0;

        int n = tickets.length;
        int i=0;
        while(tickets[k]!=0){



            if(i<n && tickets[i]>0)
                count++;
            tickets[i++]--;
            if(i>=n)
                i=0;

        }
        return count;
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i = 0;i<tickets.length;i++){
            if(i <= k){
                time += Math.min(tickets[k],tickets[i]);
            }else{
                time+= Math.min(tickets[k] - 1,tickets[i]);
            }
        }
        return time;
    }


}


