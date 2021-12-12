package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2739
// 구구단

public class _2739 {

	public static void main(String[] args) throws IOException {

		// 방법 1 Scanner
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=9; i++) {
			System.out.println(N + " * " + i + " = "  + N*i);
		}
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		br.close();
		
		// 방법 2 
		/*
		for(int i=1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		*/
		
		// 방법 3
		/*
		StringBuilder sb = new StringBuilder();
		
		for(int i =1; i<10; i++) {
			sb.append(a).append(' ').append('*').append(' ').append(i);
			sb.append(' ').append('=').append(' ').append(a*i).append('\n');
		}
		System.out.println(sb);
		*/
		
		// 방법 4
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<10;i++) {
			bw.write(a+" * "+i+" = "+a*i+"\n");
		}
		bw.flush();
		bw.close();
		
		
	}

}
