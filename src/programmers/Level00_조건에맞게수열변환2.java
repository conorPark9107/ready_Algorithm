package programmers;

import java.util.Arrays;

// 조건에 맞게 수열 변환하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181881
public class Level00_조건에맞게수열변환2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98})); // 5
        System.out.println(solution(new int[]{99, 99, 99})); // 0
    }

    public static int solution(int[] arr) {
        int count = 0;
        while(true){
            int[] next = Arrays.stream(arr)
                  .map(n -> n >= 50 && n % 2 == 0 ? n / 2
                          : n < 50  && n % 2 == 1 ? n * 2 + 1
                          : n)
                  .toArray();

            if(Arrays.equals(arr, next)) break;

            arr = next;
            count++;
        }

        return count;
    }

}
