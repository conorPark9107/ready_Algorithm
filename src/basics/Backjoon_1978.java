package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 소수 찾기
// https://www.acmicpc.net/problem/1978
public class Backjoon_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");


        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(inputs[i]);

            if(num == 1) continue;

            int count = 0;

            for(int j = 2; j <= num / 2; j++){
                if(num % j == 0){
                    count++;
                    break;
                }
            }

            if(count == 0) result++;

        }

        System.out.println(result);
    }
}
