/* You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair.
In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
Return the number of '*' in s, excluding the '*' between each pair of '|'.
Note that each '|' will belong to exactly one pair. */

// Solution :-

class Solution {
    public int countAsterisks(String s) {
        int count = 0;
         boolean insidePair = false;

        for (char c : s.toCharArray()) {
            if (c == '*' && !insidePair) {
                count++;
            } else if (c == '|') {
                insidePair = !insidePair;
            }
        }

        return count;
    }
}
