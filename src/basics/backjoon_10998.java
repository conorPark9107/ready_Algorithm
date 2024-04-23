package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 팰린드롬, 10988번, 문자열 reverse
public class backjoon_10998 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String reverse = new StringBuffer(input).reverse().toString();

        int isPalindrome = 0;
        if (input.equals(reverse)) isPalindrome = 1;

        System.out.println(isPalindrome);
    }

}
