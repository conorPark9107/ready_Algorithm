package programmers;

public class Level01_SquarePlusOne {

	public static void main(String[] args) {
		long answer = solution(121);
		System.out.println(answer);
		
		answer = solution(3);
		System.out.println(answer);
	}
	
	public static long solution(long n) {
		for(long i=1; i<=n; i++) {
			if((long)(i * i) == n) {
				return (long)((i+1)*(i+1));
			}
		}
		return -1;
	}
	
}
