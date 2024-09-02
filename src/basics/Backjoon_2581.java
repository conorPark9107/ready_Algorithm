package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 소수
// https://www.acmicpc.net/problem/2581
public class Backjoon_2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10000;

        for(int i = n; i <= m; i++){
            int count = 0;

            if(i == 1) continue;

            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0){
                min =  Math.min(min, i);
                sum += i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
