package programmers;

// 피로도
// https://school.programmers.co.kr/learn/courses/30/lessons/87946
public class Level02_피로도 {

    public static void main(String[] args) {
        Level02_피로도 o = new Level02_피로도();
        System.out.println(o.solution(80, new int[][]{{80,20},{50,40},{30,10}})); // 3
    }


    public int solution(int k, int[][] dungeons) {
        return dfs(0, k, dungeons, new boolean[dungeons.length]);
    }

    private int dfs(int cleared, int k, int[][] dungeons, boolean[] visited) {
        int answer = cleared;

        for (int i = 0; i < dungeons.length; i++) {
            if(visited[i]) continue;
            int minimun = dungeons[i][0];
            int cost = dungeons[i][1];

            if(k >= minimun){
                visited[i] = true;
                answer = Math.max(
                            answer,
                            dfs(cleared + 1, k - cost, dungeons, visited)
                        );
                visited[i] = false;
            }
        }
        return answer;
    }


//    int answer = 0;
//    public int solution01(int k, int[][] dungeons) {
//        dfs01(0, k, dungeons, new boolean[dungeons.length]);
//        return answer;
//    }
//
//    private void dfs01(int cleared, int k, int[][] dungeons, boolean[] visited) {
//        if(k == 0) return;
//
//        for (int i = 0; i < dungeons.length; i++) {
//            if(visited[i]) continue;
//
//            int[] dungeon = dungeons[i];
//
//            visited[i] = true;
//            if(k >= dungeon[0]){
//                dfs01(cleared + 1, k - dungeon[1], dungeons, visited);
//                answer = Math.max(answer, cleared + 1);
//            }
//            visited[i] = false;
//        }
//    }
}
