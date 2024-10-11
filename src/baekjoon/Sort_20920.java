package baekjoon;

import java.io.*;
import java.util.*;

// 영단어 암기는 괴로워
// https://www.acmicpc.net/problem/20920
public class Sort_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if(input.length() < m) continue;
            map.put(input, map.getOrDefault(input, 0) + 1);
        }


//        1. 자주 나오는 단어일수록 앞에 배치한다.
//        2. 해당 단어의 길이가 길수록 앞에 배치한다.
//        3. 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다

        List<String> keys = new LinkedList<>(map.keySet());
        Collections.sort(keys, (o1, o2) -> {
            if (map.get(o1) > map.get(o2)) {
                return -1;
            } else if (map.get(o1) < map.get(o2)) {
                return 1;
            } else { // 나온 수가 같을 경우.

                if (o1.length() > o2.length()) {
                    return -1;
                } else if (o1.length() < o2.length()) {
                    return 1;
                } else { // 길이가 같은 경우.
                    return o1.compareTo(o2);
                }

            }
        });

        for (String key : keys) {
            bw.write(key);
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
