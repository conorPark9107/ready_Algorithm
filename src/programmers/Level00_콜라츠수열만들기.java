package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 콜라츠 수열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181919
public class Level00_콜라츠수열만들기 {

    public static void main(String[] args) {
        int[] arr = solution(10);
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [10, 5, 16, 8, 4, 2, 1]
    }

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n > 1){
            n = (n % 2 == 0) ? n / 2
                             : 3 * n + 1;
            list.add(n);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
