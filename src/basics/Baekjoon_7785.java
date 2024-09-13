package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// 회사에 있는 사람
// https://www.acmicpc.net/problem/7785
public class Baekjoon_7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            map.put(arr[0], arr[1]);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            return o2.compareTo(o1);
        });

        StringBuilder sb = new StringBuilder();
        for (String key : list) {
            if (map.get(key).equals("enter")) {
                sb.append(key).append("\n");
            }
        }
        System.out.println(sb.delete(sb.length()-1, sb.length()));

    }
}
