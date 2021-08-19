package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};	
		int changeIndex = 0;
		int temp = 0;
		
		for(int i=0; i<array.length-1; i++) {
			int min = 99999;
			
			for(int y=i; y<array.length; y++) {
				if(min > array[y]) {
					min = array[y];
					changeIndex = y;
				}
			}
			
			temp = array[i];
			array[i] = array[changeIndex];
			array[changeIndex] = temp;
			
			
		}
		
		for(int val : array) {
			System.out.print(val + " " );
		}
		
		
	}

}
