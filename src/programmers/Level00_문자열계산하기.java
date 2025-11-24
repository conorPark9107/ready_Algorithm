package programmers;


// 문자열 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120902
public class Level00_문자열계산하기 {

    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
        System.out.println(solution("3 - 4"));
        System.out.println(solution("3 - 4 + 2"));
        System.out.println(solution("3 + 4 + 5 + 5 + 100"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i += 2) {
            String operator = arr[i];
            int n = Integer.parseInt(arr[i + 1]);
            answer = operator.equals("+")
                    ? answer + n
                    : answer - n;
        }
        return answer;
    }

}
