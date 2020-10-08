import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        // add your tests here

        int[] data = {10, 45, 6 ,7, 92, 63, 64, 29, 2, 0};
        Problem2.bubbleSort(data);
        for(int i = 0; i < data.length - 1; i++){
            System.out.print(data[i] + ", ");
        }
    }
}
