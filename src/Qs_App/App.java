/**
 * 
 */
package Qs_App;

import Q2.Q2Imp;
import Q3.Q3Imp;

/**
 * @author Samuel Columbus Jan 19, 2021
 */
public class App {

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("Solution for Question 2.");
    solveQ2();
    System.out.println("\nSolution for Question 3.");
    solveQ3();
  }


  public static void solveQ2() {
    int[] array = {2, 3, 4, 5, 6};
    int n = 3;
    for (int num : Q2Imp.rotateByNumOfRotation(array, n)) {
      System.out.print(num + " ");
    }
  }

  public static void solveQ3() {
    // example: 1
    int[] array = {1, 0, 0, 0, 0, 1, 0, 0};
    int number_of_days = 1;

    // example: 2
    // int[] array = {1, 1, 1, 0, 1, 1, 1, 1};
    // int number_of_days = 2;

    for (int num : Q3Imp.checkActiveNeighborsByDays(array, number_of_days)) {
      System.out.print(num + " ");
    }
  }

}
