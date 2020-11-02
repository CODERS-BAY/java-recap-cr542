/*
 * InsertionSort coded by cr542 *
 */

public class InsertionSort {

	public static int[] sort(int[] array) {
		
		int swap = 0;
		
		for(int i = 1; i < array.length; i++) {
			for(int k = i; k >= 0; k--) {
				if((k > 0) && (array[k-1] > array[k])) {
					swap = array[k-1];
					array[k-1] = array[k];
					array[k] = swap;
				}
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] testArray = {2, 0, 4, 8, 3};
		
		sort(testArray);
		
		for(int z = 0; z < testArray.length; z++) {
			System.out.println(testArray[z]);
		}
		
	}
}
