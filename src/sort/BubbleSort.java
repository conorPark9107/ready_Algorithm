package sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};	
		int temp = 0;
		
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
		
			for(int y=1; y<array.length-i; y++) {
				
				if(array[y-1] > array[y]) {
					temp = array[y];
					array[y] = array[y-1];
					array[y-1] = temp;
				}
			}
			
		}
		
		System.out.println("count : " + count);
		for(int val : array) {
			System.out.print(val + " " );
		}
		
		
			
	}

}
