package basics;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 큐 2
// https://www.acmicpc.net/problem/18258
public class Backjoon_18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String command = arr[0];

            switch (command) {
                case "push" -> deque.offer(Integer.parseInt(arr[1]));
                case "pop" -> {
                    if (!deque.isEmpty()) bw.write(deque.poll() + "\n");
                    else bw.write(-1 + "\n");
                }
                case "size" -> bw.write(deque.size() + "\n");
                case "empty" -> bw.write((deque.isEmpty() ? 1 : 0)  + "\n");
                case "front" -> {
                    if (!deque.isEmpty()) bw.write(deque.peekFirst() + "\n");
                    else bw.write(-1 + "\n");
                }
                case "back" -> {
                    if(!deque.isEmpty()) bw.write(deque.peekLast() + "\n");
                    else bw.write(-1 + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

