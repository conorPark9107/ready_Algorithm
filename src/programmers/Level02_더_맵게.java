package programmers;

import java.util.*;

// 더 맵게 힙(Heap)문제
// https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Level02_더_맵게 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7)); // 2
        System.out.println("---------------------------------");
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 1)); // 0
        System.out.println("---------------------------------");
        System.out.println(solution(new int[]{1, 2, 100}, 50)); // 2
        System.out.println("---------------------------------");
        System.out.println(solution(new int[]{1, 1}, 10)); // -1
        System.out.println("---------------------------------");
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int a : scoville) q.add(a);

        while (q.size() >= 2 && q.peek() < K) {
            int sum = q.poll() + (q.poll() * 2);
            answer++;
            q.add(sum);
        }

        return q.peek() < K ? -1 : answer;
    }


    // 틀린 코드.
    public static int solution01(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int a : scoville) q.add(a);
        int sum = 0;
        while (true) {
            sum = q.poll() + (q.poll() * 2);
            q.add(sum);
            if(sum < K) answer++;
            else break;
        }
        return answer == 0? -1 : answer + 1;
    }

}
