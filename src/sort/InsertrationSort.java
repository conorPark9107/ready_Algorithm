package sort;

public class InsertrationSort {

	public static void main(String[] args) {
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		int temp, j;
		
		for(int i=0; i<array.length-1; i++) {
			j = i;
			while(array[j] > array[j+1]){
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}

		}
		
		for(int a : array) {
			System.out.print(a + " ");
		}

	}

}
