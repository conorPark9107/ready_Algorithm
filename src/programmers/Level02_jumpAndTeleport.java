package programmers;

// 점프와 순간이동
// https://school.programmers.co.kr/learn/challenges?order=recent&statuses=unsolved&levels=1%2C2&languages=java&page=4
public class Level02_jumpAndTeleport {

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(5000));
    }

    public static int solution(int n) {
        int ans = 0;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
}