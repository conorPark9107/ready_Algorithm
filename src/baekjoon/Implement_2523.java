package baekjoon;

import java.util.Scanner;

public class Implement_2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		showStar(n);
		
		sc.close();

	}
	
	public static void showStar(int n) {
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	

}
