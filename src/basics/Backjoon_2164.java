package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 카드 2
// https://www.acmicpc.net/problem/2164
public class Backjoon_2164 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        while (deque.size() != 1) {
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }

        System.out.println(deque.peek());
    }
}
