// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}