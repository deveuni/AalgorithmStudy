package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2525
// 오븐 시계

public class _2525 {

	public static void main(String[] args) throws IOException {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 시
		int B = sc.nextInt(); // 분
		int C = sc.nextInt(); // 오븐 조리 시간

		// 오븐 조리 시간을 60으로 나눈 몫은 시, 나머지는 분
		A += C/60;
		B += C%60;
		
		if(B>=60) {
			A += 1;
			B -= 60;
		}
		
		if(A>=24) {
			A -= 24;
		}

		System.out.println(A + " " + B);
		
	}

}
