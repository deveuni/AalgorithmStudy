package baekjoon;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10951
// A+B-4
//입력의 종료는 더이상 읽을 수 있는 데잍 (EOF)가 없을 때 종료한다.

public class _10951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		// 방법 1 
		while( (str = br.readLine()) != null) {
			
			st = new StringTokenizer(str," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
			
		}
		
		System.out.print(sb);
		
		
		// 방법2 
		while( (str=br.readLine()) != null) {
			
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}

}
