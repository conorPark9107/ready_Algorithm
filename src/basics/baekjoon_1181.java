package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

// 단어 정렬
// https://www.acmicpc.net/problem/1181
public class baekjoon_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }else{
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (String str : set) {
            System.out.println(str);
        }

    }

}
