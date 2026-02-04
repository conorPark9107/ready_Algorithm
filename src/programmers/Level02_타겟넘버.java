package programmers;

// 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class Level02_타겟넘버 {

    public static void main(String[] args) {
        Level02_타겟넘버 o = new Level02_타겟넘버();
        System.out.println(o.solution(new int[]{1, 1, 1, 1, 1}, 3)); // 5
        System.out.println(o.solution(new int[]{4, 1, 2, 1}, 4)); // 2
    }


    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, target, 0);
    }


    private int dfs(int[] numbers, int index, int target, int current) {
        int count = 0;
        if(index == numbers.length){
            if(current == target) {
                count++;
            }
            return count;
        }
        count += dfs(numbers, index + 1, target, current + numbers[index]);
        count += dfs(numbers, index + 1, target, current - numbers[index]);
        return count;
    }



//    int answer = 0;
//    int[] numbers;
//    int target;
//    public int solution(int[] numbers, int target) {
//        this.answer = 0;
//        this.numbers = numbers;
//        this.target = target;
//        dfs(0, 0);
//        return answer;
//    }
//
//
//    private void dfs(int index, int current) {
//        if(numbers.length == index) {
//            if(target == current) answer++;
//            return;
//        }
//        dfs(index + 1, current + numbers[index]);
//        dfs(index + 1, current - numbers[index]);
//    }

}