package programmers;

import java.util.Arrays;

public class Level00_문자개수세기 {

    public static void main(String[] args) {
        int[] arr = solution("Programmers");
        Arrays.stream(arr).forEach(value -> System.out.print(value + ", "));
        System.out.println();

    }

    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)){
                answer[c - 'A']++;
            }else{
                answer[c - 'A' - 6]++;
            }
        }
        return answer;
    }

}
