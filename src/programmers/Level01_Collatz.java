package programmers;

public class Level01_Collatz {

	public static void main(String[] args)  {
		int result = solution(6);
		System.out.println(result + " \n");
		result = solution(16);
		System.out.println(result + " \n");
		result = solution(626331);
		System.out.println(result + " \n");
		
		

	}
	
	public static int solution(int num) {
		long n = num;
		for(int i=0; i<500; i++) {
			if(n == 1) return i;
			n = (n % 2 == 0)? n / 2 : (n * 3) + 1;
		}
		return -1;
	}
	
	

}
