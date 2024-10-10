package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 칸토어 집합
// https://www.acmicpc.net/problem/4779
public class Recursion_4779 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            String s = "-".repeat((int)Math.pow(3, Integer.parseInt(line)));
            System.out.println(recursion(s));
        }

    }

    private static String recursion(String s) {
        if(s.length() <= 1) return s;
        else{
            int l = s.length() / 3;
            return recursion(s.substring(0, l)) + " ".repeat(l) + recursion(s.substring(l + l));
        }
    }

}
