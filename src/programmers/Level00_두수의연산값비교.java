package programmers;

// 두 수의 연산값 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181938
public class Level00_두수의연산값비교 {

    public static void main(String[] args) {
        System.out.println(solution(2, 91)); // 364
        System.out.println(solution(91, 2)); // 912
    }

    public static int solution(int a, int b) {
        return Math.max(Integer.parseInt("" + a + b) , 2 * a * b);
    }
}
