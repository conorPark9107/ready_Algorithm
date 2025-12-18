package programmers;

import java.util.Arrays;

public class Level00_X사이의개수 {

    public static void main(String[] args) {
        int[] arr = solution("oxooxoxxox");
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();

        arr = solution("xabcxdefxghi");
        Arrays.stream(arr).forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int[] answer = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            answer[i] = strArr[i].length();
        }

        return answer;
    }

}
