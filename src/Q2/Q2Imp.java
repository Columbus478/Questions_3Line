/**
 * 
 */
package Q2;

/**
 * @author Samuel Columbus Jan 19, 2021
 */
public class Q2Imp {

  public static int[] rotateByNumOfRotation(int[] array, int n) {
    for (int i = 0; i < n; i++) {
      arrayRotation(array);
    }
    return array;
  }

  public static void arrayRotation(int[] array) {
    int first_el = array[0];
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = first_el;
  }

}
