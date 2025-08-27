package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Level00_배열만들기5 {

    public static void main(String[] args) {
        int[] arr = solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5); // 56789, 99999
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            int x = Integer.parseInt(str.substring(s, s + l));
            if(x > k){
                list.add(x);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
