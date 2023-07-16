// Question: Given an integer x, return true if x is a palindrome, and false otherwise.

// Solution:

class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int temp = x;

        if (x < 0) 
            return false;
        while(temp != 0){  
            int remainder = temp % 10;  
            reverse = reverse * 10 + remainder;  
            temp = temp/10;  
        }  
        return reverse == x;
    }
}




 
