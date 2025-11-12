package programmers;

// 커피심부름
// https://school.programmers.co.kr/learn/courses/30/lessons/181837
public class Level00_커피심부름 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"})); // 19000
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"})); // 13500

        System.out.println(String.format("%,d", 1000000));

    }

    public static int solution(String[] order) {
        int answer = 0;
        for (String menu : order) {
            if(menu.contains("americano")) answer += 4500;
            else if(menu.contains("anything")) answer += 4500;
            else answer += 5000;
        }
        return answer;
    }

}
