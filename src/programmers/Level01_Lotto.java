package programmers;

// 프로그래머스 - 로또의 최고 순위와 최저 순위
// https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
public class Level01_Lotto {

	public static void main(String[] args) {
		int[] array = solution(new int[] {44, 1, 0, 0, 31, 25},
							   new int[] {31, 10, 45, 1, 6, 19});
		for(int a : array) {
			System.out.println(a);
		}
		
		int[] array01 = solution(new int[] {0,0,0,0,0,0},
								 new int[] {38, 19, 20, 40, 15, 25});
		for(int a : array01) {
			System.out.println(a);
		}
		
		int[] array02 = solution(new int[] {45, 4, 35, 20, 3, 9},
				 				 new int[] {20, 9, 3, 45, 4, 35});
		for(int a : array02) {
			System.out.println(a);
		}


	}
	
	
	// lottos == 구매한 로또
	// win_nums == 당첨 번호
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int countZero = 0; // 0의 개수가 몇개인지.
		int count = 0; // 당첨된 갯수
		
		for(int i=0; i<6; i++) {
			countZero += (lottos[i] == 0)? 1 : 0;
		}
		
		for(int i=0; i<6; i++) {
			if(lottos[i] > 0) {
				for(int y=0; y<6; y++) {
					if(lottos[i] == win_nums[y]) {
						count += 1;
						break;
					}
				}
			}
			
		}
		
		int[] checkArr = {6, 6, 5, 4, 3, 2, 1};
		
		answer[0] = checkArr[(count+countZero)];
		answer[1] = checkArr[count];
		
		return answer;
	}
	

}
