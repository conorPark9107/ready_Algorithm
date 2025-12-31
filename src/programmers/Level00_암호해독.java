package programmers;

// 암호해독
// https://school.programmers.co.kr/learn/courses/30/lessons/120892
public class Level00_암호해독 {

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4)); // attack
        System.out.println(solution("pfqallllabwaoclk", 2)); // fallback
    }

    public static String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i += code) {
            answer += cipher.charAt(i - 1);
        }
        return answer;
    }

}
