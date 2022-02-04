package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2908
// 상수

// 해설 참조
// https://st-lab.tistory.com/66

public class _2908 {

	public static void main(String[] args) throws IOException {

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int C = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int D = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		// Scanner을 사용했을 때는 int 타입으로 받았기 때문에 객체를 생성할 때 append() 메소드를 썼지만
		// 넣어주는 인자를 String 타입이면 append()를 사용할 필요가 없다.
		
		System.out.println(C > D ? C:D);
		
		
		// 방법3 - System.in.read() + 수학연산
		
		int E = 0;
		int F = 0;
		
		E += System.in.read() - 48;
		E += (System.in.read() - 48)*10;
		E += (System.in.read() - 48)*100;
		
		System.in.read(); // 공백
		
		F += System.in.read() - 48;
		F += (System.in.read() - 48)*10;
		F += (System.in.read() - 48)*100;
		
		System.out.println(E > F ? E : F);
		
	}

}
