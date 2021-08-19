package leetcode;

public class Easy_Reverse_Integer {

	public static void main(String[] args) {
		int a = reverse(-120);
		System.out.println(a);
	}
	
	public static int reverse(int x) {

		int answer = 0;
		boolean status = false;
		StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();

		try {
			String val = sb.toString();
			if(val.contains("-")) {
				val = val.replaceAll("-", "");
				status = true;
			}
			answer = Integer.parseInt(val);
			
		}catch (NumberFormatException e) {
			return 0;
		}
		
		if(status) {
			answer = answer * -1;
		}
		
		return answer;
    }

}
