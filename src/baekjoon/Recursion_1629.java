package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1629
// 곱셈
public class Recursion_1629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		long ans = function(a, b, c);
		System.out.println(ans);

	}

	private static long function(int a, int b, int c) {
		if(b == 1) return a % c;
		long value = function(a, b / 2, c);
		value = value * value % c;
		if(b % 2 == 0) return value;
		return value * a % c;
		
	}

}
