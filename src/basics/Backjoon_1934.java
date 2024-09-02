package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Backjoon_1934 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int result = lcm(a, b);

            System.out.println(result);

        }

    }

    private static int lcm(int a, int b) {
        return  a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }


}
