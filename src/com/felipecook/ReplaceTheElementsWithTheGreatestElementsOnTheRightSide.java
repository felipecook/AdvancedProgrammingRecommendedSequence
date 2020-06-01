package com.felipecook;

import java.util.ArrayList;

/*
Given an array arr, replace every element in that array with the
greatest element among the elements to its right, and replace the
last element with -1.

After doing so, return the array.



Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]



Constraints:

    1 <= arr.length <= 10^4
    1 <= arr[i] <= 10^5

* */
public class ReplaceTheElementsWithTheGreatestElementsOnTheRightSide {

  public static int[] replaceElements(int[] arr) {
    int[] replacedElements = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int currentMaxInt = 0;
      for (int j = i + 1; j < arr.length; j++) {
        if(arr[j] > currentMaxInt){
          currentMaxInt = arr[j];
        }
      }

      replacedElements[i] = currentMaxInt;
    }
    replacedElements[arr.length - 1] = -1;
    return replacedElements;
  }

  public static void main(String[] args) {
    int[] testData = new int[]{17, 18, 5, 6, 1};
    int[] returnData = replaceElements(testData);
    for (int a: returnData
    ) {
      System.out.println(a);
    }
  }
}
