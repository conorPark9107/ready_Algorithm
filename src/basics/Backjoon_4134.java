package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Backjoon_4134 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        long[] array = new long[testcase];
        for (int i = 0; i < testcase; i++) {
            array[i] = Long.parseLong(br.readLine());
        }


        for (int i = 0; i < testcase; i++) {
            long num = array[i];

            if(num <= 2){
                System.out.println(2);
                continue;
            }

            while(true){
                if(isPrimeNumber(num)){
                    System.out.println(num);
                    break;
                }
                num++;
            }
        }
    }

    private static boolean isPrimeNumber(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }


    static boolean isPrime(long num) {

        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // 5부터는 6씩 더하며 소수 판별
        // 5부터는 소수가 [6k +- 1] 형태이기 때문
        for (long i = 5; i <= Math.sqrt(num); i += 6) {
            // i 로 나눠 6k - 1 값을 판별하고
            // i+2 로 나눠 6k + 1 값을 판별함
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        // 소수일 경우 true 반환
        return true;
    }

    // 모든 소수는 6의 배수에서 +-1 위치에 있을 수 없음
    // 5기준으로 6의 배수에서 1작은 수, 1큰 수로 비교

}





