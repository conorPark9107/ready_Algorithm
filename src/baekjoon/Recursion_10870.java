package baekjoon;

import java.util.Scanner;

// 피보나치 수 5
// //https://www.acmicpc.net/problem/10870
public class Recursion_10870 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		sc.close();

	}
	
	public static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	

}













