package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 배열 만들기2
// https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class Level00_배열만들기2 {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.parseInt(Integer.toBinaryString(2)));


        System.out.println("-----------------------------------");


        int[] arr = solution(5, 555);
        Arrays.stream(arr).forEach(value -> {
            System.out.print(value + " ");
        }); // 5, 50, 55, 500, 505, 550, 555

        System.out.println();

        int[] arr2 = solution(10, 20);
        Arrays.stream(arr2).forEach(System.out::print); // -1
    }

    public static int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = l; i <= r; i++){
            String s = String.valueOf(i);
            boolean isMatch = s.matches("^[05]+$");
            if(isMatch){
                list.add(i);
            }
        }
        if(list.isEmpty()) return new int[] {-1};

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
