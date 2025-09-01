package programmers;

// 접두사인지 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Level00_접두사인지확인하기 {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "abcd"));
        System.out.println(solution("banana", "bananan"));
    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(0, i);
            if(s.equals(is_prefix)) return 1;
        }
        return answer;
    }

}
