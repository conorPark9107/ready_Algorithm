package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementation_2775 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][15];

        for (int i = 1; i < 15; i++) {
            arr[0][i] = i;
        }

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            if(arr[a][b] == 0){
                for (int x = 1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {

                        if(arr[x][y] != 0) continue; // 이미 한번 값을 설정한적이 있다면.

                        int num = 0;
                        for (int z = 1; z <= y; z++) {
                            num += arr[x-1][z];
                        }
                        arr[x][y] = num;

                    }
                }
            }

            System.out.println(arr[a][b]);
        }
    }

}
