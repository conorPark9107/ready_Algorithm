package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수리공 항승
public class Greedy_1449{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int count = 0;
		for(int i = 0 ; i < N; i++) {
			if(i == N - 1) {
				count++;
				continue;
			}
			
			int start = arr[i];
			int j = i + 1;
			while(j < N) {
				if(arr[j] - start <= L - 1) {
					j++;
				}else {
					break;
				}
			}
			
			count++;
			i = j - 1;

		}
		System.out.println(count);
		
		
	}

}
