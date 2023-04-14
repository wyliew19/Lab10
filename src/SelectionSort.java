public class SelectionSort {
    private int temp;

    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /*
     * A simple SelectionSort algorithm
     * pre-condition: an array of integers x
     * post-condition: x sorted in ascending order
     * inputs: x, an array of integers
     * outputs: x, the sorted array of integers
     * special conditions: none
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    temp = x[j];
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
