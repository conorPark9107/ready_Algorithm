package programmers;

//Programmers > 완전탐색 > 모의고사
public class Level01_search {

	public static void main(String[] args) {
		int[] array = solution(new int[] {1,2,3,4,5});
		
		for(int i : array) {
			System.out.println(i);
		}
		
		array = solution(new int[] {1,3,2,4,2});
		
		for(int i : array) {
			System.out.println(i);
		}
	}

	private static int[] solution(int[] answer) {
		int[] cnt = {0,0,0};
		int[] person01 = {1,2,3,4,5};
		int[] person02 = {2,1,2,3,2,4,2,5};
		int[] person03 = {3,3,1,1,2,2,4,4,5,5};
		
		for(int i=0; i<answer.length; i++) {
			if(person01[i%person01.length] == answer[i]) {
				cnt[0] += 1;
			}
			if(person02[i%person02.length] == answer[i]) {
				cnt[1] += 1;		
			}
			if(person03[i%person03.length] == answer[i]) {
				cnt[2] += 1;
			}
		}
		
		int max = cnt[0];
		for(int i=1; i<cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<cnt.length; i++) {
			if(max == cnt[i]) {
				sb.append(i+1 + " ");
			}
		}
		
		String[] ar = sb.toString().split(" ");
		int[] ans = new int[ar.length];
		for(int i=0; i<ar.length; i++) {
			ans[i] = Integer.parseInt(ar[i]);
		}
		
		return ans;
	}

}
