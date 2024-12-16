package programmers;

public class Level01_MakeStrangeString {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        System.out.println(solution(" zZZ  Zzz  Zzz "));
        System.out.println(solution("  TRy HElLo  WORLD "));
        //  TrY HeLlO  WoRlD
        //  TrY HeLlO  WoRlD
    }

    public static String solution(String s) {
        String answer = "";

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' '){
                answer += " ";
                index = 0;
                continue;
            }

            if(index++ % 2 == 0){
                answer += String.valueOf(c).toUpperCase();
            }else{
                answer += String.valueOf(c).toLowerCase();
            }

        }
        return answer;
    }

}
