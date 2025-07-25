package programmers;


// flag에 따라 다른 값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class Level00_다른값반환하기 {

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }

    public static int solution(int a, int b, boolean flag) {
        return (flag)? a + b : a - b;
    }

}
