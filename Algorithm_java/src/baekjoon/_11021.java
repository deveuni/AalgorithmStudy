package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11021
// A+B-7

public class _11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i =1; i <=a;i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (c + d));
			
			sc.close();
		}
	}

}
