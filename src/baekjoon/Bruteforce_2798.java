package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
// https://www.acmicpc.net/problem/2798
public class Bruteforce_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int[] cards = new int[n];
		
		// 1) 카드 입력받기.
		token = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
		{
			cards[i] = Integer.parseInt(token.nextToken());
		}
		
		// 2) 카드가 겹치지 않게 3개의 카드를 선택했을 경우. m과 같거나 크다라면 그 중 가장 큰 수가 가장 m과 가까운 수가 된다.
		int max = 0;
		for(int x = 0; x < n; x++)
		{
			for(int y = x + 1; y < n; y++)
			{
				for(int z = y + 1; z < n; z++)
				{
					int sum = cards[x] + cards[y] + cards[z];
					if(sum <= m)
					{
						max = Math.max(max, sum);
					}
				}
			}
		}
		System.out.println(max);
		
	}

}
