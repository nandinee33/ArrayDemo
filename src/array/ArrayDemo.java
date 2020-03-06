/*
 *   Created by IntelliJ IDEA.
 *   User: Nandinee Gupta 
 *   Date: 08/01/20
 *   Time: 8:13 PM
 */

package array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
/*
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + ", ");
        }
*/
        /*for (int i : integers) {
            System.out.print(i + ", ");
        }*/
        int[] integers = new int[10];
        printArrayValues(integers);
//        initialiseIntegerArray(integers);
        /*printArrayValues(integers);
        boolean response = searchInArray(integers, 22);
        if (response) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found");
        }
        System.out.println(response ? "value found" : "not found");*/
    }

    /**
     * This method can search a integer value in an integer array.
     *
     * @param array an integer array
     * @param value the value to be searched
     * @return True if the {@param value} is found in the {@param array}
     */
    public static boolean searchInArray(int[] array, int value) {
        boolean response = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                response = true;
                break;
            }
        }
        return response;
    }

    public static void printArrayValues(int[] integers) {
        System.out.println(Arrays.toString(integers));
    }

    public static void initialiseIntegerArray(int[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (i + 1);
        }
    }
}
