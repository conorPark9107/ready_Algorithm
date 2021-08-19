package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12935
public class Level01_MinNumber {

	public static void main(String[] args) {
		int[] array = solution(new int[] {4, 3, 2, 1, 5, 6});
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		array = solution(new int[] {10});
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length < 2) return new int[] {-1};
		
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		int cnt = 0;
		for(int i=0; i<answer.length; i++) {
			for(int j=i+cnt; j<arr.length; j++) {
				if(arr[j] > min) {
					answer[i] = arr[j];
					break;
				}else {
					cnt++;
				}
				
			}
			
		}
		
		return answer;
	}

}
