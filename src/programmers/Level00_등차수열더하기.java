package programmers;

// 등차수열 특정 항만 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181931
public class Level00_등차수열더하기 {

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true})); // 37
        System.out.println(solution(7, 1, new boolean[]{false, false, false, true, false, false, false})); // 10
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int now = a;

        for (boolean b : included) {
            if (b) {
                answer += now;
            }
            now += d;
        }

        return answer;
    }

}
