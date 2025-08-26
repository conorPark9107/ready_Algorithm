package programmers;

import java.util.Arrays;

// 문자열 여러번 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Level00_문자열여러번뒤집기 {

    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam", new int[][]{{2,3}, {0,7}, {5,9}, {6,10}}));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];

            sb.replace(s, e + 1, new StringBuilder(sb.substring(s, e + 1))
                                    .reverse()
                                    .toString());
        }
        return sb.toString();
    }

//    public static String solution(String my_string, int[][] queries) {
//        for (int i = 0; i < queries.length; i++) {
//            int s = queries[i][0];
//            int e = queries[i][1];
//
//            String start = my_string.substring(0, s);
//            String middle = new StringBuilder(my_string.substring(s, e + 1))
//                                .reverse()
//                                .toString();
//            String end = my_string.substring(e + 1);
//            my_string = start + middle + end;
//        }
//        return my_string;
//    }

}
