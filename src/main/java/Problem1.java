public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

         int min = 0;
         int max = data.length - 1;

         while (min <= max) {

             int mid = (min + max) / 2;

             if(data[mid] == target) {
                 return mid;
             } else if (data[mid] < target) {
                 min = mid + 1;
             } else {
                 max = mid - 1;
             }
         }

        return -1; // Place holder
    }
}
