package programmers;

import java.util.ArrayDeque;

// 게임 맵 최단거리
// https://school.programmers.co.kr/learn/courses/30/lessons/1844
public class Level02_게임_맵_최단거리 {

    public static void main(String[] args) {
        Level02_게임_맵_최단거리 o = new Level02_게임_맵_최단거리();
        System.out.println(o.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}})); // 11
        System.out.println(o.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}})); // -1
    }

    public int solution(int[][] maps) {
        int answer = 0;
        int[] mX = {0, 0, -1, 1};
        int[] mY = {-1, 1, 0, 0};
        int xl = maps.length;
        int yl = maps[0].length;

        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[][] visited = new int[xl][yl];

        visited[0][0] = 1;
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] arr = q.pollFirst();
            int x = arr[0];
            int y = arr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + mX[i];
                int ny = y + mY[i];

                if(nx >= xl || nx < 0 || ny >= yl || ny < 0) continue;
                if(maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        answer = visited[xl - 1][yl - 1];
        return answer == 0 ? -1 : answer;
    }
}
