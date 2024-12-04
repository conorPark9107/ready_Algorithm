package programmers;


// 소수
public class Level01_prime {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));   // 1
        System.out.println(solution(new int[]{1,2,7,6,4})); // 4
    }

    public static int solution(int[] nums) {
        int answer = 0;

        boolean[] isNotPrime = isPrimeNumber();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int num = nums[i] + nums[j] + nums[k];
                    if(!isNotPrime[num]) answer++;

                }
            }
        }

        return answer;
    }

    private static boolean[] isPrimeNumber(){
        boolean[] isPrime = new boolean[50001];
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++) {
            if(!isPrime[i]){
                for(int j = i + i; j < isPrime.length; j += i) isPrime[j] = true;
            }
        }
        return isPrime;
    }


//    private static boolean isPrimeNumber(int num) {
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if(num % i == 0) return false;
//        }
//        return true;
//    }

}

