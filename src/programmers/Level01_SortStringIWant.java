package programmers;


import java.util.Arrays;

// 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class Level01_SortStringIWant {

    public static void main(String[] args) {
        String[] answer = solution2(new String[]{"sun", "bed", "car"}, 1); // ["car", "bed", "sun"]
        for(String s : answer){
            System.out.print(s + " ");
        }
        System.out.println();

        String[] answer2 = solution2(new String[]{"abce", "abcd", "cdx"}, 2); // ["abcd", "abce", "cdx"]
        for(String s : answer2){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if(o1.charAt(n) == o2.charAt(n)){
                return o1.compareTo(o2);
            }
            return o1.charAt(n) - o2.charAt(n);
        });
        return strings;
    }

    public static String[] solution2(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((o1, o2) -> {
                    if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                    else return o1.charAt(n) - o2.charAt(n);
                }).toArray(String[]::new);
    }

}
