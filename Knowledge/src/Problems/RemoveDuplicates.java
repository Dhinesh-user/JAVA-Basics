package Problems;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 3, 4};
        
        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);
        
        // Print the unique elements
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));
    }
    
    public static int[] removeDuplicates(int[] array) {
        // Sort the array (optional but helps in removing duplicates efficiently)
        Arrays.sort(array);
        
        // Count the number of unique elements in the array
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++; 
        // Account for the last element
        
        // Create a new array with unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        
//        uniqueArray[index++] = array[0];
        
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArray[index++] = array[i];
            }
        }
        uniqueArray[index++] = array[array.length-1];
        
        return uniqueArray;
    }
}