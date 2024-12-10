package programmers;

// 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Level01_CaesarCode {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));    // BC
        System.out.println("------------");

        System.out.println(solution("z", 1));     // a
        System.out.println("------------");

        System.out.println(solution("a B z", 4)); // e F d
        System.out.println("------------");
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') {
                answer.append(" ");
                continue;
            }

            char nc = (char) (c + n);
            if(Character.isUpperCase(c)){
                if(nc > 'Z') nc -= 26;
            }else{
                if(nc > 'z') nc -= 26;
            }

            answer.append(nc);
        }

        return answer.toString();
    }

}
