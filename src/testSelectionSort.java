import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	private SelectionSort temp;
	

	public testSelectionSort() {
	}

	@Test
	public void testPositive() {
	    // Create a new instance of the SelectionSort class
	    temp = new SelectionSort();
	    
	    // Create an array of integers with positive values
	    int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 7;
	    arr[3] = 10;
	    arr[4] = 2;
	    
	    // Create a sorted array of integers
	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = 2;
	    Sortedarr[1] = 7;
	    Sortedarr[2] = 8;
	    Sortedarr[3] = 9;
	    Sortedarr[4] = 10;
	    
	    // Assert that the sorted array is equal to the expected sorted array
	    assertArrayEquals(temp.basicSelectionSort(arr),Sortedarr);
	}

	@Test
	public void testNegative() {
	    // Create a new instance of the SelectionSort class
	    temp = new SelectionSort();
	    
	    // Create an array of integers with negative values
	    int[] arr = new int[5];
	    arr[0] = -8;
	    arr[1] = -9;
	    arr[2] = -7;
	    arr[3] = -10;
	    arr[4] = -2;
	    
	    // Create a sorted array of integers
	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = -10;
	    Sortedarr[1] = -9;
	    Sortedarr[2] = -8;
	    Sortedarr[3] = -7;
	    Sortedarr[4] = -2;
	    
	    // Assert that the sorted array is equal to the expected sorted array
	    assertArrayEquals(temp.basicSelectionSort(arr),Sortedarr);
	}

	@Test
	public void testMixed() {
	    // Create a new instance of the SelectionSort class
	    temp = new SelectionSort();
	    
	    // Create an array of integers with both positive, negative and zeros
	    int[] arr = new int[7];
	    arr[0] = -5;
	    arr[1] = 3;
	    arr[2] = 0;
	    arr[3] = 2;
	    arr[4] = -1;
	    arr[5] = -2;
	    arr[6] = 4;
	    
	    // Create a sorted array of integers
	    int[] Sortedarr = new int[7];
	    Sortedarr[0] = -5;
	    Sortedarr[1] = -2;
	    Sortedarr[2] = -1;
	    Sortedarr[3] = 0;
	    Sortedarr[4] = 2;
	    Sortedarr[5] = 3;
	    Sortedarr[6] = 4;
	    
	    // Assert that the sorted array is equal to the expected sorted array
	    assertArrayEquals(temp.basicSelectionSort(arr),Sortedarr);
	}

	@Test
	public void testDuplicates() {
	    // Create a new instance of the SelectionSort class
	    temp = new SelectionSort();
	    
	    // Create an array of integers with duplicates
	    int[] arr = new int[7];
	    arr[0] = 3;
	    arr[1] = 5;
	    arr[2] = 0;
	    arr[3] = 2;
	    arr[4] = 3;
	    arr[5] = 5;
	    arr[6] = 4;
	    
	    // Create a sorted array of integers
	    int[] Sortedarr = new int[7];
	    Sortedarr[0] = 0;
	    Sortedarr[1] = 2;
	    Sortedarr[2] = 3;
	    Sortedarr[3] = 3;
	    Sortedarr[4] = 4;
	    Sortedarr[5] = 5;
	    Sortedarr[6] = 5;
	    
	    // Assert that the sorted array is equal to the expected sorted array
	    assertArrayEquals(temp.basicSelectionSort(arr),Sortedarr);
	}

}
