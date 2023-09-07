// https://leetcode.com/problems/create-target-array-in-the-given-order/description/


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i=0; i<target.length; i++){
            for (int j=target.length - 1; j > index[i]; j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}