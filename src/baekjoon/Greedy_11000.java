package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 강의실 배정
// https://www.acmicpc.net/problem/11000
public class Greedy_11000 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int[][] classRooms = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			classRooms[i][0] = Integer.parseInt(token.nextToken());
			classRooms[i][1] = Integer.parseInt(token.nextToken());
		}
		
		// 시작시간이 같다면 종료시간 기준으로.
		Arrays.sort(classRooms, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.offer(classRooms[0][1]);
		for(int i = 1; i < n; i++) {
			
			int elementOfQueue = queue.peek(); // 현재 진행중인 강의실
			int start = classRooms[i][0];	 // 현재 요소의 시작시간
			int end = classRooms[i][1];	 // 현재 요소의 종료시간
			
			// 현재 진행중인 강의가 끝난 후 이어서 강의가 시작될 수 있는 경우.
			if(elementOfQueue <= start) {  
				queue.poll();
			}
			
			queue.offer(end);
		}
		
		System.out.println(queue.size());

	}

}
