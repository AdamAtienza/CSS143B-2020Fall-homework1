public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution

        int x = data.length;

        //sorting in ascending order
        for(int i = 0; i < x-1; i++){
            for(int j = 0; j < x-i-1; j++){
                if(data[j] > data[j+1]){

                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

    }
}
