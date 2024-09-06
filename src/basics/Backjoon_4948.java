package basics;

import java.io.*;

// 베르트랑 공준
// https://www.acmicpc.net/problem/4948
public class Backjoon_4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = 123456 * 2;
        boolean[] isPrime = new boolean[length + 2];

        for (int i = 2; i <= length; i++) {
            if(!isPrime[i]){
                for(int j = i + i; j <= length; j += i){
                    if(!isPrime[j]) isPrime[j] = true;
                }
            }
        }

        int n;
        while((n = Integer.parseInt(br.readLine())) != 0){
            int xn = n * 2; // 2n

            int count = 0;
            for (int i = n + 1; i <= xn; i++) {
                if(!isPrime[i]) count++;
            }
            bw.write(count + "\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }

}
