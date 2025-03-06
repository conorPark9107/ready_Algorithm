package programmers;


// 택배 상자 꺼내기
// https://school.programmers.co.kr/learn/courses/30/lessons/389478
public class Level01_pullOutOfBox {

    public static void main(String[] args) {

        System.out.println(solution(22, 6, 8)); // 3
//        System.out.println(solution(13, 3, 6)); // 4
    }

    // 남이 쓴 더 좋은 코드.
    public static int solution(int n, int w, int num) {
        int cnt = 0;
        while(num <= n) {
            num += (w - ((num-1) % w) - 1) * 2 + 1;
            System.out.println(num);
            cnt++;
        }

        int answer = cnt;
        return answer;
    }


    public static int solution2(int n, int w, int num) {
        int answer = 0;

        int remainder = (n % w == 0) ? n / w : n / w + 1;
        int[][] boxes = new int[remainder][w];

        int count = 1, x = 0, y = 0;

        for (int i = 0; i < remainder; i++) {
            if((i + 1) % 2 == 0){
                for(int j = w - 1; j >= 0; j--){
                    if(count <= n){
                        if(count == num){
                            x = i;
                            y = j;
                        }
                        boxes[i][j] = count++;
                    }
                }
            }else{
                for(int j = 0; j < w; j++){
                    if(count <= n){
                        if(count == num){
                            x = i;
                            y = j;
                        }
                        boxes[i][j] = count++;
                    }
                }
            }
        }

        for (int i = x; i < remainder; i++) {
            if(boxes[i][y] != 0) answer++;
        }

        return answer;
    }
}
