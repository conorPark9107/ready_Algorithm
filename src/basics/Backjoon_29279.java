package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 덱 2
// https://www.acmicpc.net/problem/29279
public class Backjoon_29279 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1 -> deque.addFirst(Integer.parseInt(st.nextToken()));
                case 2 -> deque.addLast(Integer.parseInt(st.nextToken()));
                case 3 -> {
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                }
                case 4 -> {
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                }
                case 5 -> sb.append(deque.size()).append("\n");
                case 6 -> {
                    if (deque.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                }
                case 7 -> {
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.getFirst()).append("\n");
                }
                case 8 -> {
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.getLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
