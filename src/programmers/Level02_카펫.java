package programmers;


import java.util.Arrays;

// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Level02_카펫 {

    public static void main(String[] args) {
        Level02_카펫 o = new Level02_카펫();
        int[] arr = o.solution(10, 2);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [4, 3]
        System.out.println();
        System.out.println("---------------");

        arr = o.solution(8, 1);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [3, 3]
        System.out.println();
        System.out.println("---------------");

        arr = o.solution(24, 24);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [8, 6]
        System.out.println();
        System.out.println("---------------");

    }


    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for (int h = 3; h * h <= total; h++) {

            if (total % h == 0) { // 약수일때.
                int w = total / h;
                if ((h - 2) * (w - 2) == yellow) {
                    return new int[]{w, h};
                }
            }
        }
        return answer;
    }

}

