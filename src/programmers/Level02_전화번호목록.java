package programmers;

import java.util.*;

// 전화번호 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Level02_전화번호목록 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"})); // false
        System.out.println(solution(new String[]{"123","456","789"})); // true
        System.out.println(solution(new String[]{"12","123","1235","567","88"})); // false
        System.out.println(solution(new String[]{"119", "21195524421"})); // true
        System.out.println(solution(new String[]{"0", "01"})); // false
        System.out.println(solution(new String[]{"1", "11"})); // false
        System.out.println(solution(new String[]{"1234", "12"})); // false
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
        for (String s : phone_book) {
            for (int j = 1; j < s.length(); j++) {
                if (set.contains(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }

}
