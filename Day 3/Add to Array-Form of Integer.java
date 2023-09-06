// https://leetcode.com/problems/add-to-array-form-of-integer/description/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int len = num.length;
        int carry = 0;
        for (int i=len-1; i>=0; i--){
            num[i] = num[i] + k%10 + carry;
            list.add(num[i]%10);
            carry = num[i]/10;
            k = k/10;
        }
        k = k+carry;
        while(k != 0){
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}