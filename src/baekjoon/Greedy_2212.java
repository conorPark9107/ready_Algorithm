package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_2212 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. N(센서의 개수)과 K(집중국의 개수)입력 
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		// 2. N개의 센서를 int형 배열(sensors)에 저장 후, 오름차 순으로 정렬.
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] sensors = new int[N];
		for(int i = 0; i < N; i++) {
			sensors[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sensors);

		// 3. 인접한 두 센서의 거리를 모두 계산하여 N-1개의 int[]배열(distance)에 저장.
		int[] distance = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			distance[i] = sensors[i + 1] - sensors[i];
		}
		
		// 4. K-1개 만큼 인접한 두 센서간의 거리가 가장 긴 거리를 0으로 변경. (집중국이 설치될 위치)
		for(int i = 0 ; i < K-1 && K <= N; i++) {
			int max = 0;
			int maxIndex = 0;
			for(int j = 0; j < distance.length; j++) {
				if(max < distance[j]) {
					max = distance[j];
					maxIndex = j;
				}
			}
			distance[maxIndex] = 0;
		}
		
		// 5. 모두 더해서 출력
		int answer = 0;
		for(int d : distance) answer += d;
		System.out.println(answer);
		
	}

}
