package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10952
// A+B-5



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
