package programmers;

// 부분 문자열 확인하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181843
public class Level00_부분문자열확인하기 {

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana")); // 1
        System.out.println(solution("banana", "wxyz")); // 0
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

}
