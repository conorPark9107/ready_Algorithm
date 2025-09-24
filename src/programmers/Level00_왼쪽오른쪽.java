package programmers;


import java.util.Arrays;

// 왼쪽 오른쪽
// https://school.programmers.co.kr/learn/courses/30/lessons/181890
public class Level00_왼쪽오른쪽 {

    public static void main(String[] args) {
        String[] arr = solution(new String[]{"u", "u", "l", "r"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));

        System.out.println();

        arr = solution(new String[]{"l"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));

        System.out.println();

        arr = solution(new String[]{"u", "u", "r", "u"});
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));

    }

    public static String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if("l".equals(str_list[i])) return Arrays.copyOfRange(str_list, 0, i);
            if("r".equals(str_list[i])) return Arrays.copyOfRange(str_list, i + 1, str_list.length);
        }
        return new String[0];
    }


    public static String[] solution02(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            switch (str_list[i]){
                case "l" -> {
                    return Arrays.copyOfRange(str_list, 0, i);
                }
                case "r" -> {
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                }
            }
        }
        return new String[0];
    }

}
