package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// https://st-lab.tistory.com/59
// 아스키 코드

public class _11654 {

	public static void main(String[] args) throws Exception {

		// 방법1 - Scanner
		// 1. next()를 통해 String으로 입력받는다.
		// 2. String에서 char로 문자열을 잘라 문자로 변환한다.
		// 3. int타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
		// Scanner자체가 정규식을 남발하면서 좋지 않은 성능을 낸다.
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.next().charAt(0);
		
		System.out.println(ch);
		
		// 방법2 - System.in
		// System.in은 byte 값으로 문자 한 개만 읽으면서 
		// 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다.
		
		int a = System.in.read();
		System.out.println(a);
				
	}

}
