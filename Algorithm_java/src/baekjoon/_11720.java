package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11720
// 숫자의 합

public class _11720 {

	public static void main(String[] args) throws IOException {

		
		// 방법 1 - Scanner, 배열O
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String a = in.next(); // 숫자를 문자열(String)으로 입력 받는다.
		
		in.close();
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += a.charAt(i)-'0';
			//charAt()은 해당 문자의 아스키코드 값을 반환하므로 
			// 반드시 -48 또는 '0'을 해주어야 입력받은 숫자 값 그래도 사용할 수 있다.
			   
		}
		System.out.println(sum);
		
		
		// 방법 2 - BufferedReader, 배열X
		// getBytes() : 문자열을 입력받을 때 해당 문자열을 쉽게 각 자릿값으로 반환받을 수 있다.
		//              => String(문자열)에 대하여 해당 문자열의 하나의 byte 배열로 변환해준다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();  // N은 필요없어서 입력만 받음
		
		int sum2 = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0'); // 또는 (a-48)
			// readLine()으로 읽어들인 문자를 byte[]로 변환하여 반환하므로
			// for-each 구문을 통해 문자열의 문자를 하나씩 읽어들인다.
			// UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48을 빼주어야함
		}
		
		System.out.println(sum2);
	}

}
