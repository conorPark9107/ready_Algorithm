package programmers;

public class Level00_수조작하기1 {

    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw")); // -1
    }

    public static int solution(int n, String control) {
        for(char c : control.toCharArray()){
            switch (c){
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }

}
