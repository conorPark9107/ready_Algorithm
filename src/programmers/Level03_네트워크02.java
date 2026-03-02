package programmers;

// 네트워크
//
public class Level03_네트워크02 {

    public static void main(String[] args) {
        Level03_네트워크02 o = new Level03_네트워크02();
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(computers, visited, i);
            answer++;
        }

        return answer;
    }

    private void dfs(int[][] computers, boolean[] visited, int curr) {
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) continue;
            if (computers[curr][i] == 1) {
                visited[i] = true;
                dfs(computers, visited, i);
            }
        }
    }
}
