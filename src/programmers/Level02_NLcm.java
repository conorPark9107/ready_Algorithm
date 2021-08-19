package programmers;

public class Level02_NLcm {

	public static void main(String[] args) {
		
		int a = solution(new int[] {2,6,8,14});
		System.out.println(a);
		
		a = solution(new int[] {1,2,3});
		System.out.println(a);
	}
	
	public static int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
        	answer = lcm(answer, arr[i]);
        }
        
        
        return answer;
    }
	
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else{
			return gcd(b, a%b);
		}
	}

}
