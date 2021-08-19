package programmers;

import java.util.HashMap;

public class Level01_HashMap {
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(solution(
				new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, 
				new String[] {"josipa", "filipa", "marina", "nikola"}));
		
	}
	 
	// 참가한 선수들 participant
	// 완주한 선수들 completion
	// 들어오지 못한 선수는 단 한명
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<completion.length; i++) {
			String key = completion[i];
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
			
		}
		
		for(int i=0; i<participant.length; i++) {
			String key = participant[i];
			if(map.get(key) != null && map.get(key) > 0) {
				map.put(key, map.get(key)-1);
			}else {
				answer = key;
				break;
			}
		}
		
		return answer;
		
	}

	

}
