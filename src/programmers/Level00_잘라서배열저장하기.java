package programmers;

import java.util.Arrays;

public class Level00_잘라서배열저장하기 {

    public static void main(String[] args) {
        String[] arr = solution("abc1Addfggg4556b", 6); // 16
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["abc1Ad", "dfggg4", "556b"]
        System.out.println();

        arr = solution("abcdef123", 3); // 9
        Arrays.stream(arr).forEach(s -> System.out.print(s + " ")); // ["abc", "def", "123"]
        System.out.println();
    }


    public static String[] solution(String my_str, int n) {
        int length = my_str.length();
        int len = length / n  == 0 ? length / n : length / n + 1;
        String[] answer = new String[len];
        for (int i = 0; i < len; i++) {
            int start = i * n;
            int end = (i * n) + n;
            if(end < my_str.length()){
                answer[i] = my_str.substring(start, end);
            }else{
                answer[i] = my_str.substring(start, length);
            }
        }
        return answer;
    }

}
