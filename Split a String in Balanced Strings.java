/* Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.*/

// Solution :-

class Solution {
    public int balancedStringSplit(String s) {
        int n = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                n++;
            }
            else{
                n--;
            }
            if(n == 0){
                count++;
            }
        }
        return count;
    }
}
