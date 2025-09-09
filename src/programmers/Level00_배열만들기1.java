package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 배열 만들기1
//  https://school.programmers.co.kr/learn/courses/30/lessons/181901
public class Level00_배열만들기1 {

    public static void main(String[] args) {
        int[] arr = solution(10, 3);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

        System.out.println();

        arr = solution(15, 5);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
    }

    public static int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = k; i <= n; i+=k){
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution01(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = k; i <= n; i+=k){
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
