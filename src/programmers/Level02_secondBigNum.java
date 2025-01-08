package programmers;


import java.util.Arrays;

// 다음 큰 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class Level02_secondBigNum {

    public static void main(String[] args) {
        System.out.println(solution(78)); // 83
//        System.out.println(solution(15)); // 23
    }

    public static int solution(int n) {
        int answer = 0;
        int c = getCount(n);

        while(true){
            n++;
            int nowC = getCount(n);
            if(c == nowC){
                answer = n;
                break;
            }
        }
        return answer;
    }

    private static int getCount(int n) {
        char[] charArr = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char c : charArr) {
            if(c == '1') count++;
        }
        return count;
    }

    public static int solution01(int n) {
        int answer = 0;
        long c = Arrays.stream(Integer.toBinaryString(n).split(""))
                .filter(s -> s.equals("1"))
                .count();

        while(true){
            n++;
            String s = Integer.toBinaryString(n);
            long nowC = Arrays.stream(s.split(""))
                    .filter(ss -> ss.equals("1"))
                    .count();
            if(c == nowC){
                answer = n;
                break;
            }
        }
        return answer;
    }

}

