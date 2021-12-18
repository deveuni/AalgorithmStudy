package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11021
// A+B-7

public class _11021 {

	public static void main(String[] args) throws IOException {

		// 방법 1
		/*
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a + b));
			
			sc.close();
		}
		*/
		
		// 방법 2 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		//StringTokenizer st;
		
		// 방법 2 -1 
		/*
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			System.out.println("Case #" + i + ": "
					+(Integer.parseInt(st.nextToken())
					+Integer.parseInt(st.nextToken())));
		}
		*/
		
		// 방법 2-2 StringBuilder
		/*
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');	
		}
		br.close();
		*/
		
		// 방법 2-3 CharAt()
		for(int i = 1; i <= T; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
		System.out.println(sb);
	}

}
