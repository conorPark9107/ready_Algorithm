package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// 퇴사
// https://www.acmicpc.net/problem/14501
public class Bruteforce_14501 {

	private static int[][] arr;
	private static int n;
	private static int max;
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			StringTokenizer t = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(t.nextToken());
			arr[i][1] = Integer.parseInt(t.nextToken());
		}
		

		for(int i = 0; i < n; i++)
		{
			if( i + arr[i][0] <= n)
			{
				dfs(i, 0);
			}
		}
		System.out.println(max);

	}

	private static void dfs(int time, int price) 
	{
		max = Math.max(max, price);
		
		for(int i = time; i < n; i++)
		{
			int afterTime  = i + arr[time][0];     // 이전 상담일수와 더한 일 수
			int afterPrice = price + arr[time][1]; // 이전 금액과 더한 금액
			if(afterTime <= n)
			{
				dfs(afterTime, afterPrice);
			}
		}
	}

}
