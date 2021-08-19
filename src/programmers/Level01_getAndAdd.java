package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Level01_getAndAdd {
	
	
	public static void main(String[] args) {
		
		int[] array = solution(new int[] {2,1,3,4,1});
		for(int a : array) {
			System.out.println(a);
		}
		System.out.println("------------------------");
		array = solution(new int[] {5,0,2,7});
		for(int a : array) {
			System.out.println(a);
		}
	}
	 
	public static int[] solution(int[] numbers) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if(!map.containsKey(sum)) {
					map.put(sum, sum);
				}
			}
			
		}
		
		int[] answer = new int[map.size()];
		Iterator<Integer> iterater = map.keySet().iterator();
		int i = 0;
		while(iterater.hasNext()) {
			answer[i++] = map.get(iterater.next()); 
		}
		Arrays.sort(answer);
		
		return answer;
		
	}

	

}
