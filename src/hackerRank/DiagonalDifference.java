package hackerRank;

import java.util.List;

public class DiagonalDifference {



        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here


            int leftToRightDiagonalSum = 0;
            int righttoLeftDiagonalSum = 0;

            int rows = arr.size();
            int columns = arr.get(0).size();

            int i = 0;
            int j =0;
            int k = 0;
            int l = arr.size() -1;

            while(i<rows&&j<columns&&k<rows &&l>=0){

                for(List<Integer> outerArray : arr ){
                    for(Integer innerArray : outerArray){
                       // leftToRightDiagonalSum += arr.get(innerArray)[j];
                       // righttoLeftDiagonalSum += arr[k][l];
                        i+=1;
                        j+=1;
                        k+=1;
                        l-=1;
                    }

                }


            }

            return Math.abs(leftToRightDiagonalSum - righttoLeftDiagonalSum);


        }


}
