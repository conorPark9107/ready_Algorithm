package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
public class Bruteforce_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 자연수 N
		
		boolean success = false;
		int i;
		for(i = 1; i < N; i++) {
			
			String str = String.valueOf(i);
			int sum = Integer.parseInt(str);
			
			for(int j = 0; j < str.length(); j++) {
				char a = str.charAt(j);
				sum += (int) a - '0';
			}
			if(sum == N) {
				success = true;
				break;
			}
			
		}
		
		if(success) {
			System.out.println(i);
		}else {
			System.out.println(0);
		}
		
	}
}
