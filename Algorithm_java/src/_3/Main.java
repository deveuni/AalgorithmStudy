package _3;

import java.util.Scanner;

/*
 * - 가장 많이 출현한 수를 출력하시오.
 * - 1 2 2 3 1 4 2 2 4 3 5 3 2
 * - 정답 : 2 (5회)
 * 
 * Tag >>> 배열, for
 * 
 * 
 * */

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// 사용자 input 
		
		// 1 2 2 3 1 4 2 2 4 3 
		
		// 1: 2
		// 2: 4 --> 최변수
		// 3: 2
		// 4: 2
	}

}
