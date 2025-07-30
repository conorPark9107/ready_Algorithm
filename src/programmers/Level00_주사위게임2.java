package programmers;


// 주사위 게임2
// https://school.programmers.co.kr/learn/courses/30/lessons/181930
public class Level00_주사위게임2 {

    public static void main(String[] args) {
        System.out.println(solution(2,6,1)); // 9
        System.out.println(solution(5,3,3)); // 473
        System.out.println(solution(4,4,4)); // 110592
    }

    public static int solution(int a, int b, int c) {
        int answer = a + b + c;
        int squre = (a * a) + (b * b) + (c * c);
        int cube = (a * a * a) + (b * b * b) + (c * c * c);

        if(a == b && b == c){
            answer = answer * squre * cube;
        }else if (a == b || b == c || a == c){
            answer = answer * squre;
        }

        return answer;
    }

}
