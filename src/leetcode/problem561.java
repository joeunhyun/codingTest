package leetcode;

import java.util.Arrays;

public class problem561 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(String.valueOf(arrayPairSum(nums)));
    }

    public static int arrayPairSum(int[] nums) {
        int answer = 0 ;
        
        Arrays.sort(nums); //오름차순 정렬
        
        for(int i = 0 ; i < nums.length-1 ; i=i+2){
            answer += Math.min(nums[i], nums[i+1]);
        }

        return answer;
    }
}
