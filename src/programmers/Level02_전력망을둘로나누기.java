package programmers;

import java.util.ArrayList;

// 전력망을 둘로 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/86971
public class Level02_전력망을둘로나누기 {

    public static void main(String[] args) {
        Level02_전력망을둘로나누기 o = new Level02_전력망을둘로나누기();
        System.out.println(o.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})); // 3
        System.out.println(o.solution(4, new int[][]{{1,2},{2,3},{3,4}})); // 0
        System.out.println(o.solution(7, new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}})); // 1

    }

    public int solution(int n, int[][] wires) {
        int answer = 999999999;

        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < wires.length; i++) {
            int start = wires[i][0];
            int end = wires[i][1];
            graph[start].add(end);
            graph[end].add(start);
        }

        for (int[] wire : wires) {
            boolean[] visited = new boolean[n + 1];

            int cutA = wire[0];
            int cutB = wire[1];

            int count = dfs(graph, visited, cutA, cutA, cutB);

            int differece = Math.abs((n - count) - count);
            answer = Math.min(answer, differece);
        }

        return answer;
    }

    private int dfs(ArrayList<Integer>[] graph, boolean[] visited, int current, int cutA, int cutB) {
        int count = 1;
        visited[current] = true;

        for (int next : graph[current]) {

            if(current == cutA && next == cutB
            || current == cutB && next == cutA){
                continue;
            }
            if(!visited[next]){
                count += dfs(graph, visited, next, cutA, cutB);
            }
        }

        return count;
    }

}
