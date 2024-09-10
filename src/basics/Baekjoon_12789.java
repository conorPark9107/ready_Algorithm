package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 도키도키 간식드리미
// https://www.acmicpc.net/problem/12789
public class Baekjoon_12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int passNum = 1;

        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());

            if (passNum == number) {
                passNum++;
            }else{
                stack.push(number);
            }

            while (!stack.isEmpty() && stack.peek() == passNum) {
                passNum++;
                stack.pop();
            }
        }

        if(stack.isEmpty()){ System.out.println("Nice");}
        else{ System.out.println("Sad");}
    }
}




//    int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//        array[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//        firstPlace.push(array[i]);
//        }
//
//        int needNum = 1;
//        boolean status = true;
//        while (status) {
//
//        int peek = 0;
//        boolean isPopFirst = false;
//        if (!firstPlace.isEmpty()) {
//        peek = firstPlace.peek();
//        if (peek == needNum) {
//        firstPlace.pop();
//        needNum++;
//        } else {
//        if (secondPlace.isEmpty()) {
//        secondPlace.push(firstPlace.pop());
//        } else {
//        if (secondPlace.peek() != needNum) {
//        secondPlace.push(firstPlace.pop());
//        }
//        }
//        }
//        } else {
//        isPopFirst = true;
//        }
//
//        boolean isPopSecond = false;
//        if (!secondPlace.isEmpty()) {
//        peek = secondPlace.peek();
//        if (peek == needNum) {
//        secondPlace.pop();
//        needNum++;
//        } else {
//        isPopSecond = true;
//        }
//        } else {
//        isPopSecond = true;
//        }
//
//        if (isPopFirst && isPopSecond) {
//        status = false;
//        }
//        }
//
//        System.out.println(needNum - 1 == n ? "Nice" : "Sad");