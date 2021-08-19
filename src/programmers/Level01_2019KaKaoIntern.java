package programmers;

import java.util.Stack;

public class Level01_2019KaKaoIntern {

	public static void main(String[] args) {
		// 크레인 뽑기
		System.out.println(solution(
				new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, 
				new int[] {1,5,3,5,1,2,1,4}
		));

	}
	
	// board 뽑기판, moves 크레인의 작동index
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int select : moves) {
        	select -= 1; // moves의 값은 == 열값 == 고정.
        	
        	for(int j=0; j<board.length; j++) {
        		if(board[j][select] != 0) { // 해당 열에 인형이 있을경우.
        			if(basket.isEmpty()) {
        				basket.push(board[j][select]);
        			}else {
        				if(basket.peek() == board[j][select]) { // 이전 바구니의 값과 같을 경우.
        					basket.pop();
        					answer += 2; // 이전인형과 뽑은 인형만큼 더해준다.
        				}else {
        					basket.push(board[j][select]); 
        				}
        			}
        			board[j][select] = 0;
        			break;
        		}        		
        	}
        	
        }        
        
        return answer;
    }

	

}
