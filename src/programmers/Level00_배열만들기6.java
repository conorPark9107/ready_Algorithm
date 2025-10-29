package programmers;

import java.util.Arrays;
import java.util.Stack;

// 배열반들기 6
// https://school.programmers.co.kr/learn/courses/30/lessons/181859
public class Level00_배열만들기6 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{0,1,1,1,0});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [0, 1, 0]
        System.out.println();

        arr = solution(new int[]{0,1,1,0});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [0, 1, 0, 1, 0]
        System.out.println();

        arr = solution(new int[]{0,1,1,1,0});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [-1]
        System.out.println();
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int value : arr) {
            if(stk.isEmpty()) stk.push(value);
            else if(stk.peek() == value) stk.pop();
            else stk.push(value);
        }
        int[] answer = stk.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }

}
