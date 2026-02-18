package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 모의 고사
// https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Level01_모의고사 {

    public static void main(String[] args) {
        Level01_모의고사 o = new Level01_모의고사();
        int[] arr = o.solution(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = o.solution(new int[]{1, 3, 2, 4, 2});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public int[] solution(int[] answers) {
        int[] c = new int[3];
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            int x = answers[i];
            if (x == p1[i % p1.length]) c[0]++;
            if (x == p2[i % p2.length]) c[1]++;
            if (x == p3[i % p3.length]) c[2]++;
        }

        int max = Arrays.stream(c)
                .max()
                .getAsInt();
        
        for (int i = 0; i < 3; i++) if (max == c[i]) list.add(i + 1);


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


    public int[] solution01(int[] answers) {
        int[] c = new int[3];
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            int x = answers[i];
            if (x == p1[i % p1.length]) c[0]++;
            if (x == p2[i % p2.length]) c[1]++;
            if (x == p3[i % p3.length]) c[2]++;
        }

        int max = c[0];
        for (int i = 1; i < 3; i++) {
            if (c[i] > c[i - 1]) {
                max = c[i];
            }
        }

        int index = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) if (c[i] == max) count++;

        int[] answer = new int[count];
        for (int i = 0; i < 3; i++) if (c[i] == max) answer[index++] = i + 1;

        return answer;
    }

}
