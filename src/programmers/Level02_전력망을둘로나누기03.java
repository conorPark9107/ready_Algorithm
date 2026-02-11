package programmers;

import java.util.ArrayList;

// 전력망을 둘로 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/86971
public class Level02_전력망을둘로나누기03 {


    public static void main(String[] args) {
        Level02_전력망을둘로나누기03 o = new Level02_전력망을둘로나누기03();
        System.out.println(o.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})); // 3
        System.out.println(o.solution(4, new int[][]{{1,2},{2,3},{3,4}})); // 0
        System.out.println(o.solution(7, new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}})); // 1

    }

    public int solution(int n, int[][] wires) {
        int answer = n;

        ArrayList<Integer>[] network = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            network[i] = new ArrayList<>();
        }

        for (int i = 0; i < wires.length; i++) {
            int start = wires[i][0];
            int end = wires[i][1];
            network[start].add(end);
            network[end].add(start);
        }

        for (int i = 0; i < wires.length; i++) {
            boolean[] visited = new boolean[n + 1];
            int cutA = wires[i][0];
            int cutB = wires[i][1];
            visited[cutA] = true;
            int nodes = dfs(network, cutA, cutA, cutB, visited);
            answer = Math.min(answer, Math.abs((n - nodes) - nodes));
        }
        return answer;
    }

    public int dfs(ArrayList<Integer>[] network, int curr, int cutA, int cutB, boolean[] visited) {
        int count = 1;
        for (int node : network[curr]) {
            if(visited[node]) continue;
            if((curr == cutA && node == cutB) ||
               (curr == cutB && node == cutA)) continue;
            visited[node] = true;
            count += dfs(network, node, cutA, cutB, visited);
        }
        return count;
    }

}

