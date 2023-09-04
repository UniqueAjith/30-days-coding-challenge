// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i =0; i < accounts.length; i++){
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++){
                temp += accounts[i][j];
            }
            sum = Math.max(sum,temp);
        }
        return sum;
    }
}