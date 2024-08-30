package basics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 약수 구하기
// https://www.acmicpc.net/problem/2501
public class Backjoon_2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                count++;
                if(count == q){
                    answer = i;
                    break;
                }
            }
        }

        System.out.println(answer);

    }

}
