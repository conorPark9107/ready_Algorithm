package programmers;

// 네트워크
// https://school.programmers.co.kr/learn/courses/30/lessons/43162
public class Level03_네트워크 {

    public static void main(String[] args) {
        Level03_네트워크 o = new Level03_네트워크();
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
        System.out.println(o.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                dfs(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < computers.length; j++) {
            if(computers[i][j] == 1 && !visited[j]){
                dfs(computers, j, visited);
            }
        }
    }

    public int solution01(int n, int[][] computers) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(computers[i][i] == 1){
                dfs01(computers, i);
                answer++;
            }
        }
        return answer;
    }

    private void dfs01(int[][] computers, int x) {
        computers[x][x] = 0;
        for (int y = 0; y < computers.length; y++) {
            if(computers[x][y] == 1 && computers[y][y] == 1){
                dfs01(computers, y);
            }
        }
    }

}
