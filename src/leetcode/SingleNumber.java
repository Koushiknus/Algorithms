package leetcode;

import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> numSet = new HashMap<>();

        for(int i =0;i<nums.length;i++){

            if(numSet.containsKey(nums[i])){
                numSet.remove(nums[i]);
            }else{
                numSet.put(nums[i],nums[i]);
            }
        }
        System.out.println("Final Set"+numSet.size());
        int remainingValue = 0 ;
        for (int value : numSet.values() ){
            remainingValue = value;
        }
        return remainingValue;

    }

    public static void main(String args[]){
        int[] nums = {1};
        int result = singleNumber(nums);
        System.out.println(result);
    }


}
