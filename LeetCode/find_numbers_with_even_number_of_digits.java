// Find Numbers with Even Number of Digits [Easy]
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i : nums){
            String s = String.valueOf(i);
            int n = s.length();
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}