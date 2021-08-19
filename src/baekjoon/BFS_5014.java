package baekjoon;

import java.util.ArrayDeque;
import java.util.Scanner;

// 스타트링크
// https://www.acmicpc.net/problem/5014
public class BFS_5014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt(); // F층으로 이루어진 건물.
		int S = sc.nextInt(); // 시작점
		int G = sc.nextInt(); // 목적지
		int U = sc.nextInt(); // 윗층
		int D = sc.nextInt(); // 아랫층.
		
		int[] level = new int[F+1];
		for(int i = 0; i < level.length; i++) level[i] = -1;
		
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.offer(S);
		level[S] = 0;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			int up = now + U;
			int down = now - D;
			
			if(up > 0 && up <= F) {
				if(level[up] < 0) {
					queue.offer(up);
					level[up] = level[now] + 1;
				}
			}
			if(down > 0 && down <= F) {
				if(level[down] < 0) {
					queue.offer(down);
					level[down] = level[now] + 1;
				}
			}
			
			if(up == G || down == G) break;
		}
		
		if(level[G] == -1) {
			System.out.println("use the stairs");
		}else {
			System.out.println(level[G]);
		}
		
	}

}
