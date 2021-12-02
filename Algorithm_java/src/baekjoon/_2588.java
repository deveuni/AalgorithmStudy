package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2588
// 곱셈 
// 두번째 입력값을 어떻게 분리해주어야 하냐의 문제 
// 1. 문자열로 입력받아 charAt()으로 하나씩 꺼내 쓰는 방법
// 2. 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
// 3. 문자열을 character 배열로 한자리씩 넣어주어 이용하는 방법
// 참고 출처 : https://st-lab.tistory.com/20
public class _2588 {

	public static void main(String[] args) {
		
		// 방법 1
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String B = sc.next();
		
		sc.close();
		
		System.out.println(A *(B.charAt(2) - '0'));
		System.out.println(A *(B.charAt(1) - '0'));
		System.out.println(A *(B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
	}

}
