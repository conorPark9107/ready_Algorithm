package programmers;


// 3진법 뒤집기.
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Level01_reverseTernary {

    public static void main(String[] args) {
        System.out.println(solution(45));  // 7
        System.out.println(solution(125)); // 229
    }

    public static int solution(int n) {
        String s = new StringBuilder(Integer.toString(n, 3))
                        .reverse()
                        .toString();
        return Integer.parseInt(s, 3);
    }
}
