package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


// 점수 계산
public class Implement_2822 {


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[8];
		
		for(int i=0; i<8; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		
		int[] array02 = array.clone();
		Arrays.sort(array02);
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum += array02[array02.length - i];
		}
		
		System.out.println(sum); // 합계
		
		int max = array02[(array02.length/2) - 1]; // 정렬된 array에서 가장큰값중 5번째 값
		for(int i=0; i<array.length; i++) {
			if(array[i] >= max) {
				System.out.print((i+1) + " "); // 5번째까지 큰 값의 index
			}
		}
	}
}
