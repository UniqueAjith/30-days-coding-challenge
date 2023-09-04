// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int ans = 0;
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            runningSum[i] = ans + nums[i];
            ans = runningSum[i];
        }
        return runningSum;
    }
}