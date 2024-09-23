package programmers;

import java.util.HashMap;
import java.util.StringTokenizer;

// 2024 KAKAO WINTER INTERNSHIP > 가장 많이 받은 선물
// https://school.programmers.co.kr/learn/courses/30/lessons/258712
public class Level01_2024KaKaoInternship_Gift {

    public static void main(String[] args) {
        int answer01 = solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
        System.out.println(answer01); // 2

        int answer02 = solution(new String[]{"joy", "brad", "alessandro", "conan", "david"}, new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"});
        System.out.println(answer02); // 4

        int answer03 = solution(new String[]{"a", "b", "c"}, new String[]{"a b", "b a", "c a", "a c", "a c", "c a"});
        System.out.println(answer03); // 0
    }

    public static int solution(String[] friends, String[] gifts) {

        HashMap<String, Person> map = new HashMap<>();
        HashMap<String, Integer> answerMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            answerMap.put(name, 0);
        }

        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            map.put(name, new Person(name, friends));
        }

        for (int j = 0; j < gifts.length; j++) {
            StringTokenizer token = new StringTokenizer(gifts[j]);
            String giver = token.nextToken();
            String recipient = token.nextToken();

            Person g = map.get(giver);
            Person r = map.get(recipient);

            g.total++;
            r.total--;

            r.gifts.put(giver, r.gifts.get(giver) + 1);
        }

        // 여기까지 누가 몇번을 받았는지 처리 해줬음, 실제 처리는 아래부터.
        for (int i = 0; i < friends.length; i++) {
            String recipientName = friends[i];

            for (int j = i + 1; j < friends.length; j++) {
                String giverName = friends[j];

                int a = map.get(recipientName).gifts.get(giverName);
                int b = map.get(giverName).gifts.get(recipientName);

                if (a > b) { // A(recipient)가 B(giver)에게 더 많이 받은 경우 => B가 다음달에 하나 받는다.
                    answerMap.put(giverName, answerMap.get(giverName) + 1);

                } else if (b > a) { // B(giver)가 A(recipient)에게 더 많이 받은 경우 => A가 다음달에 하나 받는다.
                    answerMap.put(recipientName, answerMap.get(recipientName) + 1);

                } else { // 같은 경우.

                    // 선물지수로 비교.
                    int totalA = map.get(giverName).total;
                    int totalB = map.get(recipientName).total;

                    if(totalA > totalB){  // 선물지수가 A가 더 크다면 => A가 다음달에 하나 받는다.
                        answerMap.put(giverName, answerMap.get(giverName) + 1);
                    }else if(totalB > totalA){ // 선물지수가 B가 더 크다면 => A가 다음달에 하나 받는다.
                        answerMap.put(recipientName, answerMap.get(recipientName) + 1);
                    }
                }
            }
        }

        int max = 0;
        for (String name : friends) {
            max = Math.max(max, answerMap.get(name));
        }

        return max;
    }

    public static class Person{
        public String name;
        public HashMap<String, Integer> gifts;
        public int total;

        public Person(String name, String[] friends){
            this.name = name;
            this.gifts = new HashMap<>();
            for (int i = 0; i < friends.length; i++) {
                gifts.put(friends[i], 0);
            }
        }

    }

}

