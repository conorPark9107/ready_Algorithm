package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 요세푸스 문제
// https://www.acmicpc.net/problem/11866
public class Backjoon_11866 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");
        while (!deque.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                deque.add(deque.poll());
            }
            sb.append(deque.poll()).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length(), ">");

        System.out.println(sb);
    }
}
