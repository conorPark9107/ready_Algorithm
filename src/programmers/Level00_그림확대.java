package programmers;

import java.util.Arrays;

// 그림확대
// https://school.programmers.co.kr/learn/courses/30/lessons/181836
public class Level00_그림확대 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2);
        Arrays.stream(arr).forEach(s -> System.out.println(s + " "));
        System.out.println();

        arr = solution(new String[]{"x.x", ".x.", "x.x"}, 3);
        Arrays.stream(arr).forEach(s -> System.out.println(s + " "));
        System.out.println();
    }

    public static String[] solution(String[] picture, int k) {
        int height = picture.length;
        String[] answer = new String[height * k];
        int idx = 0;
        for (int i = 0; i < height; i++) {
            String line = picture[i];
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) sb.append(String.valueOf(c).repeat(k));
            for (int j = 0; j < k; j++) answer[idx++] = sb.toString();
        }
        return answer;
    }

}
