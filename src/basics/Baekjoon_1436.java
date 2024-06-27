package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = 1;
        int answer = 666;

        while(count != input){
            answer++;

            if(String.valueOf(answer).contains("666")){
                count++;
            }
        }

        System.out.println(answer);

    }
}
