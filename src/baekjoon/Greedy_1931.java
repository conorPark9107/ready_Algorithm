package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정
// https://www.acmicpc.net/problem/1931
public class Greedy_1931 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken()); 
		long[][] meetings = new long[n][2];
		long now = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			token = new StringTokenizer(br.readLine());
			meetings[i][0] = Long.parseLong(token.nextToken());
			meetings[i][1] = Long.parseLong(token.nextToken());
		}
		
		// 종료시간 기준 정렬
		Arrays.sort(meetings, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				if(o1[1] == o2[1]) {
					return Long.compare(o1[0], o2[0]);
				}
				return Long.compare(o1[1], o2[1]);

			}
		});
		
		// 종료시간을 현재 시간으로 잡고,
		for(int i = 0; i < n; i++) {
			long startTime = meetings[i][0]; // 시작 시간
			long endTime = meetings[i][1];	 // 종료 시간
			
			if(now <= startTime) {
				now = endTime;
				count++;
			}
		}
		
		System.out.println(count);	

		br.close();

	}

}
