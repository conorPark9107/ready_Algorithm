package programmers;

import java.util.*;
import java.util.stream.IntStream;

// 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Level02_프로세스02 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2)); // 1
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0)); // 5
        System.out.println(solution(new int[]{1, 2}, 0)); // 2
        System.out.println(solution(new int[]{2, 1, 3, 2}, 1)); // 4
    }

    public static int solution(int[] priorities, int location) {
        int length = priorities.length;

        int[] maxArr = new int[length];
        System.arraycopy(priorities, 0, maxArr, 0, length);
        Arrays.sort(maxArr);
        int maxIndex = length - 1;

        int[] process = new int[length];
        Arrays.fill(process, -1);
        int score = 1;
        int i = 0;

        while (process[location] == -1) {
            int index = i % length;
            int x = priorities[index];
            if(x == maxArr[maxIndex]){
                maxIndex--;
                process[index] = score;
                score++;
            }
            i++;
        }
        return process[location];
    }
}
