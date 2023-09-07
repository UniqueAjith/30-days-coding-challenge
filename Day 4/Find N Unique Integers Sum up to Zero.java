// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        int half = n/2;
        for (int negative = -1 * half; negative < 0; negative++){
            result[index++] = negative;
        }
        if (n%2 != 0){
            result[index++] = 0;
        }
        for (int positive = 1; positive <= half; positive++){
            result[index++] = positive;
        }
        return result;
    }
}