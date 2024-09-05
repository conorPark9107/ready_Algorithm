package basics;

import java.io.*;
import java.util.StringTokenizer;

// 소수구하기
// https://www.acmicpc.net/problem/1929
public class Backjoon_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // (1 ≤ M ≤ N ≤ 1,000,000)
        boolean[] isPrime = new boolean[1000002];

        isPrime[0] = true;
        isPrime[1] = true;

        for(int i = 2; i < isPrime.length; i++){
            if(!isPrime[i]){
                for (int j = i + i; j < isPrime.length; j += i) {
                    if(!isPrime[j]) isPrime[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if(!isPrime[i]) bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }


    public void solution(boolean[] isPrime, int n){

        // 나보다 더 좋은 코드를 작성하신분의 코드.
        // 최대 입력값이 1000000이라고 해도 모든 값에 대하여 소수 판별할 필요는 없었다.
        // 최댓값인 n까지만 판별하면 되었음.
        for(int i = 2; i * i <= n; i++){
            if(!isPrime[i]){
                for (int j = i + i; j <= n; j += i) {
                    if(!isPrime[j]) isPrime[j] = true;
                }
            }
        }
    }


}


