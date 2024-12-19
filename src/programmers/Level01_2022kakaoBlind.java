package programmers;


import java.util.*;

// 신고 결과 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Level01_2022kakaoBlind {

    public static void main(String[] args) {
        int[] answer  = solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2); // 2, 1, 1, 0
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------");
        int[] answer2  = solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3); // 0, 0
        for (int i : answer2) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------");
    }

    // 정확성 100% 코드.
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> countMap = new HashMap<>();

        // 이용자id 신고한id
        for (String re : report) {
            String[] arr = re.split(" ");
            String start = arr[0];
            String end = arr[1];
            HashSet<String> set = reportMap.getOrDefault(start, new HashSet<>());
            set.add(end);
            reportMap.put(start, set);
        }

        for (String key : reportMap.keySet()) {
            HashSet<String> set = reportMap.get(key);
            set.forEach(s -> {
                countMap.put(s, countMap.getOrDefault(s, 0) + 1);
            });
        }

        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            HashSet<String> set = reportMap.getOrDefault(id, new HashSet<>());
            for(String reportedId : set){
                if(countMap.get(reportedId) >= k) answer[i]++;
            }
        }

        return answer;
    }


    // 정확성 75% 코드.
    public static int[] solution02(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, String> reportsMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        // 이용자id 신고한id
        for (String re : report) {
            String[] arr = re.split(" ");
            String end = arr[1];
            reportsMap.put(re, end);
        }

        for(String id : reportsMap.values()){
            countMap.put(id, countMap.getOrDefault(id, 0) + 1);
        }

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            for (String key : reportsMap.keySet()) {
                String[] arr = key.split(" ");
                String start = arr[0];
                String end = arr[1];
                if(name.equals(start) && countMap.get(end) >= k){
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
