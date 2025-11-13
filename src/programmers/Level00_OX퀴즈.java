package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// OX퀴즈
// https://school.programmers.co.kr/learn/courses/30/lessons/120907
public class Level00_OX퀴즈 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["X", "O"]

        System.out.println();

        arr = solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["O", "O", "X", "O"]
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int X = Integer.parseInt(q[0]);
            int Y = Integer.parseInt(q[2]);
            int Z = Integer.parseInt(q[4]);
            int after = 0;
            switch (q[1]){
                case "-" -> {after = X - Y;}
                case "+" -> {after = X + Y;}
            }
            if(after == Z) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }

}
