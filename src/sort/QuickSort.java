package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		quickSort(array);
		
		System.out.println();
		
		for(int a : array) {
			System.out.print(a + " ");
		}
		
	}
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
		
	}
	
	
	public static void quickSort(int[] array, int start, int end) {
		int part2 = partition(array, start, end);
		if(start < part2-1) {
			quickSort(array, start, part2-1);
		}
		if(end > part2) {
			quickSort(array, part2, end);
		}
		
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[ (start + end) / 2];
		
		while(start <= end) {
			while(array[start] < pivot) start++;
			while(array[end] > pivot) end--;
			
			if(start <= end) {
				swap(array, start, end);
				start++;
				end--;
				
			}
		}
		
		return start;
	}

	private static void swap(int[] array, int start, int end) {
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		
	}

}
