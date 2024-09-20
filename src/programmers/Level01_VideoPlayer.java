package programmers;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// [PCCP 기출문제] 1번 / 동영상 재생기
// https://school.programmers.co.kr/learn/courses/30/lessons/340213
public class Level01_VideoPlayer {

    public static void main(String[] args) {

        // video_len	pos	op_start	op_end	commands
        String answer = solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"});
        System.out.println(answer);

        String answer02 = solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"});
        System.out.println(answer02);

        String answer03 = solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"});
        System.out.println(answer03);

        String answer04 = solution("59:59", "59:59", "59:59", "59:59", new String[]{"prev"});
        System.out.println(answer04);

        String answer05 = solution("30:00", "00:11", "05:00", "06:00", new String[]{"prev"});
        System.out.println(answer05); // 기댓값 〉 "00:01"


    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");

        String[] videoLen =  video_len.split(":");
        LocalTime videoLength = LocalTime.of(0, Integer.parseInt(videoLen[0]), Integer.parseInt(videoLen[1]));

        String[] arr = pos.split(":");
        LocalTime nowTime = LocalTime.of(0, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));

        String[] opStart = op_start.split(":");
        LocalTime opStartTime = LocalTime.of(0, Integer.parseInt(opStart[0]), Integer.parseInt(opStart[1]));

        String[] opEnd = op_end.split(":");
        LocalTime opEndTime = LocalTime.of(0, Integer.parseInt(opEnd[0]), Integer.parseInt(opEnd[1]));

        LocalTime now = isBeetween(opStartTime, opEndTime, nowTime)? opEndTime : nowTime;
        for (int i = 0; i < commands.length; i++) {
            String commnad = commands[i];

            switch (commnad) {
                case "next" :

                    // now가 length보다 크다면.
                    if(now.plusSeconds(10).isAfter(videoLength)){
                        now = videoLength;
                    }else{
                        now = now.plusSeconds(10);
                    }
                    break;

                case "prev" :
                    if(now.getMinute() == 0 && now.getSecond() < 10){
                        now = LocalTime.of(0, 0);
                    }else{
                        now = now.minusSeconds(10);
                    }
                    break;
            }

            if(isBeetween(opStartTime, opEndTime, now)){
                now = opEndTime;
            }

        }

        return now.format(formatter);
    }

    private static boolean isBeetween(LocalTime opStartTime, LocalTime opEndTime, LocalTime now) {
        return (now.isAfter(opStartTime) && now.isBefore(opEndTime)) || (now.equals(opStartTime) || now.equals(opEndTime));
    }

}
