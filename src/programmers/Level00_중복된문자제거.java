package programmers;


// 중복된 문자 제거
// https://school.programmers.co.kr/learn/courses/30/lessons/120888
public class Level00_중복된문자제거 {

    public static void main(String[] args) {
        System.out.println(solution("people")); // peol
        System.out.println(solution("We are the worldz")); // arthwoldz
    }

    public static String solution(String my_string) {
        boolean[] count = new boolean[91];
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if(!count[c - 32]){
                count[c - 32] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
