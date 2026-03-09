package programmers;

import java.util.ArrayDeque;

// 게임 맵 최단거리
// https://school.programmers.co.kr/learn/courses/30/lessons/1844
public class Level02_게임_맵_최단거리02 {

    public static void main(String[] args) {
        Level02_게임_맵_최단거리02 o = new Level02_게임_맵_최단거리02();
        System.out.println(o.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}})); // 11
        System.out.println(o.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}})); // -1
    }

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        visited[0][0] = 1;
        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx < 0 || cx >= n || cy < 0 || cy >= m) continue;

                if (visited[cx][cy] == 0 && maps[cx][cy] == 1) {
                    visited[cx][cy] = visited[x][y] + 1;
                    q.offer(new int[]{cx, cy});
                }
            }
        }
        int arrived = visited[n - 1][m - 1];
        return arrived == 0 ? -1 : arrived;
    }
}
