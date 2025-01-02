package programmers;

import java.util.Arrays;

// 최솟값 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
public class Level02_MadeMinValue {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4})); // 29
        System.out.println(solution(new int[]{1,2}, new int[]{3,4})); // 10
    }

    public static int solution(int []A, int []B){
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int x = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[x--];
        }

        return answer;
    }

}
