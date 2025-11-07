package programmers;

import java.util.Arrays;
import java.util.Stack;

// 빈 배열에 추가 삭제
// https://school.programmers.co.kr/learn/courses/30/lessons/181860
public class Level00_빈배열에추가_삭제 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if(flag[i]) {
                for(int j = 0; j < x * 2; j++) stack.push(x);
            }else{
                for(int j = 0; j < x; j++) stack.pop();
            }
        }
        return stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
