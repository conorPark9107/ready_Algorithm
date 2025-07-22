package programmers;

// N의 배수
// https://school.programmers.co.kr/learn/courses/30/lessons/181937
public class Level00_PCCE_N의배수 {

    public static void main(String[] args) {
        System.out.println(solution(98, 2)); // 1
        System.out.println(solution(34, 3)); // 0
    }

    public static int solution(int num, int n) {
        return (num % n == 0)? 1 : 0;
    }

}
