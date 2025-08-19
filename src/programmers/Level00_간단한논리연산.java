package programmers;

// 간단한 논리 연산
// https://school.programmers.co.kr/learn/courses/30/lessons/181917
public class Level00_간단한논리연산 {

    public static void main(String[] args) {
        System.out.println(solution(false, true, true, true)); // true
        System.out.println(solution(true, false, false, false)); // false
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

}
