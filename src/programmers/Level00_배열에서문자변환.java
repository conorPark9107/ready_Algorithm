package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열에서 대소문자 변환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181875
public class Level00_배열에서문자변환 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["aaa","BBB","ccc","DDD"]
        System.out.println();

        arr = solution(new String[]{"aBc", "AbC"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // 	["abc","ABC"]
        System.out.println();
    }

    public static String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0
                        ? strArr[i].toLowerCase()
                        : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }

}
