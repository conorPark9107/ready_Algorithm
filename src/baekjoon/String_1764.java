package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1764
public class String_1764 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		HashSet<String> set = new HashSet<>();
		StringBuilder answer = new StringBuilder();
		int count = 0;
		
		for(int i = 0 ; i < n + m; i++) {
			String name = sc.nextLine();
			if(set.contains(name)) {
				answer.append(name).append("\n");
				count++;
			}else {
				set.add(name);
			}
		}
		
		String[] strArr = answer.toString().split("\n");
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
			
		});
		
		System.out.println(count);
		for(String s : strArr) {
			System.out.println(s);
		}
		
		
	}

}
