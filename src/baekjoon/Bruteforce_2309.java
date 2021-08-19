package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
public class Bruteforce_2309 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dwarfs = new int[9];
		int sum = 0;
		boolean success = false;
		
		for(int i = 0; i < 9; i++) {
			dwarfs[i] = Integer.parseInt(br.readLine());
			sum += dwarfs[i];
		}
		
		Arrays.sort(dwarfs);
		
		for(int i = 0; i < 9; i++) {			
			for(int j = i + 1; j < 9; j++) {
				
				if(sum - (dwarfs[i] + dwarfs[j]) == 100) {
					dwarfs[i] = 0;
					dwarfs[j] = 0;
					success = true;
					break;
				}
			}
			
			if(success) break;
		}
		
		for(int i = 0; i < 9; i++) {
			if(dwarfs[i] != 0) {
				System.out.println(dwarfs[i]);
			}
		}
		
	}// end main 

	

}

