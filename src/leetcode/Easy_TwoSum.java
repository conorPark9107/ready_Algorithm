package leetcode;

// https://leetcode.com/problems/two-sum/
public class Easy_TwoSum {

	public static void main(String[] args) {
		int[] arr = twoSum(new int[] {2,7,11,15}, 9);
		for(int data : arr) {
			System.out.println(data);
		}
		System.out.println();
		
		int[] arr01 = twoSum(new int[] {3,2,4}, 6);
		for(int data : arr01) {
			System.out.println(data);
		}
		
		int[] arr02 = twoSum(new int[] {3,3}, 6);
		for(int data : arr02) {
			System.out.println(data);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
		int num = 0;
		boolean status = false;
		
        for(int i=0; i<nums.length; i++) {
        	
        	for(int j=i+1; j<nums.length; j++) {
        		num = nums[i] + nums[j];
        		
        		if(num == target) {
        			answer[0] = i;
        			answer[1] = j;
        			status = true;
        			break;
        		}
        	}// for j
        	
        	if(status) break;
        }// for i
        
        
		return answer;
    }
	
}
