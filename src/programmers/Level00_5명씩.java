package programmers;

import java.util.Arrays;

// 5명씩
// https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Level00_5명씩 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["nami", "vex"]
        System.out.println();

        arr = solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["nami"]
        System.out.println();

        arr = solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "garen", "ahri", "jayce", "1", "ivern", "ahri"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["nami"]
        System.out.println();

    }

    public static String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        for (int i = 0; i * 5 < names.length; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }

}
