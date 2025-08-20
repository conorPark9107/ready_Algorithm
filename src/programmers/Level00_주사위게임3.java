package programmers;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 주사위게임 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class Level00_주사위게임3 {

    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2)); // 2222
        System.out.println(solution(4, 1, 4, 4)); // 1681
        System.out.println(solution(6, 3, 3, 6)); // 27
        System.out.println(solution(2, 5, 2, 6)); // 30
        System.out.println(solution(6, 4, 2, 5)); // 2
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        int size = map.size();
        if(size == 4){
            answer = map.keySet().stream()
                    .min(Integer::compareTo)
                    .get();
        }else if(size == 1){
            answer = 1111 * a;
        }else if(size == 3){
            answer = map.entrySet().stream()
                    .filter(e -> e.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .reduce(1, (x, y) -> x * y);
        }else if(size == 2){
            List<Integer> keys = new ArrayList<>(map.keySet());
            int key1 = keys.get(0);
            int key2 = keys.get(1);
            int val1 = map.get(key1);
            int val2 = map.get(key2);

            if(val1 == 3 || val2 == 3){
                int p = (val1 == 3)? key1 : key2;
                int q = (val1 == 1)? key1 : key2;
                answer = (int) Math.pow(10 * p + q, 2);
            }else{
                int p = key1;
                int q = key2;
                answer = (p + q) * Math.abs(p - q);
            }
        }
        return answer;
    }


//    public static int solution(int a, int b, int c, int d) {
//        int answer = 0;
//        int[] arr = new int[7];
//        arr[a]++;
//        arr[b]++;
//        arr[c]++;
//        arr[d]++;
//
//        for (int i = 1; i < arr.length; i++) {
//            int count = arr[i];
//            if(count == 4){
//                return 1111 * i;
//            }else if(count == 3){
//                return (int) Math.pow(10 * i + get1Q(arr), 2);
//            }else if(count == 2) {
//                int count2 = 1;
//                int y = 0;
//                for (int j = i + 1; j < arr.length; j++){
//                    if(arr[j] == 2){
//                        count2++;
//                        y = j;
//                    }else if(arr[j] == 1){
//                        y = 1;
//                        y *= j;
//                    }
//                }
//                if(count2 == 2){
//                    return (i + y) * Math.abs(i - y);
//                }else{
//                    return y;
//                }
//            }
//        }
//        return answer;
//    }
//
//    private static int get1Q(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == 1) return i;
//        }
//        return 0;
//    }
}

