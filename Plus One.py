''' You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.'''

# Solution :-

class Solution:
  def plusOne(self, digits):  
    return [int(x) 
    for x in str(int(''.join([str(x) for x in digits])) + 1)]
