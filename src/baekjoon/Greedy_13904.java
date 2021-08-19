package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 과제
public class Greedy_13904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 1) 과제들 입력받고, 마감일 까지 남은 일수가 가장 많이 남은 일수를 찾음.
		int[][] arr = new int[N][2];
		int maxDay = 0;
		for(int i = 0; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			arr[i][0] = d;
			arr[i][1] = w;
			maxDay = Math.max(maxDay, d);
		}
		
		// 2) 마감일 까지 남은 일수가 가장 많이 남은 일수의 배열을 생성
		int[] projects = new int[maxDay];
		
		
		// 3) 과제들을 점수기준으로 내림차순으로 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}			
		});
		
		
		// 4) 가장 큰 점수인 과제부터 선택하여 해당 과제의 남은 마감일자보다 크면 마감 일자를지나간 것이므로 
		//    마감일자를 index로 지정 하고 1씩 감소(왼쪽으로 한칸씩)하며 빈 자리가 있다면 그 자리에 저장한다.
		for(int i = 0; i < N; i++) {
			int d = arr[i][0];
			int w = arr[i][1];
			for(int j = d - 1; j >= 0; j--) {
				if(projects[j] == 0) {
					projects[j] = w;
					break;
				}
			}
		}
		
		// 5) 선택한 과제들을 전부 더해서 출력
		int answer = 0;
		for(int i = 0; i < maxDay; i++) {
			answer += projects[i];
		}
		System.out.println(answer);
		
		

	}

}
