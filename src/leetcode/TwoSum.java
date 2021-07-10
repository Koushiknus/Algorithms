package leetcode;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums,int target){

        int result[] = new int[nums.length] ;
        Arrays.sort(nums);
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]+ nums[i+1] == target){
                result[i] = i;
                result[i+1] = i+1;
            }
        }
        return result;
    }

    public static void main(String args[]){

       int nums[] = new int[]{3,3};

        int result[] = twoSum(nums,6);
        System.out.println("Result is "+result[0] + result[1]);
    }
}
