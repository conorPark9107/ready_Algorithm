package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon_14500 {

    public static int[][] array;
    public static int[][] score;
    public static boolean[][] visited;
    public static int x, y;

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        x = Integer.parseInt(s[0]);
        y = Integer.parseInt(s[1]);

        array = new int[x][y];
        score = new int[x][y];
        visited = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                array[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                getMaxValue(i, j);
            }
        }

    }

    private static int getMaxValue(int i, int j) {

        int[] mx = {-1, 1, 0, 0};
        int[] my = {0, 0, -1, 1};

        int max = 0;

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {i, j, array[i][j]});

        while(!stack.isEmpty()){

            for (int xy = 0; xy < 4; xy++) {

                int[] popData = stack.peek();
                int popX = popData[0];
                int popY = popData[1];

                int nx = popX + mx[xy];
                int ny = popY + my[xy];

                if(nx < 0 || nx >= x || ny < 0 || ny >= y) continue;

                if(stack.size() < 4 && !visited[nx][ny]){
                    stack.push(new int[]{nx, ny, stack.peek()[2] + array[nx][ny]});
                    visited[nx][ny] = true;
                    break;
                }else{
                    max = Math.max(max, stack.pop()[2]);
                }
            }
        }
        return max;

    }
}
