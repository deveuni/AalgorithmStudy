package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14681
// 사분면 고르기

public class _14681 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if(X > 0) {
			if(Y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(Y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
			
	}

}
