package com.felipecook;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumbersOfCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
    List<Boolean> canTheyHaveMostCandy = new ArrayList<>();
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
  }

  private int highestCandyAmount(int[] candies){
    int highestAmount = 0;
    for (int i = 0; i < candies.length; i++) {
      if (candies[i] > highestAmount){
        highestAmount = candies[i];
      }
    }
    return highestAmount;
  }
}
