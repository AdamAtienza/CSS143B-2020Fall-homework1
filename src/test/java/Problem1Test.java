import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    // Example test
    // DO NOT CHANGE
    @Test
    public void testBinarySearch() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }

        int[] testArray1 = {1, 6, 6, 8, 9};
        System.out.println("Searching 6 in array. Should return 2.");
        System.out.println("Index of target 6 : " + Problem1.binarySearch(testArray1, 6));

        testArray1[3] = 6;
        System.out.println("Searching 6 in array. Should return 2 because that is first instance of 6.");
        System.out.println("Index of target 6 : " + Problem1.binarySearch(testArray1, 6));

        System.out.println("Searching 7 in array. Should return -1 because 7 is not in the array.");
        System.out.println("Index of target 6 : " + Problem1.binarySearch(testArray1, 7));






    }
}
