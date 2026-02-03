package programmers;

// N-Queen
// https://school.programmers.co.kr/learn/courses/30/lessons/12952
public class Level02_N_Queen {



    public static void main(String[] args) {
        Level02_N_Queen o = new Level02_N_Queen();
        int ans = o.solution(4); // 2
        System.out.println(ans);
    }

    int n = 0;
    int answer = 0;
    int[] col;
    public int solution(int n) {
        this.n = n;
        col = new int[n];
        dfs(0);
        return answer;
    }

    public void dfs(int row) {
        if(row == n) {
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
            col[row] = i;
            if(isPossible(row)){
                dfs(row + 1);
            }
        }
    }

    public boolean isPossible(int row) {
        for (int i = 0; i < row; i++) {
            if(col[i] == col[row]) return false;
            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
        }
        return true;
    }


    public void dfs01(int row) {
        if(row == n) { // 행의 개수가 곧 퀸의 개수이기 때문에 행과 n이 같을 경우 퀸은 모두 배치가 된것이다.
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
            col[row] = i;
            if(isPossible(row)){ // 현재 행과 열에 퀸을 배치할 수 있다면 다음 행으로.
                dfs(row + 1); // 다음행. depth + 1 == queen의 개수.
            }
        }
    }

    public boolean isPossible01(int row) {
        for (int i = 0; i < row; i++) { // 현재 퀸을 배치하기 전에 이전 퀸들을 비교하기 위해 반복한다.
            if(col[i] == col[row]) return false; // 같은 열에 있는지 확인하기 위함.
            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false; // 같은 대각선 라인에 존재하는지 확인. 절대값으로 비교해야 한다. 양수나 음수나 같은 대각라인으로 볼수 있기 때문에
        }
        return true; // 모든 조건을 통과 했다면 현재 행,열에 퀸을 배치할 수 있다는 것이다.
    }

}
