package programmers;

import java.util.Arrays;

// 세 개의 구분자
// https://school.programmers.co.kr/learn/courses/30/lessons/181862
public class Level00_세개의구분자 {

    public static void main(String[] args) {
        String[] arr = solution("baconlettucetomato");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["onlettu", "etom", "to"]
        System.out.println();

        arr = solution("abcd");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); //  	["d"]
        System.out.println();

        arr = solution("cabab");
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); //  ["EMPTY"]
        System.out.println();
    }

    public static String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("a"))
                                .flatMap(b -> Arrays.stream(b.split("b")))
                                .flatMap(c -> Arrays.stream(c.split("c")))
                                .filter(s -> !s.isEmpty())
                                .toArray(String[]::new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }

}
