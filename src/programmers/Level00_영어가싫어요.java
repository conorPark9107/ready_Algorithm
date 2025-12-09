package programmers;

import java.util.HashMap;

// 영어가 싫어요
// https://school.programmers.co.kr/learn/courses/30/lessons/120894
public class Level00_영어가싫어요 {

    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine")); // 123456789
        System.out.println(solution("onefourzerosixseven")); // 14067
    }


    /*
    * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
    * */


    public static long solution(String numbers) {
        long answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String str = "";
        for (int i = 0; i < numbers.length(); i++) {
            str += numbers.charAt(i);
            if(map.containsKey(str)){
                answer = (answer * 10) + map.get(str);
                str = "";
            }
        }
        return answer;
    }

    public static long solution01(String numbers) {
        long answer = 0;

        String str = "";
        for (int i = 0; i < numbers.length(); i++) {
            str += numbers.charAt(i);
            switch (str){
                case "zero" -> {
                    answer = answer * 10;
                    str = "";
                }
                case "one" -> {
                    answer = (answer * 10) + 1;
                    str = "";
                }
                case "two" -> {
                    answer = (answer * 10) + 2;
                    str = "";
                }
                case "three" -> {
                    answer = (answer * 10) + 3;
                    str = "";
                }
                case "four" -> {
                    answer = (answer * 10) + 4;
                    str = "";
                }
                case "five" -> {
                    answer = (answer * 10) + 5;
                    str = "";
                }
                case "six" -> {
                    answer = (answer * 10) + 6;
                    str = "";
                }
                case "seven" -> {
                    answer = (answer * 10) + 7;
                    str = "";
                }
                case "eight" -> {
                    answer = (answer * 10) + 8;
                    str = "";
                }
                case "nine" -> {
                    answer = (answer * 10) + 9;
                    str = "";
                }
            }
        }
        return answer;
    }



}
