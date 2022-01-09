package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 요세푸스 문제
// https://www.acmicpc.net/problem/1158
public class Queue_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        Queue<Integer> persons = new LinkedList<>();
        for(int i = 1; i <= N; i++)
        {
            persons.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        while(!persons.isEmpty()) {
            int pollNumber = persons.poll();
            if (count < K) {
                count++;
                persons.offer(pollNumber);
                continue;
            }

            count = 1;
            sb.append(pollNumber + ", ");
        }
        System.out.println("<" + sb.replace(sb.length()-2, sb.length(), "").toString() + ">");
    }
}
