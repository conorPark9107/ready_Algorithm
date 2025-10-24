package programmers;

import java.util.Arrays;

// 문자열 잘라서 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class Level00_문자열잘라정렬 {

    public static void main(String[] args) {
        String[] arr = solution("axbxcxdx");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["a","b","c","d"]

        System.out.println();
        arr = solution("dxccxbbbxaaaa");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["aaaa","bbb","cc","d"]

        System.out.println();
        arr = solution("dxbxcxa");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["aaaa","bbb","cc","d"]

        System.out.println();
        arr = solution01("axbxcxdx");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["a","b","c","d"]

        System.out.println();
        arr = solution01("dxccxbbbxaaaa");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["aaaa","bbb","cc","d"]

        System.out.println();
        arr = solution("bbxba");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["ba", "bb"]
    }

    public static String[] solution(String myString) {
        String[] answer = myString.split("x");
        return Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }

    // 역순으로 만들어보자. ( 첫글자만 비교하게된다.)
    public static String[] solution01(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer, (o1, o2) -> o2.charAt(0) - o1.charAt(0));
        return answer;
    }

}
