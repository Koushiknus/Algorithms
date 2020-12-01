package hackerRank;

import java.util.Arrays;

public class MarkAndToys {
    //https://www.hackerrank.com/challenges/mark-and-toys/problem?h_r=internal-search
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int consolidatedAmount = 0;
        int maxNoOfToys = 0;

        for (int i =0;i<prices.length;i++) {
            consolidatedAmount += prices[i];
            if(consolidatedAmount <= k){
                System.out.println("Keep Continue");
            }else{
                maxNoOfToys = i;
                System.out.println("MaxNoOf toys is "+maxNoOfToys);
                return maxNoOfToys;
            }
        }

        return 0;
    }

    public static void main(String args[]){
        int[] sampleInput = new int[]{90,90,90,51,51};
        int resultReturned = maximumToys(sampleInput,50);
        System.out.println(resultReturned);
    }


}
