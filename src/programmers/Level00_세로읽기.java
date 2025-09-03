package programmers;

// 세로 읽기
// https://school.programmers.co.kr/learn/courses/30/lessons/181904
public class Level00_세로읽기 {

    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2)); // happy
        System.out.println(solution("programmers", 1, 1)); // programmers
    }


    // 매개변수 m이 my_string.length()의 약수일 때. (본 문제)
    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length() / m; i++) {
            char ch = my_string.charAt(i * m + c - 1);
            sb.append(ch);
        }
        return sb.toString();
    }


    // 매개변수 m이 my_string.length()의 약수가 아닐 때
    public static String solution02(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int remainder = my_string.length() % m;
        for (int i = 0; i < my_string.length() / m; i++) {
            answer.append(my_string.charAt(i * m + (c - 1)));
        }
        answer.append((remainder == 0)
                ? ""
                : my_string.charAt(m * m + (c - 1)));
        return answer.toString();
    }

    // 매개변수 m이 my_string.length()의 약수가 아닐 때
    public static String solution01(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int len = my_string.length();
        int row = (len % m == 0)?  len / m : len / m + 1;
        String[][] arr = new String[row][m];

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < m; j++){
                arr[i][j] = String.valueOf(my_string.charAt(i * m + j));
            }
        }
        for (int i = 0; i < row; i++) {
            answer.append(arr[i][c - 1]);
        }

        return answer.toString();
    }

}
