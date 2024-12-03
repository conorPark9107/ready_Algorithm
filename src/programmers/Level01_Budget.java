package programmers;

import java.util.Arrays;

// 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Level01_Budget {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));  // 3
        System.out.println(solution(new int[]{2,2,3,3}, 10));   // 4
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if(sum <= budget){
                answer = Math.max(answer, i + 1);
            }
        }

        return answer;
    }
}


// 1 2 3 4  5
// 1 3 6 10 15
// sum + arr[i + 1] > d
// check : sum + arr[i + 2]