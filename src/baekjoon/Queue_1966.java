package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 프린터 큐
// https://www.acmicpc.net/problem/1966
public class Queue_1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			
			LinkedList<int[]> q = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken()); 
			
			
			st = new StringTokenizer(br.readLine());
			for(int x=0; x<n; x++) {
				int num = Integer.parseInt(st.nextToken());
				q.offer(new int[]{x, num}); // N개 문서 index(들어온 순서), value(중요도)형태로.
			}
			
			int count = 0;
			
			while(!q.isEmpty()) {
				
				int[] now = q.poll();
				boolean maxFlag = true;
				
				for(int j=0; j<q.size(); j++) {
					
					int[] next = q.get(j);
					
					if(next[1] > now[1]) { // 현재 poll한 value
						q.offer(now);
						maxFlag = false;
						break;
					}
					
				}
				
				if(!maxFlag) continue;
				
				count++;
				
				if(now[0] == m) break;

			}// while	
			
			System.out.println(count);

		}// for

	}
}
