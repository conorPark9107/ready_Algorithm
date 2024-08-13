package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_5622 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = input.length();

        for (int i = 0; i < input.length(); i++) {
            answer += getSumNumber(input.charAt(i));
        }

        System.out.println(answer);
    }

    private static int getSumNumber(char c) {
        int num =
                switch (c) {
                case 'A', 'B', 'C' -> 2;
                case 'D', 'E', 'F' -> 3;
                case 'G', 'H', 'I' -> 4;
                case 'J', 'K', 'L' -> 5;
                case 'M', 'N', 'O' -> 6;
                case 'P', 'Q', 'R', 'S' -> 7;
                case 'T', 'U', 'V' -> 8;
                case 'W', 'X', 'Y', 'Z' -> 9;
                default -> 0;
            };
        return num;
    }
}
