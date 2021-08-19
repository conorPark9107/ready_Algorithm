package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
// https://www.acmicpc.net/problem/11047
public class Greedy_11047 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken()); 
		int k = Integer.parseInt(token.nextToken()); 

		int[] array = new int[n]; 
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		System.out.println(k - array[n-1]);
		while (k > 0) {
			for (int i = n - 1; i >= 0; i--) {
				if(k - array[i] >= 0) {
					count += k / array[i];
					k %= array[i];
					
				}
			}
		}

		System.out.println(count);

		br.close();

	}

}
