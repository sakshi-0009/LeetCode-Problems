// problem :- Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

// Solution :-

class Solution {
  int countKDifference(List<int> nums, int k) {
    int count = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if ((nums[i] - nums[j]).abs() == k) {
          count++;
        }
      }
    }
    return count;
  }
}
