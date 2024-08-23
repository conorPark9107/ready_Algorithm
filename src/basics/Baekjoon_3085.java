package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사탕 게임
// https://www.acmicpc.net/problem/3085
public class Baekjoon_3085 {

    public static char[][] array;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        array = new char[N][N];


        for (int i = 0; i < N; i++) {
            char[] inputs = br.readLine().toCharArray();
            for (int y = 0; y < N; y++) {
                array[i][y] = inputs[y];
            }
        }

        int max = 1;

        // 행
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - 1; j++) {
                swap(i, j, i, j + 1);
                max = Math.max(max, check());
                swap(i, j + 1, i, j);
            }
        }

        // 열
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                swap(j, i, j + 1, i);
                max = Math.max(max, check());
                swap(j + 1, i, j, i);
            }
        }

        System.out.println(max);

    }

    private static int check() {
        int max = 1;

        // 행
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if(array[i][j] == array[i][j+1]){
                    count++;
                    max = Math.max(max, count);
                }else{
                    count = 1;
                }
            }
        }
        
        // 열
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if(array[j][i] == array[j + 1][i]){
                    count++;
                    max = Math.max(max, count);
                }else{
                    count = 1;
                }
            }
        }
        return max;
    }

    private static void swap(int i, int j, int x, int y) {
        char temp = array[i][j];
        array[i][j] = array[x][y];
        array[x][y] = temp;
    }


}
