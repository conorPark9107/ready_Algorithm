package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 서로 다른 부분 문자열의 개수
// https://www.acmicpc.net/problem/11478
public class Baekjoon_11478 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 1;
        HashSet<String> set = new HashSet<>();
        while (count <= str.length()) {

            for (int i = 0; i < str.length(); i++) {
                if (i + count <= str.length()) {
                    String temp = str.substring(i, i + count);
                    set.add(temp);
                }
            }
            count++;
        }

        System.out.println(set.size());
    }
}