package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2675
// 문자열 반복

// 해설
// https://st-lab.tistory.com/63

public class _2675 {

	public static void main(String[] args) {
		
		// 방법 1 - Scanner
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); // 테스트 케이스의 개수 
		for(int i=0; i < T; i++) {
			
			int R = in.nextInt(); // 반복 횟수
			String S = in.next(); // 문자열  
			// nextLine()으로 받으면 에러! 
			// nextLine()은 엔터값을 입력받을 때까지 기준으로 한줄을 읽어버린다.
			// next()는 공백을 기준으로 하나의 문자열만 읽어들인다.
			
			for(int j=0; i < S.length(); j++) {
				for(int k=0; k < R; k++) {
					System.out.println(S.charAt(j));
				}
			}
			
			System.out.println();
		}

	}

}
