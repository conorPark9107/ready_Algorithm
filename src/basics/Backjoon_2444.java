package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_2444 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        // 삼각형
        for (int i = 1; i < N + 1; i++) {
            for (int x = N - i; x > 0; x--) {
                System.out.printf(" ");
            }

            for(int y = 0; y < i * 2 - 1; y++){
                System.out.printf("*");
            }

            System.out.println();
        }

        // 역삼각형
        for (int i = 1; i < N; i++) {

            for (int x = 0; x < i; x++) {
                System.out.printf(" ");
            }

            for(int y = i; y < N * 2 - i - 1; y++){
                System.out.printf("*");
            }

            System.out.println();
        }

    }

}
