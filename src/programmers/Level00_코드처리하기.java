package programmers;

// 코드 처리하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181932
public class Level00_코드처리하기 {

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
        System.out.println(solution2("abc1abc1abc"));
    }

    public static String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(mode == 0){
                if(c != '1'){
                    if(i % 2 == 0){
                        answer.append(c);
                    }
                }else{
                    mode = 1;
                }
            }else{
                if(c != '1'){
                    if(i % 2 == 1){
                        answer.append(c);
                    }
                }else{
                    mode = 0;
                }
            }
        }

        return answer.length() == 0? "EMPTY" : answer.toString();
    }

    public static String solution2(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode ^= 1; // 0 <-> 1 토글
            } else if (i % 2 == mode) {
                answer.append(c);
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }


}
