/* You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.*/

// Solution :-

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a = jewels.length();
        int b = stones.length();
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }  
            }
        }
        return count;
    }
}
