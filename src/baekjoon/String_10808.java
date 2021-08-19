package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10808
public class String_10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] strArr = br.readLine().toCharArray();
		int[] numArr = new int[26];

		for(char s : strArr) 
		{
			int value = s - 97;
			numArr[value]++;
		}
		
		for(int num : numArr) 
		{
			System.out.print(num + " ");
		}
	}

}
