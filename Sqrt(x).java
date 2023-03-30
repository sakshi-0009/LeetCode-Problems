// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// Solution :-

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) 
        return x;
        long i = 1;
        long sq = i * i;
        while (x >= sq) {
            i++;
            sq = i * i;
        }
        return (int) (i - 1);
    }
}
