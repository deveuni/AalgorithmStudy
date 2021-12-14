package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/8393
// 합

public class _8393 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
