package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀의 귀재
// https://www.acmicpc.net/problem/25501
public class Baekjoon_25501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int[] a = isPalindrome(s);
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        System.out.println(sb);
    }

    public static int[] recursion(String s, int l, int r, int c){
        if(l >= r) return new int[]{1, c};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, c};
        else return recursion(s, l+1, r-1, c+1);
    }
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 1);
    }

}
