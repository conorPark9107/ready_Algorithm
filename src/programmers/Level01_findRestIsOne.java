package programmers;

public class Level01_findRestIsOne {

    public static void main(String[] args) {
        System.out.println(solution(10)); // 3
        System.out.println(solution(12)); // 11
        System.out.println(solution(24)); // 23
        System.out.println(solution(100)); // 3
    }

    public static int solution(int n) {
        int answer = n - 1;

        for (int i = 2; i < n / 2; i++) {
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
