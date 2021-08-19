package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1541
public class String_1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] minus = sc.nextLine().split("-");
		int answer = 0;
		boolean first = true;
		int temp;
		
		for(String m : minus) 
		{
			temp = 0;
			String[] plus = m.split("\\+");
			for(String p : plus) 
			{
				temp += Integer.parseInt(p);
			}
			
			if(first) {
				answer = temp;
				first = false;
			}else {
				answer -= temp;
			}
		}
		
		System.out.println(answer);
	}

}
