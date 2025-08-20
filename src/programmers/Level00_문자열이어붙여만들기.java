package programmers;

// 문자열 이어붙여 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class Level00_문자열이어붙여만들기 {

    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})); // programmers
        System.out.println(solution("zpiaz", new int[]{1, 2, 0, 0, 3})); // pizza
    }

    public static String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int i = 0; i < index_list.length; i++) {
            int index = index_list[i];
            answer = answer.concat(String.valueOf(my_string.charAt(index)));
        }

        return answer;
    }

}
