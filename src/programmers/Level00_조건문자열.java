package programmers;

// 조건 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class Level00_조건문자열 {
    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50)); // 1
        System.out.println(solution(">", "!", 41, 78)); // 0
        System.out.println(solution(">", "!", 100, 1)); // 1
        System.out.println(solution(">", "=", 1, 1)); // 1
        System.out.println(solution(">", "!", 1, 1)); // 0
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = switch (ineq + eq) {
            case "<=" -> (n <= m) ? 1 : 0;
            case ">=" -> (n >= m) ? 1 : 0;
            case "<!" -> (n < m) ? 1 : 0;
            case ">!" -> (n > m) ? 1 : 0;
            default -> 0;
        };
        return answer;
    }
}
