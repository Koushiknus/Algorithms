package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {

        Arrays.sort(contests,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return -1*Integer.compare(a[0],b[0]);
            }
        });

        //Incrementer to calculate MAX luck
        int luck_balance = 0;

        for(int i=0; i<contests.length;i++){

            int luck  = contests[i][0];
            int importance = contests[i][1];
            // Am losing here so my balance is retained
            if(importance ==1 && k>0){
                k--;
                luck_balance += luck;
            }
            // Am not able to lose anymore so my luck balance is decreasing
            else if(importance ==1 && k==0){
                luck_balance -= luck;
            }
            //Its not important so am going to lose , my luck balance goes up
            else if(importance == 0)
            {
                luck_balance += luck;
            }

            System.out.print("Luck is");
            System.out.println(luck);
            System.out.print("Importance is");
            System.out.println(importance);
        }

        return luck_balance;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
