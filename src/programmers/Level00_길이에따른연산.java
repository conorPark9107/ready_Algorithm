package programmers;

import java.util.Arrays;

// 길이에 따른 연산
// https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class Level00_길이에따른연산 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,4,5,2,5,4,6,7,3,7,2,2,1})); // 51
        System.out.println(solution(new int[]{2,3,4,5})); // 120
    }

    public static int solution(int[] num_list) {
        int len = num_list.length;
        if(len >= 11){
            return Arrays.stream(num_list).sum();
        }else{
            return Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }
    }

}
