package baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1152
// 단어의 개수

// 해설 참조
// https://st-lab.tistory.com/65

public class _1152 {

	public static void main(String[] args) throws IOException {

		// 방법 1 - Scanner
		Scanner in = new Scanner(System.in);
		
		String S = in.nextLine();
		in.close();
		
		// st에 공백을 기준으로 나눈 토큰들을 st에 저장한다.
		StringTokenizer st = new StringTokenizer(S, " ");
		
		// countTokens() 는 토큰의 개수를 반환한다.
		System.out.println(st.countTokens());
		
		// 방법 2 
		// buffer을 사용하지 않고 원시 입력 형태로 문자 ㅏ나씩 읽어들이면서
		// 읽어들인 문자가 공백인지 아닌지에 따라 count를 해주는 방법
		
		int count = 0;
		int pre_str = 32; // 공백을 의미한다. (이전의 문자를 저장)
		int str; // 현재 입력받은 문자를 저장
		
		// 입력받은 문자가 공백이면서 이전의 문자가 공백이 아닐 경우 count 1증가
		while(true) {
			str = System.in.read();
			
			// 입력받은 문자가 공백일 때,
			if(str == 32) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
			
			// 입력받은 문자가 개행일때 ('\n')
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면 
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
			
		}
		
		// 공백을 입력받을 때 count를 1 증가시키지 않고 추가 조건이 붙어 
		// 이전의 문자가 공백이 아닐 겨 ㅇ우도 포함할 때만 1증가 시키는 이유는 
		// 첫문자와 마지막 문자가 만약 공백이라면 count변수가 1이 증가하기 때문에 
		// 예외를 발생시키지 않기  위해
		
		System.out.println(count);
		
	}

}
