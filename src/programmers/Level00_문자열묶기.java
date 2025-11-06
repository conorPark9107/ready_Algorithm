package programmers;

import java.util.Arrays;

// 문자열 묶기
// https://school.programmers.co.kr/learn/courses/30/lessons/181855
public class Level00_문자열묶기 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }

    public static int solution(String[] strArr) {
        int[] countArr = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            countArr[strArr[i].length()]++;
        }
        return Arrays.stream(countArr).max().getAsInt();
    }

}
