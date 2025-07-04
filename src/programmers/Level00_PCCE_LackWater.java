package programmers;

// 물부족
// https://school.programmers.co.kr/learn/courses/30/lessons/340202
public class Level00_PCCE_LackWater {

    public static void main(String[] args) {
//        System.out.println(solution(5141, 500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10})); // -1
        System.out.println(solution(1000, 2000, new int[]{-10, 25, -33})); // 1
    }

    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = usage + (usage * change[i] / 100);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
