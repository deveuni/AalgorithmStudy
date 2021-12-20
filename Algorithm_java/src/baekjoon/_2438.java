package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2438
// 별찍기 - 1

public class _2438 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1; i <= N; i++) {
			for(int j=1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
