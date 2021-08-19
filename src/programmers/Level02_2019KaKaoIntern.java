package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Level02_2019KaKaoIntern {

	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		
		String[] array = s.substring(1, s.length()-1).split("},");
		for(int i=0; i<array.length; i++) {
			array[i] = array[i].replaceAll("\\{|\\}", "");
		}
		
		Arrays.sort(array, new Comparator<String>() {
		       @Override
		       public int compare(String s1, String s2) {
		           return s1.length() - s2.length();
		       }
		});
		
		ArrayList<Integer> list = new ArrayList<>();
		for(String a : array) {
			String[] array02 = a.split(",");
			
			for(int i=0; i<array02.length; i++) {
				list.add(Integer.parseInt(array02[i]));
			}
			
		}
		
		List<Integer> answerList = list.stream().distinct().collect(Collectors.toList());
		int[] answer = new int[answerList.size()];
        
		for(int i=0; i<answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		
	}

}

