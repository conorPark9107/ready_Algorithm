package programmers;

// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class Level02_MadeJadenCase {

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me")); // "3people Unfollowed Me"
        System.out.println(solution("for the last week")); // "For The Last Week"
        System.out.println(solution(" for    the last week")); // " For    The Last Week"
        System.out.println(solution("For    the lAST la st week")); // " For    The Last Week"
    }

    public static String solution(String s) {
        String answer = "";

        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(Character.isAlphabetic(letter) && prev == ' '){
                letter = Character.toUpperCase(letter);
            }else{
                letter = Character.toLowerCase(letter);
            }
            answer += letter;
            prev = letter;
        }

        return answer;
    }

    public String solution02(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
