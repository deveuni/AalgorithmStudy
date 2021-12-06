package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1330
// 두 수 비교하기

public class _1330 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		/*
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		*/
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
		
	}

}
