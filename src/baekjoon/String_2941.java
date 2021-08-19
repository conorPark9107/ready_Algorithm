package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2941
public class String_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] check = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count = 0;
		
		for(int i=0; i<check.length; i++) {
			if(str.contains(check[i])) {
				str = str.replaceAll(check[i], "A");
			}
		}
		count += str.length();
		
		System.out.println(count);
			

	}

}
