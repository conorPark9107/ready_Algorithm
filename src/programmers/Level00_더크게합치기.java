package programmers;

public class Level00_더크게합치기 {

    public static void main(String[] args) {
        System.out.println(solution(9, 91)); // 991
        System.out.println(solution(89, 8)); // 898
    }

    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return (ab == ba)? ab : Math.max(ba, ab);
    }
}
