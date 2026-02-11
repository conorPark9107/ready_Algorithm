package programmers;

import java.util.ArrayDeque;

public class Level02_타겟넘버02 {

    public static void main(String[] args) {
        Level02_타겟넘버 o = new Level02_타겟넘버();
        System.out.println(o.solution(new int[]{1, 1, 1, 1, 1}, 3)); // 5
        System.out.println(o.solution(new int[]{4, 1, 2, 1}, 4)); // 2
        System.out.println(o.solution(new int[]{1}, 1)); // 1
    }


    public int solution(int[] numbers, int target) {
        int answer = 0;

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0}); // [index, current]

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int index = arr[0];
            int current = arr[1];

            if (index == numbers.length) {
                if(current == target) answer++;
                continue;
            }

            int next = numbers[index];
            q.offer(new int[]{index + 1, current + next});
            q.offer(new int[]{index + 1, current - next});
        }
        return answer;
    }


    public int solution01(int[] numbers, int target) {
        return dfs01(numbers, target, 0, 0);
    }

    public int dfs01(int[] numbers, int target, int current, int i) {
        if (i == numbers.length){
            if (current == target) return 1;
            return 0;
        }
        return dfs01(numbers, target, current + numbers[i], i+1) +
               dfs01(numbers, target, current - numbers[i], i+1) ;
    }
}
