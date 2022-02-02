package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2908
// 상수

// 해설 참조
// https://st-lab.tistory.com/66

public class _2908 {

	public static void main(String[] args) {

		// 방법1 - Scanner + StringBuilder.reverse()
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		// append() => 넣어진 값을 타입이 StringBuilder 라는 타입으로 변환된다.
		// reverse() => 저장되어있던 문자열을 뒤집는다.
		// toString() => StringBuilder 타입을 문자열로 변환시킨다.
		// 문자열로 반환시켰으니 Integer.paseInt()로 String을 int로 변경
		
		
		System.out.println(A > B ? A : B);
		
		// 방법2 - BufferedReader + StringBuilder.reverse()
		// 방법3 - System.in.read() + 수학연산
		
	}

}
