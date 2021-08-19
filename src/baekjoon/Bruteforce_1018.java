package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//체스판 다시 칠하기 
//https://www.acmicpc.net/problem/1018
public class Bruteforce_1018 {

	private static String[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().split(" ");
		int n = Integer.parseInt(inputArr[0]);
		int m = Integer.parseInt(inputArr[1]);
		board = new String[n][m];
		
		for(int i = 0; i < n; i++) 
		{
			inputArr = br.readLine().split("");
			for(int j = 0; j < m; j++) 
			{
				board[i][j] = inputArr[j];
			}
		}
		
		int min = 64;
		for(int i = 0; i <= n-8; i++) 
		{	
			
			for(int j = 0; j <= m-8; j++) 
			{
				int cnt = counting(i, j);
				min = Math.min(min, cnt);
				min = Math.min(min, 64-cnt);
			}
			
		}
		System.out.println(min);
	}
	
	private static int counting(int i, int j) {
		int count = 0;
		for(int x = 0; x < 8; x++)
		{
			for(int y = 0; y < 8; y++)
			{
				if( (x % 2 == y % 2 ? "W" : "B").equals(board[x + i][y + j]))
				{
					count += 1;
				}
			}
		}
		return count;
	}

}
