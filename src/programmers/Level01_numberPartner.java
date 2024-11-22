package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level01_numberPartner {

    public static void main(String[] args) {
        System.out.println(solution("100", "2345")); // -1
//        System.out.println(solution("100", "203045")); // 0
//        System.out.println(solution("100", "123450")); // 10
//        System.out.println(solution("12321", "42531")); // 321
//        System.out.println(solution("5525", "1255")); // 552
        System.out.println(solution("123459999999999999990", "1234590")); // 9543210
        System.out.println(solution("1234567890", "1234567890")); // 9876543210
    }

    public static String solution(String X, String Y) {
        int[] counter = new int[10];

        String F, L;
        if(X.length() > Y.length()){
            F = Y;
            L = X;
        }else{
            F = X;
            L = Y;
        }

        for (int i = 0; i < F.length(); i++) {
            counter[F.charAt(i) - '0']++;
        }

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < L.length(); i++) {
            if(counter[L.charAt(i) - '0'] > 0){
                counter[L.charAt(i) - '0']--;
                list.add(L.charAt(i));
            }
        }
        // -1일 경우.
        if(list.isEmpty()) return "-1";

        Collections.sort(list, Collections.reverseOrder());

        // 0만 존재할경우.
        if(list.get(0) == '0') return "0";

        StringBuilder sb = new StringBuilder();
        for (Character s : list) sb.append(s);
        return sb.toString();
    }


}
