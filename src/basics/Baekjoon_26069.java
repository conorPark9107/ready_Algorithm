package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 붙임성 좋은 총총이
// https://www.acmicpc.net/problem/26069
public class Baekjoon_26069 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            String a = inputs[0];
            String b = inputs[1];

            if(set.contains(a) || set.contains(b)){
                set.add(a);
                set.add(b);
            }
        }
        System.out.println(set.size());

    }

}
