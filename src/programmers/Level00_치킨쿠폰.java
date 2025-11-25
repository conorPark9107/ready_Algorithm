package programmers;

// 치킨 쿠폰
// https://school.programmers.co.kr/learn/courses/30/lessons/120884
public class Level00_치킨쿠폰 {

    public static void main(String[] args) {
        System.out.println(solution(100)); // 11
        System.out.println(solution(1081)); // 120
    }

    public static int solution(int chicken) {
        return (chicken - 1) / 9;
    }

    public static int solution01(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            answer += chicken / 10;
            int coupons = chicken / 10;
            chicken = (chicken % 10) + coupons;
        }
        return answer;
    }

    public static int solution02(int chicken) {
        int answer = 0;
        while(chicken > 0){
            if(chicken - 10 < 0) break;
            else{
                answer++;
                chicken -= 10;
                chicken++;
            }
        }
        return answer;
    }

}
