package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2577
// 숫자의 개수

public class _2577 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
