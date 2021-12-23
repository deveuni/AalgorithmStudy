package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15552
// 빠른 A+B

public class _15552 {

	public static void main(String[] args) throws IOException{

		// 방법 1 - BufferedWriter
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
		
		
		// 방법 2 - StringBuilder
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br2.readLine());
		
		StringTokenizer st2;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			st2 = new StringTokenizer(br2.readLine()," ");
			sb.append(Integer.parseInt(st2.nextToken()) +  Integer.parseInt(st2.nextToken())).append('\n');
		}
		br2.close();
		
		System.out.println(sb);
		
	}

}
