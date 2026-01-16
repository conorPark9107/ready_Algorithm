package programmers;

import java.util.*;
import java.util.stream.Collectors;

// 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Level02_프로세스 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2)); // 1
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0)); // 5
        System.out.println(solution(new int[]{1, 2}, 0)); // 2
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<int[]> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
            pq.offer(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            if (p[0] == pq.peek()) {
                pq.poll();
                answer++;
                if(p[1] == location) return answer;
            }else{
                queue.offer(p);
            }
        }

        return answer;
    }




    // 효율이 좋지못한 나의 첫번쨰 코드. (큐를 새롭게 복사해서 큐의 사이즈가 커지면 커질수록 복잡도가 높아짐)
    public static int solution01(int[] priorities, int location) {
        int answer = 0;
        Deque<int[]> queue = new ArrayDeque<>();

        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }

        if(queue.size() < 2) return 1;

        while (!queue.isEmpty()) {
            int[] pollArr = queue.poll();
            int value = pollArr[0];
            int index = pollArr[1];

            if(hasHigher01(new ArrayDeque<>(queue), value)){
                queue.offer(pollArr);
            }else{
                answer++;
                if(index == location) return answer;
            }
        }
        return answer;
    }

    private static boolean hasHigher01(ArrayDeque<int[]> q, int pollValue) {
        for (int i = 0; i < q.size(); i++) {
            int[] arr = q.poll();
            if(arr[0] > pollValue){
                return true;
            }
        }
        return false;
    }

}
