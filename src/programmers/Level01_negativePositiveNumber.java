package programmers;

import java.util.Arrays;

// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Level01_negativePositiveNumber {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,7,12}, new boolean[]{true,false,true})); // 9
        System.out.println(solution(new int[]{1,2,3}, new boolean[]{false,false,true})); // 0
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = (signs[i])? answer + absolutes[i] : answer - absolutes[i];
        }

        return answer;
    }
}
