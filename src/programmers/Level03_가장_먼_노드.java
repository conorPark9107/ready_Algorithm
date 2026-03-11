package programmers;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 가장 먼 노드
// https://school.programmers.co.kr/learn/courses/30/lessons/49189
public class Level03_가장_먼_노드 {

    public static void main(String[] args) {
        Level03_가장_먼_노드 o = new Level03_가장_먼_노드();
        System.out.println(o.solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}})); // 3
        System.out.println(o.solution(5, new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 5}
        })); // 1
        System.out.println(o.solution(6, new int[][]{
                {1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}
        })); // 3
        System.out.println(o.solution(4, new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 1}
        })); // 1
        System.out.println(o.solution(6, new int[][]{
                {1, 2}, {1, 3}, {2, 3}, {2, 4}, {3, 5}, {4, 6}
        })); // 1
        System.out.println(o.solution(7, new int[][]{
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {2, 6}, {2, 7}
        })); // 1
        System.out.println(o.solution(6, new int[][]{
                {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 6}
        })); // 1
    }

    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        dist[1] = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int next : graph[curr]) {
                if (dist[next] != -1) continue;
                dist[next] = dist[curr] + 1;
                q.offer(next);
            }
        }

        int max = Arrays.stream(dist).max().getAsInt();

        int answer = 0;
        for (int d : dist) {
            if (d == max) answer++;
        }
        return answer;
    }
}
