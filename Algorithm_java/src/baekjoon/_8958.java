package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/8958
// OX퀴즈

// 1. 각 케이스마다 점수를 출력한다.
// 2. O의 연속 개수 만큼 점수를 누적하여 합산하고 X가 나오면 누적값은 0으로 초기화한다.

public class _8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 방법 1 - 배열이용 
		/*
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[sc.nextInt()];
		
		for(int i=0; i < arr.length; i++) {
			// String배열 arr의 각각의 원소에 문자열을 저장해준다.
			arr[i] = sc.next();
			
		}
		
		sc.close();
		
		for(int i=0; i < arr.length; i++) {
			
			int cnt = 0; // 연속 횟수
			int sum = 0; // 누적 합산
			
			for(int j=0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		*/
		
		// 방법2 - 배열 X
		// getBytes() => 입력 문자열을 byte 단위의 '배열'로 반환시켜주는 메소드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine()); 
		
		for(int i=0; i < test_case; i++) {
			
			int cnt = 0; 
			int sum = 0;
			
			// 1. br.readLine()은 한줄을 문자열로 입력 받는다.
			// 2. getBytes()는 입력받은 문자열을 byte형 배열로 반환한다.
			// 3. 즉, 위의 for-each문은 입력을 한 줄 받으면 해당 문자열의 길이만큼 반복하면서
			// 해당 문자열의 문자를 하나씩 value에 저장하여 꺼내오는 것.
			
			for(byte value : br.readLine().getBytes()) {
				
				if(value == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			
			sb.append(sum).append('\n');
			
		}
	}

}
