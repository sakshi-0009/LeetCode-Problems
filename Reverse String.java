// Question :- Write a function that reverses a string. The input string is given as an array of characters s.

// Solution :-

class Solution {
    public void reverseString(char[] s) {
int b = 0, k = s.length- 1 ;
char temp;

    while(b<=k){
        temp = s[b];
        s[b] = s[k];
        s[k] = temp;
        ++b;
        --k;
    }
    System.out.println(Arrays.toString(s));
}
}
