package programmers;

import java.math.BigInteger;

// 크기가 작은 부분 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class Level01_smallSubstring {
    public static void main(String[] args) {
        int answer = solution("3141592", "271");
        System.out.println(answer);

        answer = solution("500220839878", "7");
        System.out.println(answer);

        answer = solution("10203", "15");
        System.out.println(answer);
    }

    public static int solution(String t, String p) {
        int answer = 0;

        BigInteger tI;
        BigInteger pI = new BigInteger(p);

        int length = t.length() - (p.length() - 1);

        for (int i = 0; i < length; i++) {
            int times = p.length();
            tI = new BigInteger(t.substring(i, i + times));
            if(pI.compareTo(tI) >= 0) answer++;
        }
        return answer;
    }

}
