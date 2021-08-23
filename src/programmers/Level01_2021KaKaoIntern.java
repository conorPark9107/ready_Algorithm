package programmers;

public class Level01_2021KaKaoIntern {

	public static void main(String[] args) {
		int result = solution("one4seveneight");
		System.out.println(result);
		result = solution("23four5six7");
		System.out.println(result);
		result = solution("2three45sixseven");
		System.out.println(result);
		result = solution("123");
		System.out.println(result);
	}
	
	public static int solution(String s) {
        String[][] word =  {
        		{"zero" , "0"}, 
        		{"one"  , "1"}, 
        		{"two"  , "2"}, 
        		{"three", "3"}, 
        		{"four" , "4"}, 
        		{"five" , "5"}, 
        		{"six"  , "6"}, 
        		{"seven", "7"}, 
        		{"eight", "8"}, 
        		{"nine" , "9"}};
        
       for(int i = 0; i < 10; i++)
       {
    	   s = s.replaceAll(word[i][0], word[i][1]);
       }
        
        
        return Integer.parseInt(s);
    }
	
}
