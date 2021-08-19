package programmers;

// 최대공약수와 최소공배수
// https://programmers.co.kr/learn/courses/30/lessons/12940
public class Level01_gcd_lcm {

	public static void main(String[] args) {
		int[] arr = solution(3, 12);
		for(int a : arr) {
			System.out.println(a);
		}
	}

	private static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		answer[0] = gcd(n, m); // 최대 공약수
		answer[1] = lcm(n, m); // 최소 공배수
		
		return answer;
	}

	private static int lcm(int n, int m) {
		return (n * m) / gcd(n, m);
	}

	private static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		}else {
			return gcd(m, n % m);
		}
	}
	
	
	
	

}
