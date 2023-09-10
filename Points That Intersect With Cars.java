/* Problem :-
You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. 
For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.
Return the number of integer points on the line that are covered with any part of a car.
*/

// Solution :-

public class Solution {

    public int numberOfPoints(List<List<Integer>> nums) {
        int n = nums.size();
        int[] hash = new int[110];
        
        for(List<Integer> num: nums){
            hash[num.get(0)]++;
            hash[num.get(1) + 1]--;
        }
        
        int ans = 0;
        for(int i=1;i<hash.length;i++){
            hash[i] += hash[i-1];
            if(hash[i] > 0)
                ans++;
        }
        
        return ans;
  }
}

