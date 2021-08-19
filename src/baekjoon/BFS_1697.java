package baekjoon;

import java.util.ArrayDeque;
import java.util.Scanner;

// 숨바꼭질
// https://www.acmicpc.net/problem/1697
public class BFS_1697 {

	private static ArrayDeque<Integer> queue;
	private static int[] board;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int K = sc.nextInt();
		board = new int[100001];
		
		for(int i = 0; i < 100001; i++) board[i] = 100001;
		
		queue =  new ArrayDeque<>();
		board[X] = 0;
		queue.offer(X);
		
		while(board[K] == 100001) {
			int now = queue.poll();
			int b = now - 1; // 뒤
			int f = now + 1; // 앞 
			int j = now * 2; // 순간이동
			
			if(isRange(b)) {
				if(isSmall(b, now)) plusDistance(b, now);
			}
			if(isRange(f)) {
				if(isSmall(f, now)) plusDistance(f, now);
			}
			if(isRange(j)) {
				if(isSmall(j, now)) plusDistance(j, now);
			}
		}
		System.out.println(board[K]);
		
	}
	
	private static boolean isRange(int type) {
		return type >= 0 && type < 100001;
	}

	public static boolean isSmall(int type, int now) {
		return (board[type] > board[now] + 1)? true : false;
	}
	
	public static void plusDistance(int type, int now) {
		board[type] = board[now] + 1;
		queue.offer(type);
	}
	
	

}
