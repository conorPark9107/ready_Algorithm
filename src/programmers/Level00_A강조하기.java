package programmers;


import java.util.stream.Collectors;

// A 강조하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class Level00_A강조하기 {

    public static void main(String[] args) {
        System.out.println(solution("abstract algebra")); // AbstrAct AlgebrA
        System.out.println(solution("PrOgRaMmErS")); // progrAmmers
    }

    public static String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString.length());
        for (char c : myString.toCharArray()) {
            if(c == 'a' || c == 'A') answer.append("A");
            else answer.append(Character.toLowerCase(c));
        }
        return answer.toString();
    }

    public static String solutio04(String myString) {
        return myString.chars()
                .mapToObj(c -> (c == 'a' || c == 'A')
                           ? "A"
                           : String.valueOf(Character.toLowerCase((char)c))
                )
                .collect(Collectors.joining());
    }

    public static String solution02(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();
        for(char c : myString.toCharArray()){
            answer.append(c == 'a' ? 'A' : Character.toLowerCase(c));
        }
        return answer.toString();
    }

    public static String solution01(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();
        for(String c : myString.split("")){
            answer.append(c.equals("a") ? 'A' : c.toLowerCase());
        }
        return answer.toString();
    }

}
