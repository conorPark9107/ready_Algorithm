package programmers;


// 접미사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class Level00_접미사인지확인하기 {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana")); // 1
        System.out.println(solution("banana", "nan")); // 0
        System.out.println(solution("banana", "wxyz")); // 0
        System.out.println(solution("banana", "abanana")); // 0
    }

    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i);
            if (s.equals(is_suffix)) {
                return 1;
            }
        }
        return answer;
    }

}
