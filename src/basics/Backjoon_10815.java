package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Backjoon_10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] myCard = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        String[] inputCard = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(myCard[i]);
            map.put(num, 1);
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(inputCard[i]);
            int numFromMap = map.getOrDefault(num, 0);

            sb.append(numFromMap).append(" ");
        }

        System.out.println(sb.delete(sb.length() - 1, sb.length()).toString());

    }
}
