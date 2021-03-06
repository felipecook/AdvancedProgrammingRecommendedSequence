package com.felipecook;

import java.util.LinkedList;
import java.util.List;

/*
* Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at
most one digit (6 becomes 9, and 9 becomes 6).



Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.

Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.

Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.



Constraints:

    1 <= num <= 10^4
    num's digits are 6 or 9.

* */
public class Maximum69Number {

  public static int maximum69Number (int num) {
    int[]digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] == 6) {
        digits[i] = 9;
        StringBuilder finalString = new StringBuilder();
        for (int j = 0; j < digits.length; j++) {
          finalString.append(digits[j]);
        }
        return Integer.parseInt(finalString.toString());
      }

    }
    return num;

  }

  public static void main(String[] args) {
    int test = 669;
    System.out.println(maximum69Number(test));
  }
}
