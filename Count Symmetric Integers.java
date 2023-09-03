/*
Problem-1 :- ---Leetcode Weekly Contest 361---
You are given two positive integers low and high.
An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.
Return the number of symmetric integers in the range [low, high].
*/

// Solution:-
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            String str = Integer.toString(num);
            int n = str.length();
            if (n % 2 == 1) {
                continue;
            }
            int sum1 = 0;
            int sum2 = 0;
            
            for (int i = 0; i < n / 2; i++) {
                sum1 = sum1 + Character.getNumericValue(str.charAt(i));
                sum2 = sum2 + Character.getNumericValue(str.charAt(n - i - 1));
            }    
            if (sum1 == sum2) {
                count++;
            }
        }
        return count;
    }
}
