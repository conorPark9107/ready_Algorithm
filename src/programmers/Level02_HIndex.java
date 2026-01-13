package programmers;

import java.util.Arrays;

// H - Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Level02_HIndex {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5})); // 3
        System.out.println(solution(new int[]{4, 0, 4, 4, 5})); // 4
        System.out.println(solution(new int[]{4, 0, 4, 4, 5, 5})); // 4
        System.out.println(solution(new int[]{4, 0, 4, 4, 5, 5, 6, 7, 8})); // 5
        System.out.println(solution(new int[]{4, 0, 4, 4, 5, 6, 6, 7, 8, 10000, 9999})); // 6
        System.out.println(solution(new int[]{0, 4, 4, 4})); // 3
        System.out.println(solution(new int[]{0, 4, 4, 4, 10000})); // 4
    }


    public static int solution(int[] citations) {
        int h = 0;
        int length = citations.length;
        int[] count = new int[10001];
        for (int c : citations) {
            if (c >= length) {
                count[length]++;
            }else{
                count[c]++;
            }
        }
        for (int i = length; i >= 0; i--) {
            h += count[i];
            if(h >= i) return i;
        }
        return h;
    }

    // 정렬을 해서 해결.
    public static int solutionWithSort(int[] citations) {
        int h = 0;
        int length = citations.length;
        Arrays.sort(citations);
        for (int i = length - 1; i >= 0; i--) {
            if(h < citations[i]){
                h++;
            }else{
                break;
            }
        }
        return h;
    }

    // 카운팅을 써서 해결.
    public static int solutionWithCounting(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int[] count = new int[10001];
        for (int c : citations) {
            if (c >= length) {
                count[length]++;
            }else{
                count[c]++;
            }
        }
        int p = 0;
        for (int i = length; i >= 0; i--) {
            p += count[i];
            if(p >= i) return i;
        }
        return answer;
    }
    
    // 틀린 코드
    public static int solution01(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int[] count = new int[10001];
        Arrays.sort(citations);
        int max = citations[length - 1];

        for (int i = length - 1; i >= 0; i--) {
            int index = citations[i];
            while (index >= 0) {
                count[index]++;
                index--;
            }
        }

        for (int i = max; i >= 0; i--) {
            if(count[i] >= i) {
                answer = i;
                break;
            }
        }

        return answer;
    }

}

