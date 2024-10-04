package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 인사성 밝은 곰곰이
// https://www.acmicpc.net/problem/26069
public class Baekjoon_25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if(command.equals("ENTER")) {
                answer += map.size();
                map.clear();
                continue;
            }
            map.put(command, 1);
        }
        answer += map.size();

        System.out.println(answer);
    }

}
