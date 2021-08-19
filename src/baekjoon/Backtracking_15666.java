package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

// N과 M (12) 
public class Backtracking_15666 {
	
	static int N;
	static int M;
	static int[] numbers;
	static LinkedHashSet<String> set;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sArr = br.readLine().split(" ");
		N = Integer.parseInt(sArr[0]); 
		M = Integer.parseInt(sArr[1]); 
		
		set = new LinkedHashSet<>();
		numbers = new int[N];
		
		sArr = br.readLine().split(" ");
		for(int i = 0; i < sArr.length; i++) {
			numbers[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(numbers);
		
		function(0, 0, "");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
	
	private static void function(int index, int len, String s) {
		if(len == M) {
			set.add(s.trim());
			return;
		}
		
		for(int i = index; i < N; i++) {
			function(i, len + 1, s + " " +  numbers[i]);
		}
		
	}

}
