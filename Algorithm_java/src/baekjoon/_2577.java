package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2577
// 숫자의 개수

// Integer.toString()
// => int형을 String으로 타입을 변환시킨다.

public class _2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		// 방법 1 
		/*
		Scanner in = new Scanner(System.in);
 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		// 첫번째 for문은 0~9까지 각가의 수를 검사할 반복문이다.
		// 그리고 count로 개수를 카운트 하기 위한 변수를 0으로 초기화 한 후, 
		// 이중 for문을 통해 str의 길이만큼 모든 요소를 검사한다. 
		// charAt()을 통해  해당 인덱스의 문자와 i가 같은 수가 몇개 있는지
		// 보며 만약 같을 경우 count를 +1 증가시킨다.

		*/
		
		// 방법 2 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(val);
		// val의 Int형을 String 형으로 변환해준 뒤 
		
		for(int i=0; i < str.length(); i++) {
			arr[(str.charAt(i)-48)]++;
		}
		// for문을 통해 해당 문자열의 문자값 -48을 추출해내서 int배열의 index 값을 1 증가시킨다?????
		
		for(int v : arr) {
			System.out.println(v);
		}
	}

}
