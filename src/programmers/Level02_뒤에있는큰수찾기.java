package programmers;

import java.util.Arrays;
import java.util.Stack;

// 뒤에 있는 큰 수 찾기
public class Level02_뒤에있는큰수찾기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{2, 3, 3, 5});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // 	[3, 5, 5, -1]
        System.out.println();

        arr = solution(new int[]{9, 1, 5, 3, 6, 2});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [-1, 5, 6, 6, -1, -1]
        System.out.println();

        arr = solution(new int[]{2, 2, 3, 4, 5, 5, 6});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [3, 3, 4, 5, 6, 6, -1]
        System.out.println();
    }

    public static int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            int now = numbers[i];
            while (!stack.isEmpty() && stack.peek() <= now) {
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(now);
        }
        return answer;
    }

    public static int[] solution01(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int b = numbers[j];
                if(b > a) {
                    answer[i] = b;
                    break;
                }
            }
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }

}
