package programmers;

// 지폐접기
// https://school.programmers.co.kr/learn/courses/30/lessons/340199
public class Level01_PCCE_FoldBill {

    public static void main(String[] args) {
        int answer = solution(new int[]{30, 15}, new int[]{26, 17});
        System.out.println(answer);

        int answer02 = solution(new int[]{50, 50}, new int[]{100, 241});
        System.out.println(answer02);

    }

    private static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int maxW = Math.max(wallet[0], wallet[1]);
        int minW = Math.min(wallet[0], wallet[1]);

        int maxB = Math.max(bill[0], bill[1]);
        int minB = Math.min(bill[0], bill[1]);

        while(maxW < maxB || minW < minB){

            if(bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            }else{
                bill[1] = bill[1] / 2;
            }

            maxB = Math.max(bill[0], bill[1]);
            minB = Math.min(bill[0], bill[1]);
            answer++;
        }

        return answer;
    }

}
