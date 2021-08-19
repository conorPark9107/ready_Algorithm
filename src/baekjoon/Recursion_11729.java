package baekjoon;

import java.util.Scanner;

// 하노이탑
// https://www.acmicpc.net/problem/11729
public class Recursion_11729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println( (1<<n)-1 );
		function(1, 3, n);
	}

	private static void function(int a, int b, int n) {
		if(n == 1) {
			System.out.println(a + " " + b);
			return;
		}
		function(a, 6-a-b, n-1);		 // a에서 b로 n-1개 만큼(가장 큰 원반 빼고) 2번으로 이동.
		System.out.println(a + " " + b); // 가장 큰 원반 이동.
		function(6-a-b, b, n-1);		 // a에서 b로 n-1개 만큼 3번으로 이동.
	}

}
