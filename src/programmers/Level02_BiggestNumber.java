package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Level02_BiggestNumber {

	public static void main(String[] args) {
		String answer = solution(new int[] {6, 10, 2});
		System.out.println(answer);
		
		answer = solution(new int[] {3, 30, 34, 5, 9});
		System.out.println(answer);

	}

	public static String solution(int[] numbers) {

		StringBuilder sb = new StringBuilder();
		String[] sArr = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			sArr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(sArr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});

		if (sArr[0].equals("0"))
			return "0";

		for (int i = 0; i < numbers.length; i++) {
			sb.append(sArr[i]);
		}

		return sb.toString();
	}

}
