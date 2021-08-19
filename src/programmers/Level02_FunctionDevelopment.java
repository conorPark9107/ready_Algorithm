package programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;

// 기능개발
// https://programmers.co.kr/learn/courses/30/lessons/42586
public class Level02_FunctionDevelopment {

	public static void main(String[] args) {
		int[] arr = solution(new int[] {93, 30, 55}, new int[] {1, 30, 5});
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		arr = solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1});
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		arr = solution(new int[] {100, 0, 100}, new int[] {1, 100, 5});
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
	}

	private static int[] solution(int[] progresses, int[] speeds) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayDeque<int[]> q = new ArrayDeque<int[]>();
		for(int i = 0; i < speeds.length; i++) {
			q.offer(new int[] {i, progresses[i], speeds[i]});
		}
		
		int count = 0;
		while(!q.isEmpty()) {
			
			int[] p = q.poll();
			
			int index = p[0];
			int progress = p[1] + p[2];
			int speed = p[2];
			
			if(index == 0 && progress >= 100) {
				
				int size = q.size();
				for(int i = 0; i < size; i++) {
					int[] arr = q.poll();
					arr[0] = arr[0] - 1;
					q.offer(arr);
				}
				count++;
				
			}else {
				q.offer(new int[] {index, progress, speed});
				if(count > 0) list.add(count);
				count = 0;
			}
		
			
			
		}
		list.add(count);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

}
