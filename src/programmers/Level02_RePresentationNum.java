package programmers;

public class Level02_RePresentationNum {

    public static void main(String[] args) {
        System.out.println(solution(15)); // 4
        System.out.println(solution(9));  // 3
        System.out.println(solution(10)); // 2
        System.out.println(solution(8));  // 1
        System.out.println(solution(1)); // 1
        System.out.println(solution(2)); // 1
        System.out.println(solution(3)); // 1
    }

    public static int solution(int n) {
        int answer = 0;
        int len = (n / 2) + 1;

        if(n == 1 || n == 2) return 1;

        for (int i = 1; i <= len; i++) {
            int sum = 0;
            for (int j = i; j <= len; j++) {
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }else if (sum > n){
                    break;
                }
            }

        }

        return answer + 1;
    }

    /*
    1 = 1 > 1개
    2 = 2 > 1개
    3 = 1+2, 3 > 2개
    4 = 4 > 1개
    5 = 2+3, 5 > 2개
    6 = 1+2+3, 6 > 2개
    7 = 7 > 1개
    8 = 8 > 1개
    9 = 2+3+4, 4+5, 9 > 3개
    10 = 1+2+3+4, 10 > 2개
    */

}
