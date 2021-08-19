package programmers;
 

// 프로그래머스_Level01_체육복
public class Level01_greedy {

	public static void main(String[] args) {
		int a = solution(5, new int[] {2, 4}, new int[] {1, 3, 5});
		System.out.println(a);
		int b = solution(5, new int[] {2, 4}, new int[] {3});
		System.out.println(b);
		int c = solution(3, new int[] {3}, new int[] {1});
		System.out.println(c);
		
		
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        for(int i : reserve) {
        	arr[i-1]++;
        }
        for(int i : lost) {
        	arr[i-1]--;
        }

       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] < 0) {
    		   if(i < arr.length-1 && arr[i + 1] > 0) {
    			   arr[i]++;
    			   arr[i + 1]--;
    		   }else if(i > 1 && arr[i - 1] > 0) {
    			   arr[i]++;
    			   arr[i - 1]--;
    		   }
    	   }
       }
        
       for(int i=0; i<arr.length; i++) {
    	   if(arr[i] >= 0) {
    		   answer++;
    	   }
    	   
       }
       
        return answer;
    }

}
