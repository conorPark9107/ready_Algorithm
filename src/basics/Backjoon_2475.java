package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_2475 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        while (token.hasMoreTokens()) {
            sum += (int)Math.pow(Integer.parseInt(token.nextToken()), 2);
        }

        System.out.println(sum % 10);

    }
}
