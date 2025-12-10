package programmers;

import java.util.Arrays;

// 분수의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120808
public class Level00_분수의덧셈 {

    public static void main(String[] args) {
        int[] arr = solution(1,2,3,4); // 5, 4
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(9,2,1,3); // 29, 6
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(2, 4, 2, 4); // 1, 1
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution(5, 2, 5, 2); // 5, 1
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);
        answer[0] = numer / gcd;
        answer[1] = denom / gcd;
        return answer;
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
