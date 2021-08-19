package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자야구
public class Bruteforce_2503_no {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[1001];
		
		while(N-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int question = Integer.parseInt(st.nextToken());
			int strike   = Integer.parseInt(st.nextToken());
			int ball     = Integer.parseInt(st.nextToken());
			
			
			// 123 : 123 ~ 999 중. 123이 함께 포함된 숫자가 있을경우. 모두 false
			// 356 : 356이 함께 포함된 모든 숫자를 false처리.
			// 327 : 3, 2, 7이 함께 포함된 숫자들을 모두 false
			// 489 : 4, 8, 9가 포함된 모든 숫자들을 모두 false 처리.
			
			for(int i = 123; i <= 999; i++) {
				
			}
			
			
			
		}
		
		
		
	}

}
