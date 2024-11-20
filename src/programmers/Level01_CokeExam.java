package programmers;

public class Level01_CokeExam {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20)); // 19
        System.out.println(solution(3, 1, 20)); // 9
        System.out.println(solution(8, 1, 20)); // 2
        System.out.println(solution(5, 3, 21)); // 27

    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a){
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }

        return answer;
    }

}
