// Problem :- Given two binary strings a and b, return their sum as a binary string.

// Solution :-

class Solution {
  String addBinary(String a, String b) {
    StringBuffer result = StringBuffer();
    int carry = 0;
    int i = a.length - 1;
    int j = b.length - 1;

    while (i >= 0 || j >= 0) {
        int sum = carry;

        if (i >= 0) {
        sum += int.parse(a[i]) - 0;
        i--;
        }

        if (j >= 0) {
        sum += int.parse(b[j]) - 0;
        j--;
        }

        result.write(sum % 2);
        carry = sum ~/ 2;
    }

    if (carry > 0) {
        result.write(carry);
    }

    return result.toString().split('').reversed.join();
 }
}
