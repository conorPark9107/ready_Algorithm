package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 약수들의 합
// https://www.acmicpc.net/problem/9506
public class Backjoon_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input = null;
        while (!(input = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);
            sb = new StringBuilder();

            sb.append(n).append(" = ");
            sb.append(1);

            int sum = 1;
            for (int i = 2; i <= n / 2; i++) {
                if(n % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (n == sum) {
                System.out.println(sb.toString());
            }else{
                System.out.println(n + " is NOT perfect.");
            }

        }
    }
}
