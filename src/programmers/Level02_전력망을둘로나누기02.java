package programmers;

import java.util.ArrayList;

// 전력망을 둘로 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/86971
public class Level02_전력망을둘로나누기02 {

    public static void main(String[] args) {
        Level02_전력망을둘로나누기02 o = new Level02_전력망을둘로나누기02();
        System.out.println(o.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})); // 3
        System.out.println(o.solution(4, new int[][]{{1,2},{2,3},{3,4}})); // 0
        System.out.println(o.solution(7, new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}})); // 1
    }

    public int solution(int n, int[][] wires) {
        int answer = n;
        ArrayList<Integer>[] arr = new ArrayList[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < wires.length; i++) {
            int s = wires[i][0];
            int e = wires[i][1];
            arr[s].add(e);
            arr[e].add(s);
        }

        for (int i = 0; i < wires.length; i++) {
            int x = dfs(arr, wires[i][0], wires[i][0], wires[i][1], new boolean[n + 1]);
            answer = Math.min(answer, Math.abs((n - x) - x));
        }


        return answer;
    }

    public int dfs(ArrayList<Integer>[] arr, int current, int cutA, int cutB,  boolean[] visited) {
        visited[current] = true;
        int count = 1;
        for (int node : arr[current]) {
            if(visited[node]) continue;
            if(current == cutA && node == cutB || current == cutB && node == cutA) continue;
            count += dfs(arr, node, cutA, cutB, visited);
        }
        return count;
    }

}
