package baekjoon;

import java.util.Scanner;

public class Recursion_1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		
		// 함수의 정의 : function(N, r, c)  ==> r행 c열의 순서를 리턴하는 함수.
		int ans = function(N, r, c);
		
		System.out.println(ans);
		
		
		
		
	}

	private static int function(int N, int r, int c) {
		// base case: N이 0일 때 0을 return
		if(N == 0) return 0;
		
		// 2의 N-1제곱의 행렬의 순서를 안다면, 2의 N제곱 행렬의 순서를 알 수 있다.
		int half = (int)Math.pow(2, N-1);
		
		// 행렬을 4등분 한 후 1,2,3,4의 번호를 주었을 때
		
		// r과 c가 1번에 분할에 속할 경우.
		if(r < half && c < half)  return function(N-1, r, c);
		
		// r과 c가2번에 분할에 속할 경우.
		if(r < half && c >= half) return half * half + function(N-1, r, c-half);
		
		// r과 c가 3번 분할에 속할 경우.
		if(r >= half && c < half) return 2 * half * half + function(N-1, r-half, c);
		
		// r과 c가 4번 분할에 속할 경우.
		return 3 * half * half + function(N-1, r-half, c-half);
	}

}
