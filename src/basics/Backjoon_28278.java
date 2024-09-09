package basics;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Stack;

// 스택 2
// https://www.acmicpc.net/problem/28278
public class Backjoon_28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int command = Integer.parseInt(arr[0]);

            switch (command) {
                case 1 -> stack.push(Integer.parseInt(arr[1]));
                case 2 -> {
                    if (!stack.isEmpty()) bw.write(stack.pop() + "\n");
                    else bw.write(-1 + "\n");
                }
                case 3 -> bw.write(stack.size() + "\n");
                case 4 -> bw.write((stack.isEmpty() ? 1 : 0)  + "\n");
                case 5 -> {
                    if (!stack.isEmpty()) bw.write(stack.peek() + "\n");
                    else bw.write(-1 + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

