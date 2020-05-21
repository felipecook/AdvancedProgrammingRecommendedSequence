package com.felipecook;

/*
* Given an integer number n, return the difference
* between the product of its digits and the sum of its digits.

Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15

Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21



Constraints:

    1 <= n <= 10^5

* */

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

  public static int subtractProductAndSum(int n) {
    int difference = 0;
    int sum = 0;
    int product = 1;

    int valueOfN = n;
    while (valueOfN > 0){
      int singleDigit = valueOfN % 10;
      product *= singleDigit;
      valueOfN /= 10;
    }
    valueOfN = n;
    while (valueOfN > 0){
      sum += valueOfN % 10;
      valueOfN /= 10;
    }
    difference = product - sum;
    return difference;
  }

  public static void main(String[] args) {
    int testData = 4421;
    int result = subtractProductAndSum(testData);
    System.out.println(result);

  }
}
