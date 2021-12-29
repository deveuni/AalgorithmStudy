package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10951
// A+B-4

public class _10951_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}

}
