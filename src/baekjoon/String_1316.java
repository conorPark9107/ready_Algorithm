package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1316
public class String_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextLine();
		}
		
		int count = 0; 
		boolean status = true; 
		boolean[] check = null;
		for(int i=0; i<arr.length; i++) 
		{
			status = true;
			check = new boolean[26]; 
			String str = arr[i];
			if(str.length() == 1 ) {
				count++;
				continue;
			}
			
			check[str.charAt(0)-97] = true;
			for(int j=1; j<str.length(); j++) 
			{
				int prev = str.charAt(j-1) - 97; // 이전 문자.
				int now = str.charAt(j)   - 97;  // 현재 문자.
				
				if(prev != now) { 
					if(check[now]){ 
						status = false;
						break;
					}else{
						check[now] = true;
					}
					
				}else{
					check[now] = true;
				}
			}// end for (j)
			
			if(status) {
				count++;
			}
			
		}// end for (i)
		
		System.out.println(count);
	}

}
