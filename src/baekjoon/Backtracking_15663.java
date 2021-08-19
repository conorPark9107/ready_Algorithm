package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

// N과 M (9)
public class Backtracking_15663 {
	
	static int N;
	static int M;
	static int[] arr;
	static int[] numbers;
	static boolean[] used;
	static LinkedHashSet<String> set;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		used = new boolean[N];
		numbers = new int[N];
		set = new LinkedHashSet<>(); 
		
		st =  new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		
		function(0, "");
		for(String s : set) {
			System.out.println(s);
		}
		
	}

	private static void function(int leng, String s) {
		if(leng == M) {
			set.add(s.trim());
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!used[i]) {
				arr[leng] = numbers[i];
				used[i] = true;
				function(leng + 1, s + " " + arr[leng]);
				used[i] = false;
			}
			
		}
		
		
		
	}

}
