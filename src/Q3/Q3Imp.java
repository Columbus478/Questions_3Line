/**
 * 
 */
package Q3;

/**
 * @author Samuel Columbus Jan 19, 2021
 */
public class Q3Imp {

  public static int[] checkActiveNeighborsByDays(int[] array, int num_of_days) {
    // get a copy of the original array to work with
    int[] copied_array = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      while (num_of_days-- > 0) {
        // Let's use the XOR operation to compute for the leftmost and rightmost elements
        copied_array[0] = 0 ^ array[1]; // Will set false (0) for the leftmost
        copied_array[array.length - 1] = 0 ^ array[array.length - 2]; // Will set false (0) for the
                                                                      // rightmost
        // for intermediate cells
        // if both adjacent cells are either active or inactive, copied_array[i] = 0 else
        // copied_array[i] = 1
        for (int j = 1; j <= array.length - 2; j++)
          copied_array[j] = array[j - 1] ^ array[j + 1];
        // set this changed copied array to be the new array for next iteration
        for (int j = 0; j < array.length; j++)
          array[j] = copied_array[j];
      }
    }
    return array;
  }
}
