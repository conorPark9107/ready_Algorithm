package programmers;


import java.util.HashMap;

// 의상
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Level02_의상 {

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"} })); // 5

        System.out.println(solution(new String[][]{
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"} })); // 3

        System.out.println(solution(new String[][]{
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"},
                {"yellow_hat", "headgear"}})); // 4 + 1 + 1 + 1 = 7

        System.out.println(solution(new String[][]{
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"},
                {"yellow_hat", "headgear"},
                {"green_turban", "eyewear"}})); // 5 + 3 + 3 + 3 + 1
    }


    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) {
            String key = s[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int n : map.values()) {
            answer *= (n + 1);
        }
        return answer - 1;
    }

    // 틀린 코드 처음 작성한 코드. (수학적으로 풀 수 있었다...)
    public static int solution01(String[][] clothes) {
        int answer = clothes.length;
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String v = clothes[i][0];
            String k = clothes[i][1];
            map.put(k, v);
            for (int j = i + 1; j < clothes.length; j++) {
                String k2 = clothes[j][1];
                if(!map.containsKey(k2)){
                    String v2 = clothes[j][0];
                    answer++;
                    map.put(k2, v2);
                }
            }
            map.clear();
        }


        return answer;
    }

}
