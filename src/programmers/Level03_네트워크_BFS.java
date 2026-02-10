package programmers;

import java.util.ArrayDeque;

// 네트워크
// https://school.programmers.co.kr/learn/courses/30/lessons/43162
public class Level03_네트워크_BFS {

    public static void main(String[] args) {
        Level03_네트워크_BFS o = new Level03_네트워크_BFS();
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
        System.out.println(o.solution(4, new int[][]{
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        })); // 4
        System.out.println(o.solution(3, new int[][]{
                {1,1,0},
                {0,1,0},
                {0,0,1}
        })); // 2
        System.out.println(o.solution(3, new int[][]{
                {1,1,0},
                {1,1,1},
                {0,1,1}
        })); // 1
        System.out.println(o.solution(6, new int[][]{
                {1,1,1,0,0,0},
                {1,1,1,0,0,0},
                {1,1,1,0,0,0},
                {0,0,0,1,1,1},
                {0,0,0,1,1,1},
                {0,0,0,1,1,1}
        })); // 2
        System.out.println(o.solution(5, new int[][]{
                {1,1,0,0,0},
                {1,1,1,0,0},
                {0,1,1,1,0},
                {0,0,1,1,1},
                {0,0,0,1,1}
        })); // 1

    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < computers.length; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.offer(i);

            while (!q.isEmpty()) {
                int poll = q.poll();
                int[] com = computers[poll];
                for (int j = 0; j < n; j++) {
                    if(com[j] == 1 && !visited[j]){
                        visited[j] = true;
                        q.offer(j);
                    }
                }
            }

            answer++;
        }
        return answer;
    }
}
