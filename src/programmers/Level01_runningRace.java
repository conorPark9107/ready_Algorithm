package programmers;

import java.util.*;


// 달리기 경주
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Level01_runningRace {

    public static void main(String[] args) {
        String[] answer = solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        for(String s : answer){
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) map.put(players[i], i);

        for (int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);

            map.put(players[index - 1], index);
            map.put(players[index], index - 1);

            String temp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = temp;

        }
        return answer = players;
    }

}
