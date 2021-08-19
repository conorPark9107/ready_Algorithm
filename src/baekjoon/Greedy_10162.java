package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전자레인지
public class Greedy_10162 {

	private static final int[] TIMES = {300, 60, 10};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 1) 전자레인지의 A,B,C가 10의 배수이기 때문에 10으로 나누어 지지 않는다면, 나머지도 나누어 질 수 없음.
		if(T % 10 != 0) 
		{
			System.out.println(-1);
			return;
		}
		
		// 2) 동전의 액면가가 큰 동전부터 나눌 수 있으면 나눠주고 몫을 카운팅.
		int[] answer = {0, 0, 0};
		while(T > 0) 
		{	
			// 3) 나눌수 있으면 나눔, 나눌 수 없다면 다음단위
			for(int i = 0; i < 3; i++) {
				if(T >= TIMES[i])
				{
					answer[i] += T / TIMES[i];
					T %= TIMES[i];
					i--;
				}
			}
			
			break;
		}
		
		// 4) 출력
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			sb.append(answer[i]).append(" ");
		}
		System.out.println(sb.toString());
		
	}

}
