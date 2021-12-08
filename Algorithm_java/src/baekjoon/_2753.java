package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2753
// 윤년

public class _2753 {

	public static void main(String[] args) throws IOException {

		/*
		 1-1 단계 : 4의 배수일 경우 - if ( year%4==0 )

		    2-1 단계 : 4의 배수이면서 400의 배수일 경우 - if ( year%400 == 0 )

		    2-2 단계 : 4의 배수이면서 100의 배수일 경우 - else if ( year%100 == 0 )

		    2-3 단계 : 2단계 조건식 나머지 - else

		 1-2 단계 : 1 단계 조건식 나머지 - else
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int y = Integer.parseInt(st.nextToken());
		
		/*
		if(y%4==0) { // 4의 배수일 경우 
			if(y%400==0) System.out.println("1"); // 4의 배수 이면서 400의 배수일 경우
			else if(y%100==0) System.out.println("0"); // 4의 배수 이면서 100의 배수일 경우
			else System.out.println("1"); // 4의 배수이면서 400의 배수, 100의 배수가 아닐 경우?
		} else {
			System.out.println("0");
		}
		*/
		
		// 삼항 중첩 연산자 
		System.out.println((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
		
		
	}

}
