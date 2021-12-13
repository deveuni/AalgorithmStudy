package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10950
// A+B-3

public class _10950 {

	public static void main(String[] args) throws IOException {

		// 방법1 
		/*
		Scanner sc = new Scanner(System.in);
		
		int c =  sc.nextInt();
		int arr[] = new int[c];
		
		for(int i=0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
		*/
		
		// 방법 2 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		// * StringBuilder 사용 이유
		// => 배열을 따로 생성하여 저장하다가 다시 출력하는 방식보다는
		// => StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한번에 출력하므로 
		
		// * StringTokenizer를 for문 안에 선안하는 이유 
		// => StringTokenizer은 문자열을 분리시켜주는 역할을 하는데 
		// => 입력은 한 줄 씩 읽어오게 되므로 매 반복문마다 새롭게 StringTokenizer을
		// 선언하면서 분리시켜줄 문자를 받아오므로
		
		
		
	}

}
