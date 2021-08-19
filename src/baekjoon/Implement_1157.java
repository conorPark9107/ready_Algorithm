package baekjoon;

import java.util.Scanner;

public class Implement_1157 {

	public static void main(String[] args) {
		String sttt = "100000000";
		System.out.println(String.format("%,d", Integer.parseInt(sttt)));
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim().toUpperCase();
		sc.close();
		
		char[] arr = str.toCharArray(); // String to make char array
		int[] countArr = new int[26]; // 알파벳 갯수
		
		for(char a :  arr) {
			countArr[a - 65]++; // ascii코드 count
		}
		
		char answer = '?'; // 제출할 답
		int max = 0; // 가장 큰값
		
		for(int i=0; i<countArr.length; i++) {
			if(countArr[i] > max) {
				max = countArr[i];
				answer = (char) (i + 65);
			}else if(countArr[i] == max) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
		

	}
	
}
  