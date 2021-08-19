package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_1700 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 멀티탭의 구멍 수, 전기용품 사용횟수입력받기.
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// 1. 전기용품 사용 횟수만큼 입력받기.
		st = new StringTokenizer(br.readLine());
		int[] items = new int[K];	
		for(int i = 0; i < K; i++) {
			items[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. 카운팅 시작
		int answer = 0;
		int[] multitab = new int[N]; 
		for(int i = 0; i < K; i++) {
			
			// 현재 선택된 전기용품.
			int now = items[i];
			
			// ﻿1. 멀티탭에 꽂을 수 있다면 꽂는다.(비어있을 경우)
			boolean isUse = false;
			for(int j = 0; j < N; j++) {
				if(multitab[j] == 0) {
					multitab[j] = now;
					isUse = true;
					break;
				}else if(multitab[j] == now) {
					isUse = true;
					break;
				}
			}
			if(isUse) continue;
			
			// ﻿2. 멀티탭에 꽂을 수 없다면 (멀티탭에 꽂을 수 있는 모든 구멍이 활용중인 경우)
			// ﻿2-1. 현재 선택된 전기용품이 멀티탭에 꽂아져 있는 경우 = 아무 작업도 진행하지 않는다.
			isUse = false;
			for(int j = 0; j < N; j++) {
				if(multitab[j] == now) {
					isUse = true;
					break;
				}
			}
			if(isUse) continue;
			
			// ﻿2-2. 현재 선택된 전기용품이 멀티탭에 꽂아져 있지 않는 경우
			// 사용되지 않는 전기용품 > 최근 기준에서 가장 나중에 사용되는 전기용품 > 나머지
            // 전기용품은  (1 ≤ K ≤ 100)이기 때문에 101로 초기화
			int[] laterUse = new int[N]; 
			Arrays.fill(laterUse, 101);  
			for(int x = 0; x < N; x++) {
				for(int y = i; y < K; y++) {
					if(multitab[x] == items[y]) {
						laterUse[x] = (laterUse[x] == 101) ? y : laterUse[x]; 
					}
				}
			}
			
			// 2-2-1. 현재 멀티탭에 꽂아져 있는 전기용품중 나중에 사용되지 않는다면 그 전기용품과 교체한다.
			// 2-2-2. 현재 멀티탭에 꽂아져 있는 전기용품이 나중에 전부 사용된다면 현재 선택된 최근기준으로 나중에 나오는 전기용품과 교체한다.
			int later = laterUse[0];
			int laterIndex = 0;
			for(int j = 1; j < N; j++) {
				if(later < laterUse[j]) {
					later = laterUse[j];
					laterIndex = j;
				}
			}
			multitab[laterIndex] = now; 
			answer++;

		}
		
		System.out.println(answer);

	}

}
