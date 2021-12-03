package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2588
// 곱셈 
// 두번째 입력값을 어떻게 분리해주어야 하냐의 문제 
// 1. 문자열로 입력받아 charAt()으로 하나씩 꺼내 쓰는 방법
// 2. 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
// 3. 문자열을 character 배열로 한자리씩 넣어주어 이용하는 방법
// 참고 출처 : https://st-lab.tistory.com/20
public class _2588 {

	public static void main(String[] args) throws IOException {
		
		// 방법 1
		/*Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String B = sc.next();
		
		sc.close();
		
		
		System.out.println(A *(B.charAt(2) - '0'));
		System.out.println(A *(B.charAt(1) - '0'));
		System.out.println(A *(B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
		*/
		
		// charAt() 
		// 문자열의 인덱스 위치에 있는 문자(Character) 값을 반환한다.
		// 반환되는 값은 아스키코드값인 문자(char)이다.
		// 따라서 각각의 문자열 인덱스를 참조한 뒤 -'0'을 해주는 이유 또한 
		// 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것
		
		
		// 방법 2 
		
		/*Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
		*/
		
		// 방법 3
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		char[] b = B.toCharArray();
		// toCharArray() 
		// => 문자열을  char 배열 형태로 반환해주는 메소드 
		// => 즉, character 배열로 만들어 준 뒤에 하나씩 배열에서 꺼내서 쓰는 방법.
		// => 문자열 길이가 가변적으로 입력할 때, 문자 하나씩 참조해야할 때 매우 유용하다.
		
		
		System.out.println(A * (b[2]='0'));
		System.out.println(A * (b[1]='0'));
		System.out.println(A * (b[0]='0'));
		System.out.println(A * Integer.parseInt(B));
		
		
		
	}

}
