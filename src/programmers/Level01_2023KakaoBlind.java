package programmers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// 2023 KAKAO BLIND RECRUITMENT > 개인정보 수집 유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class Level01_2023KakaoBlind {

    public static void main(String[] args) {
        int[] answer01 = solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        for (int i : answer01) {
            System.out.print(i + " "); // [1, 3]
        }
        System.out.println();


        int[] answer02 = solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
        for (int i : answer02) {
            System.out.print(i + " "); // [1, 4, 5]
        }
        System.out.println();

    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        // 대문자 알파벳 : 약관 종류 개월 수.

        HashMap<String, Integer> termsMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] arr = terms[i].split(" ");
            termsMap.put(arr[0], Integer.parseInt(arr[1]));
        }

        String[] todayDateArr = today.split("\\.");
        LocalDate todayDate = LocalDate.of(Integer.parseInt(todayDateArr[0]), Integer.parseInt(todayDateArr[1]), Integer.parseInt(todayDateArr[2]));

        LocalDate privacieDate;
        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            String[] date = arr[0].split("\\.");
            int term = termsMap.get(arr[1]);

            privacieDate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])); // 년,월,일
            privacieDate = privacieDate.plusMonths(term);

            if (privacieDate.isBefore(todayDate) || privacieDate.equals(todayDate)) {
                list.add(i + 1);
            }

        }
        Collections.sort(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


























