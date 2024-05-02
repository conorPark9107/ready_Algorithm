package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/250137
public class Level_01_PCCP_01exam {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{5, 1, 5},	30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}})); // 기댓값 : 5
        System.out.println(solution(new int[]{3, 2, 7},	20, new int[][]{{1, 15}, {5, 16}, {8, 6}})); // 기댓값 : -1
        System.out.println(solution(new int[]{4, 2, 7},	20, new int[][]{{1, 15}, {5, 16}, {8, 6}})); // 기댓값 : -1
        System.out.println(solution(new int[]{1, 1, 1},	5, new int[][]{{1, 2}, {3, 2}})); // 기댓값 : 3
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;

        int attacksLength = attacks.length; // 공격 횟수.
        int loop = attacks[attacksLength-1][0]; // 마지막 공격 시간.


        int bandageTime = bandage[0];  // 붕대 감는 시간.
        int recovery = bandage[1];     // 초당 회복량.
        int bonusHP = bandage[2];      // 붕대 감는시간동안 공격받지 않고 회복하였을 경우.
        int maxHP = health;            // max HP
        int hp = health;               // 현재 HP
        int bonusCount = 0;            // 보너스 HP를 받기 위한 카운팅변수.


        for(int time = 1; time < loop+1; time++){

            bonusCount++;
            for (int[] attack : attacks) {

                int attackTime = attack[0];
                int damage = attack[1];

                if (time > attackTime || time < attackTime) continue;

                hp -= damage;
                bonusCount = 0;
                break;
            }

            if(hp <= 0) return -1;        // 공격을 받아 HP가 0 이하로 떨어졌을 경우.
            if(bonusCount == 0) continue; // 공격 받았을 경우, 그 time때는 체력회복을 하지않음.

            if(bonusCount == bandageTime){ // 보너스HP를 받아야할때
                hp += recovery + bonusHP;
                bonusCount = 0;
            }else{
                hp += recovery;
            }

            if(hp > maxHP) hp = maxHP; // hp가 최대HP를 넘어설경우 hp를 maxHP로.

        } // end of for

        answer = hp;

        return answer;
    }


}
