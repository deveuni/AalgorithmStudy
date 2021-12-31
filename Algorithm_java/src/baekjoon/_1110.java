package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1110
// 더하기 사이클

public class _1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
		
		
		
	}

}
