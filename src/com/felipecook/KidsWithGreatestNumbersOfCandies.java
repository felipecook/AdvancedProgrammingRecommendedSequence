package com.felipecook;
import java.util.ArrayList;
import java.util.List;


/*

Given the array candies and the integer extraCandies, where candies[i]
represents the number of candies that the ith kid has.
For each kid check if there is a way to distribute
extraCandies among the kids such that he or she can have
the greatest number of candies among them. Notice that multiple
kids can have the greatest number of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation:
Kid 1 has 2 candies and if he or she receives all extra candies
(3) will have 5 candies --- the greatest number of candies among the kids.

Kid 2 has 3 candies and if he or she receives at least 2 extra
candies will have the greatest number of candies among the kids.

Kid 3 has 5 candies and this is already the greatest number of
candies among the kids.

Kid 4 has 1 candy and even if he or she receives all extra
candies will only have 4 candies.

Kid 5 has 3 candies and if he or she receives at least 2
extra candies will have the greatest number of candies among the kids.

Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy,
therefore only kid 1 will have the greatest number of candies
among the kids regardless of who takes the extra candy.

Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]



*/



public class KidsWithGreatestNumbersOfCandies {
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
    List<Boolean> doTheyHaveMostCandy = new ArrayList<>();
    int mostCandies = highestNumberOfCandies(candies);

    for (int i = 0; i < candies.length; i++) {
      if ((candies[i] + extraCandies) >= mostCandies){
        doTheyHaveMostCandy.add(Boolean.TRUE);
      }
      else {
        doTheyHaveMostCandy.add(Boolean.FALSE);
      }
    }
    return doTheyHaveMostCandy;
  }

  private static int highestNumberOfCandies(int[] candies){
    int maxNumber = 0;
    for (int i = 0; i < candies.length; i++){
      if (candies[i] > maxNumber){
        maxNumber = candies[i];
      }
    }
    return maxNumber;
  }





}























/*
* List<Boolean> canTheyHaveMostCandy = new ArrayList<>();
    int mostCandy = highestCandyAmount(candies);
    for (int i = 0; i < candies.length; i++) {
      if ((candies[i] + extraCandies) >= mostCandy){
        canTheyHaveMostCandy.add(Boolean.TRUE);
      }
      else{
        canTheyHaveMostCandy.add(Boolean.FALSE);
      }

    }
    return canTheyHaveMostCandy;
*
*
*
* private static int highestCandyAmount(int[] candies){
    int highestAmount = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > highestAmount){
        highestAmount = candies[i];
      }
    }
    return highestAmount;
  }
  *
  * public static void main(String[] args) {
    int[] testCandiesArray = new int[]{1, 3, 1, 5, 6};
    int extraCandies = 3;

    List<Boolean> returnList = kidsWithCandies(testCandiesArray, extraCandies);

    for (int i = 0; i < returnList.size(); i++) {
      System.out.println(returnList.get(i));
    }
  }
* */
