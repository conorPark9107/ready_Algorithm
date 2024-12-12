package programmers;

import java.util.Arrays;

// 비밀지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Level01_secretMap {

    public static void main(String[] args) {
//        String[] answer = solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
//        for (String a : answer) {
//            System.out.println(a);
//        }
//
//        String[] answer2 = solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
//        for (String a : answer2) {
//            System.out.println(a);
//        }
//
//        String[] answer3 = solution(1, new int[]{1}, new int[]{0});
//        for (String a : answer3) {
//            System.out.println(a);
//        }
//
//        String[] answer4 = solution(16, new int[]{0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0}, new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0});
//        for (String a : answer4) {
//            System.out.println(a);
//        }
//        String[] answer = solution(16, new int[]{55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000,55000}, new int[]{50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000});
//        for (String a : answer) {
//            System.out.println(a);
//        }


    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            answer[i] = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i])));
        }

        answer = Arrays.stream(answer)
                .map(s -> s.replace("1", "#"))
                .map(s -> s.replace("0", " "))
                .toArray(String[]::new);

        return answer;
    }

}
