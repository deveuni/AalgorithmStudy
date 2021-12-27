package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10952
// A+B-5
// 입력의 종료는 더이상 읽을 수 있는 데잍 (EOF)가 없을 때 종료한다.


public class _10952 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringBuilder sb = new StringBuilder();
		
		// 방법 1
		StringTokenizer st;
		while(true) {
		
			st = new StringTokenizer(br.readLine()," ");
		
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
		
		
		// 방법 2 
		while(true) {
			
			String str = br.readLine();
			
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			
			if(a==0 && b==0) {
				break;
			}
			
			sb.append((a+b)).append('\n');
		}
		System.out.println(sb);
		
	}

}
