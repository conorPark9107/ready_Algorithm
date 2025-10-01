package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 할일목록
// https://school.programmers.co.kr/learn/courses/30/lessons/181885
public class Level00_할일목록 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["practiceguitar", "studygraph"]

        System.out.println();

        arr = solution02(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["practiceguitar", "studygraph"]
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        int length = 0;
        for (int i = 0; i < finished.length; i++) {
            if(!finished[i]) length++;
        }

        String[] answer = new String[length];
        int index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) answer[index++] = todo_list[i];
        }
        return answer;
    }

    public static String[] solution02(String[] todo_list, boolean[] finished) {
         return IntStream.range(0, todo_list.length)
                 .filter(i -> !finished[i])
                 .mapToObj(i -> todo_list[i])
                 .toArray(String[]::new);
    }

}
