package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;

// 구명보트
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Level02_LifeBoat {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50}, 100)); // 3
        System.out.println(solution(new int[]{70, 80, 50}, 100)); // 3

        // 20 50 50 80 90
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i : people) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            int first = q.peekFirst();
            int last = q.peekLast();
            if((first + last) <= limit){
                q.pollFirst();
                q.pollLast();
            }else{
                q.pollLast();
            }
            answer++;
        }

        return answer;
    }

}


