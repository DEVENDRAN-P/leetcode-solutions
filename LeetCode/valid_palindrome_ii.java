// Valid Palindrome II [Easy]
// https://leetcode.com/problems/valid-palindrome-ii/

class Solution {
    public static boolean isPalindrome(int left,int right , String s){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int n = s.length();
        int right = n-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else {
                return isPalindrome(left+1,right,s) || isPalindrome(left,right-1,s);
            }
        }
        return true;
    }
}