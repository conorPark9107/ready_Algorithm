package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 너의 평점은, 25206번, (실수형 데이터, 평균값 구하기)
public class backjoon_25206 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        double result = 0.0, totalSum = 0.0, sum = 0.0;

        while((input = br.readLine()) != null && !input.equals("")){
            String[] arrStr = input.split(" ");
            double score = Double.parseDouble(arrStr[1]);
            String grade = arrStr[2];

            if(grade.equals("P")) continue;

            sum += score;
            switch (grade){
                case "A+":
                    score *= 4.5;
                    break;
                case "A0":
                    score *= 4.0;
                    break;
                case "B+":
                    score *= 3.5;
                    break;
                case "B0":
                    score *= 3.0;
                    break;
                case "C+":
                    score *= 2.5;
                    break;
                case "C0":
                    score *= 2.0;
                    break;
                case "D+":
                    score *= 1.5;
                    break;
                case "D0":
                    score *= 1.0;
                    break;
                case "F":
                    score *= 0;
                    break;
            }

            totalSum += score;

        }

        result = totalSum / sum;

        System.out.println(result);
    }
}
