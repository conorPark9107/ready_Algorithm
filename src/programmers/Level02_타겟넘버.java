package programmers;

// 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class Level02_타겟넘버 {

    public static void main(String[] args) {
        Level02_타겟넘버 o = new Level02_타겟넘버();
        System.out.println(o.solution(new int[]{1, 1, 1, 1, 1}, 3)); // 5
        System.out.println(o.solution(new int[]{4, 1, 2, 1}, 4)); // 2
    }

    int answer = 0;
    int[] numbers;
    int target;
    public int solution(int[] numbers, int target) {
        this.answer = 0;
        this.numbers = numbers;
        this.target = target;
        dfs(0, 0);
        return answer;
    }

    private void dfs(int index, int current) {
        if(numbers.length == index) {
            if(target == current) answer++;
            return;
        }
        dfs(index + 1, current + numbers[index]);
        dfs(index + 1, current - numbers[index]);
    }

}