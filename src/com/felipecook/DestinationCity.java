package com.felipecook;


/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".

Example 3:

Input: paths = [["A","Z"]]
Output: "Z"



Constraints:

    1 <= paths.length <= 100
    paths[i].length == 2
    1 <= cityAi.length, cityBi.length <= 10
    cityAi != cityBi
    All strings consist of lowercase and uppercase English letters and the space character.



* */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DestinationCity {

  public static String destCity(List<List<String>> paths) {
    List<String> outboundFlights = new LinkedList<>();
    List<String> inboundFlights = new LinkedList<>();
    for (int i = 0; i < paths.size(); i++) {
      List<String> individualPieceOfPathsList = paths.get(i);
      String outgoingFlight = individualPieceOfPathsList.get(0);
      String incomingFlight = individualPieceOfPathsList.get(1);
      outboundFlights.add(outgoingFlight);
      inboundFlights.add(incomingFlight);
    }
    for (int i = 0; i < inboundFlights.size(); i++) {
      String incomingFlight = inboundFlights.get(i);
      if (!outboundFlights.contains(incomingFlight)){
        return incomingFlight;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    List<List<String>> testList = new LinkedList<>();
    List<String> testIndividualElementsToList1 = new LinkedList<>();
    testIndividualElementsToList1.add("B");
    testIndividualElementsToList1.add("C");
    List<String> testIndividualElementsToList2 = new LinkedList<>();
    testIndividualElementsToList2.add("D");
    testIndividualElementsToList2.add("B");
    List<String> testIndividualElementsToList3 = new LinkedList<>();
    testIndividualElementsToList3.add("C");
    testIndividualElementsToList3.add("A");
    testList.add(testIndividualElementsToList1);
    testList.add(testIndividualElementsToList2);
    testList.add(testIndividualElementsToList2);
    String returnString = destCity(testList);
    System.out.println(returnString);
  }

}
