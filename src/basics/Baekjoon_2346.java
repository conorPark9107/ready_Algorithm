package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 풍선 터뜨리기
// https://www.acmicpc.net/problem/2346
public class Baekjoon_2346 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            deque.add(new int[] {i + 1, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();

        int[] balloon = deque.pollFirst();
        sb.append(balloon[0]).append(" ");
        int repeat = balloon[1];
        while (!deque.isEmpty()) {

            if(repeat > 0){
                for (int i = 0; i < repeat - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                balloon = deque.pollFirst();
            }else{
                for (int i = 0; i < Math.abs(repeat) - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                balloon = deque.pollLast();
            }

            sb.append(balloon[0]).append(" ");
            repeat = balloon[1];
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}


