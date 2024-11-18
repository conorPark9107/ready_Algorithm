package programmers;


import java.util.ArrayList;
import java.util.Stack;

// 햄버거 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Level01_makeHamburger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            if(stack.size() >= 4){
                int s = stack.size();
                if(stack.get(s - 4) == 1 &&
                    stack.get(s - 3) == 2 &&
                    stack.get(s - 2) == 3 &&
                    stack.get(s - 1) == 1){
                    answer++;
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }
        return answer;
    }

    public static int secondBadCode(int[] ingredient){
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
        }

        int index = 0;
        while((index = sb.indexOf("1231")) != -1){
            sb.replace(index, index + 4, "");
            answer++;
        }

        return answer;
    }

    public static int firstBadCode(int[] ingredient){
        int answer = 0;
        int[] arr = {1, 2, 3, 1};
        int length = ingredient.length;


        ArrayList<Integer> list =  new ArrayList<>();
        for (int i : ingredient) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num == 1){
                boolean status = true;
                for (int j = 0; j < arr.length; j++) {
                    if(i + j >= length){
                        status = false;
                        break;
                    }else if(list.get(i + j) != arr[j]){
                        status = false;
                        break;
                    }
                }

                if(status){
                    for (int j = 0; j < arr.length; j++) {
                        if(i + j < length){
                            list.remove(i);
                        }
                    }
                    i = 0;
                    answer++;
                }
            }
        }
        return answer;
    }


}
