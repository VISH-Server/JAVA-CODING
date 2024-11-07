/*package whatever //do not write package name here */

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args)
    {
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Using inbuilt method in Java
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i]
                = originalArray[originalArray.length - 1
                                - i];
        }

        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}
