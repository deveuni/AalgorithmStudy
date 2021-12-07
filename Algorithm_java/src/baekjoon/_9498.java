package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9498
// 시험 성적

public class _9498 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int score = Integer.parseInt(str[0]);
		
		/*
		if(90 <= score && score <= 100) {
			System.out.println("A");
		} else if(80 <= score && score <= 89) {
			System.out.println("B");
		} else if(70 <= score && score <= 79) {
			System.out.println("C");
		} else if(60 <= score && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		*/
		
		// 삼항연산자
		System.out.println((score>=90)? "A":(score>=80)? "B":(score>=70)?"C":(score>=60)?"D":"F");
		
		
	}

}
