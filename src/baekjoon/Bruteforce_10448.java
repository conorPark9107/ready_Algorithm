package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 유레카 이론
public class Bruteforce_10448 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[45];
		for(int i = 1; i < 45; i++) {
			arr[i] = arr[i-1] + i;
		}
		
		while( T-- > 0 ) {
			int K = Integer.parseInt(br.readLine());
			int result = 0;
			
			start :
			for(int x = 1; x < 45; x++) {				
				for(int y = 1; y < 45; y++) {		
					for(int z = 1; z < 45; z++) {
						int sum = arr[x] + arr[y] + arr[z];
						if(sum > K) break;
						if(sum == K) {
							result = 1;
							break start;
						}
					}
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb.toString());
	}

}
