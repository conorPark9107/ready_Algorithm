package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2675
public class String_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Object[][] arr = new Object[n][n];
		for(int i=0; i<n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextLine().trim();
		}

		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			int loop = (int)arr[i][0];
			String str = (String)arr[i][1];
			
			for(int j=0; j<str.length(); j++) {
				for(int x=0; x<loop; x++) {
					sb.append(str.charAt(j));
				}
				
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}

	}

}
