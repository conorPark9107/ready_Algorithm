package programmers;

// 정수부분
// https://school.programmers.co.kr/learn/courses/30/lessons/181850
public class Level00_정수부분 {

    public static void main(String[] args) {
        System.out.println(solution(1.42));
        System.out.println(solution(69.32));
    }


    public static int solution(double flo) {
        return (int) flo;
    }

}
