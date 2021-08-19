package programmers;

public class Level01_2020Kakao_keypad {

	public static void main(String[] args) {
//		String s1 = solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
//		System.out.println(s1);
		String s2 = solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
		System.out.println(s2);
//		String s3 = solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

	}
	
	public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int number = 0;
        int lPosition = 10;
        int rPosition = 12;
        int lCount = 0;
		int rCount = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	number = numbers[i];
        	
        	if(number == 1 || number == 4 || number == 7) { // 왼손
        		sb.append("L");
        		lPosition = number;
        		
        	}else if(number == 3 || number == 6 || number == 9) { // 오른손
        		sb.append("R");
        		rPosition = number;

        	}else {
        		if(number == 0)number = 11;
        		lCount = 0;
        		rCount = 0;
        		lCount = Math.abs(number-lPosition)/3 + Math.abs(number-lPosition)%3;
        		rCount = Math.abs(rPosition-number)/3 + Math.abs(rPosition-number)%3;
        		
        		if(lCount == rCount) {
        			if(hand.equals("right")) {
        				sb.append("R");
        				rPosition = number;
        				
        			}else {
        				sb.append("L");
        				lPosition = number;
        				
        			}
        		}else if(lCount < rCount) {
        			sb.append("L");
        			lPosition = number;
        		}else {
        			sb.append("R");
    				rPosition = number;
        		}
        	}
        }// for()
        
        
        
        return sb.toString();
    }
}
